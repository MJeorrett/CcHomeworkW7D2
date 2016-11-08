package com.example.user.cchomeworkw7d2;

import java.util.HashMap;

/**
 * Created by user on 08/11/2016.
 */

public class WordCounter {

    public static int simpleCountWords( String text ) {

        if ( text.isEmpty() ) {
            return 0;
        }

        String[] words = WordCounter.getWordsFromString( text );
        return words.length;
    }

    public static HashMap<String, Integer> advancedCountWords( String text ) {

        if ( text.isEmpty() ) {
            return null;
        }

        String[] words = WordCounter.getWordsFromString( text );
        HashMap<String, Integer> wordsCount = new HashMap<String, Integer>();

        for ( String word : words ) {

            Integer newCount = 1;

            if ( wordsCount.containsKey( word ) ) {
                Integer existingCount = wordsCount.get( word );
                newCount = existingCount + 1;
            }

            wordsCount.put( word, newCount );
        }

        return wordsCount;
    }

    private static String[] getWordsFromString( String string ) {

        String cleanString = string.replaceAll( "[,.]", "" );
        String[] words = cleanString.split( "\\s+");
        return words;
    }
}
