package PoD;

import java.util.Scanner;

public class PoD43ReversedStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        char[] word1 = new char[word.length()];
        for (int i = 0; i < word.length(); i++) {
            word1[word.length()-1-i]=word.charAt(i);
        }
        for (char c : word1) {
            System.out.print(c);
        }
    }
}
