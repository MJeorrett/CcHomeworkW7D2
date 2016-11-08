package com.example.user.cchomeworkw7d2;

/**
 * Created by user on 08/11/2016.
 */

public class WordCounter {

    public static int simpleCountWords(String text) {

        if (text == "") {
            return 0;
        }

        return text.split("\\s+").length;
    }
}
