package com.douglastenn.stream.impl;

import com.douglastenn.stream.Stream;

public class StreamImpl implements Stream {
    private String input;
    private int position;
    private char chars[];

    public StreamImpl(String input) {
        this.input = input;
        this.chars = input.toCharArray();
    }

    @Override
    public boolean hasNext() {
        return position < input.length();
    }

    @Override
    public char getNext() {
        char ret = chars[position];
        position++;
        return ret;
    }
}
