package org.demo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        String input = "Hello and welcome!";
        StringBuilder sb = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            char result = input.charAt(i);
            sb.append(result);
        }
        System.out.println(sb);
    }

    public static void reverseWordInArray() {
        List<String> listOfWords = Arrays.asList("Hello", "and", "welcome!");
        System.out.println(listOfWords.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));
        StringBuilder sbr = new StringBuilder();
        for (int i = 0; i <= listOfWords.size() - 1; i++) {
            String word = listOfWords.get(i);
            for (int j = word.length() - 1; j >= 0; j--) {
                sbr.append(word.charAt(j));
            }
            sbr.append(" ");
        }
        System.out.println(sbr);
    }
}