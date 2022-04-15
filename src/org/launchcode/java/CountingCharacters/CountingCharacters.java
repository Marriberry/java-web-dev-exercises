package org.launchcode.java.CountingCharacters;

import java.util.*;

public class CountingCharacters {
    public static void main(String[] args) {
        HashMap<Character, Integer> charCount = new HashMap<>();
        String quote;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your quote:");
        quote = input.nextLine().toLowerCase().replace(" ", "");
        char[] charactersInString = quote.toCharArray();

        for(char c : charactersInString) {
            if(charCount.containsKey(c)) {
                charCount.put(c, charCount.get(c) +1);
            } else {
                charCount.put(c, 1);
            }
        }
        System.out.println(charCount);
    }
}
