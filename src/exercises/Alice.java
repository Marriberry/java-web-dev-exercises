package exercises;

import java.util.Locale;
import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        String firstSentence = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        Scanner input;
        String userInput;

        input = new Scanner(System.in);
        System.out.println("Please enter a word to search: ");
        userInput = input.next();
        if(firstSentence.toLowerCase().contains(userInput.toLowerCase())) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        Integer index = firstSentence.toLowerCase().indexOf(userInput.toLowerCase());
        Integer length = userInput.length();
        System.out.println("Your search term first appears at index " + index + ". Your term is " + length + " characters long.");
        String modifiedSentence = firstSentence.replace(userInput, "Beep");
        System.out.println(modifiedSentence);
        input.close();
    }
}
