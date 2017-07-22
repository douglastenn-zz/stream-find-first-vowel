package com.douglastenn.util;

import com.douglastenn.exception.NotFoundCharException;
import com.douglastenn.stream.impl.StreamImpl;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.core.IsEqual.equalTo;

public class StreamUtilTest {

    private StreamUtil streamUtil = new StreamUtil();

    @Test
    public void test_firstVowel_withEndedVowel() {
        StreamImpl stream = new StreamImpl("aAbBABacafe");
        char c = this.streamUtil.findFirstVowel(stream);
        assertThat(c, equalTo('e'));
    }

    @Test
    public void test_firstChar_Succeed() {
        StreamImpl stream = new StreamImpl("aAbBEeEyiEeooO");
        char c = this.streamUtil.findFirstVowel(stream);
        assertThat(c, equalTo('i'));
    }

    @Test(expected = NotFoundCharException.class)
    public void test_firstChar_WithOnlyConsonant() {
        StreamImpl stream = new StreamImpl("yyyyyyyyyyyyyyyyy");
        char c = this.streamUtil.findFirstVowel(stream);
    }

    @Test(expected = NotFoundCharException.class)
    public void test_firstChar_withEmptyString() {
        StreamImpl stream = new StreamImpl("");
        char c = this.streamUtil.findFirstVowel(stream);
    }
}