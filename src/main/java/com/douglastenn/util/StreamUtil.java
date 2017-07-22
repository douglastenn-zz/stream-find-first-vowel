package com.douglastenn.util;

import com.douglastenn.exception.NotFoundCharException;
import com.douglastenn.stream.Stream;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;

import static java.util.stream.Collectors.toList;

public class StreamUtil {

    private static String VOWEL_VALUES = "[aeiouAEIOU]";

    public static char findFirstVowel(Stream input) throws NotFoundCharException {
        Set<Character> repeatedValues = new HashSet<>();
        List<Character> uniqueValues = new ArrayList<>();

        while (input.hasNext()) {
            Character next = input.getNext();
            next = Character.toLowerCase(next);
            if (!check(next, repeatedValues::contains)) {
                if (check(next, uniqueValues::contains)) {
                    repeatedValues.add(next);
                    uniqueValues.remove(next);
                } else {
                    uniqueValues.add(next);
                }
            }
        }

        List<Character> updatedValues =
                uniqueValues
                    .stream()
                    .filter(v -> isVowel(v) ? true : false)
                    .collect(toList());

        if (updatedValues.isEmpty()) throw new NotFoundCharException("Not possible find the specific char.");

        return updatedValues.get(0);
    }

    private static boolean isVowel(char value) {
        return String.valueOf(value).matches(VOWEL_VALUES);
    }

    private static <T> boolean check(T t, Predicate<T> predicate) {
        return predicate.test(t);
    }
}
