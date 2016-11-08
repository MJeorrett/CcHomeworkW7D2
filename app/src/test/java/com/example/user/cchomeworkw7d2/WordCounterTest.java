package com.example.user.cchomeworkw7d2;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 08/11/2016.
 */

public class WordCounterTest {

    HashMap<String, Integer> expectedHashMap;

    @Before
    public void before() {

        this.expectedHashMap = new HashMap<String, Integer>();
    }

    @Test
    public void simpleCountEmptyString() {
        assertEquals( 0, WordCounter.simpleCountWords( "" ) );
    }

    @Test
    public void simpleCountOneWord() {
        assertEquals( 1, WordCounter.simpleCountWords( "one" ) );
    }

    @Test
    public void simpleCountMultipleWords() {
        assertEquals( 4, WordCounter.simpleCountWords( "There are multiple words" ) );
    }

    @Test
    public void advancedCountEmptyString() {
        assertEquals( null, WordCounter.advancedCountWords( "" ) );
    }

    @Test
    public void advancedCountOneWord() {

        expectedHashMap.put( "test", 1 );

        assertEquals( expectedHashMap, WordCounter.advancedCountWords( "test" ) );
    }

    @Test
    public void advancedCountMultipleWords() {
        String testString = "three times three is three, no only kidding it is nine ";

        expectedHashMap.put( "three", 3 );
        expectedHashMap.put( "times", 1 );
        expectedHashMap.put( "is", 2 );
        expectedHashMap.put( "no", 1 );
        expectedHashMap.put( "only", 1 );
        expectedHashMap.put( "kidding", 1 );
        expectedHashMap.put( "it", 1 );
        expectedHashMap.put( "nine", 1 );

        assertEquals( expectedHashMap, WordCounter.advancedCountWords( testString ) );
    }
}
