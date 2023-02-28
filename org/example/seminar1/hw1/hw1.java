//Given an input string s, reverse the order of the words.
//A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.
//Return a string of the words in reverse order concatenated by a single space.

package org.example.seminar1.hw1;

import java.util.Scanner;

public class hw1 {
    public static void main(String[] args) {
        System.out.println("Введите текст: ");
        try (Scanner scanner = new Scanner(System.in)) {
            String str = scanner.nextLine();
            System.out.println(reverseWords(str));
        }
    }

    public static String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            if (i > 0) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}