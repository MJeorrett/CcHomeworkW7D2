package com.example.user.cchomeworkw7d2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 08/11/2016.
 */

public class WordCounterTest {

    @Test
    public void emptyString() {
        assertEquals( 0, WordCounter.countWords( "" ) );
    }

    @Test
    public void oneWord() {
        assertEquals( 1, WordCounter.countWords( "one" ) );
    }

    @Test
    public void multipleWords() {
        assertEquals( 4, WordCounter.countWords( "There are multiple words" ) );
    }
}
