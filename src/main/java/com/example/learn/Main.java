package com.example.learn;

public class Main {
    public static void main(String[] args) {
        String text = "";
        Anagram anagram = new Anagram();
        try {
            text = anagram.reverseText(text);
            System.out.println(text);
        }catch ( RuntimeException exception){
            System.out.println(exception.getMessage());
        }
    }
}
