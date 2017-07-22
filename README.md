## Stream - Find First Vowel

Sample that find the first char vowel, after a consonant, where it is predecessor to a vowel and does not repeat itself in the rest of the stream.

Using the Stream interface methods:

```
public boolean hasNext() {
    return position < input.length();
}

public char getNext() {
    char ret = chars[position];
    position++;
    return ret;
}
 ```
 
### Running

Execute the java main function on class `StreamFindFirstVowel`.
 
 
