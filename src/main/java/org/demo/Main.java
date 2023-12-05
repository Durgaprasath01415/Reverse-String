package org.demo;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        String input = "Hello and welcome!";
        StringBuilder sb = new StringBuilder();
        for (int i = input.length()-1; i >= 0; i--) {
            char result = input.charAt(i);
            sb.append(result);
        }
        System.out.println(sb);
    }
}