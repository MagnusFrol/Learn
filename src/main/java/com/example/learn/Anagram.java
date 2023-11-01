package com.example.learn;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Anagram {
    private static final String DELIMITER = " ";
    public String reverseText(String text) {
        if (text == null )  {
            throw new IllegalArgumentException("text cannot be null");
        }
        if (text.isEmpty()){
            throw new IllegalArgumentException("text cannot be empty");
        }
        String[] words = text.split(DELIMITER);

        return Arrays.stream(words)
                .map(this::reverseWord)
                .collect(Collectors.joining(DELIMITER));

    }

    private String reverseWord(String word) {
        char[] characters = word.toCharArray();

        int i = 0;
        int j = characters.length - 1;

        while (i < j) {
            if (Character.isLetter(characters[i]) && Character.isLetter(characters[j])) {
                char temp = characters[i];
                characters[i] = characters[j];
                characters[j] = temp;
                i++;
                j--;
            } else if (!Character.isLetter(characters[i])) {
                i++;
            } else {
                j--;
            }
        }

        return new String(characters);
    }
}

