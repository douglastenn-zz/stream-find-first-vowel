package com.douglastenn;

import com.douglastenn.exception.NotFoundCharException;
import com.douglastenn.util.StreamUtil;
import com.douglastenn.stream.impl.StreamImpl;

public class StreamFindFirstVowel {

    public static void main(String[] args) throws NotFoundCharException {
        StreamImpl stream = new StreamImpl("aAbBABacafe");
        char resultChar = new StreamUtil().findFirstVowel(stream);
        System.out.println(resultChar);
    }
}
