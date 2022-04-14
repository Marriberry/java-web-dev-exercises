package exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args) {

        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);
        myList.add(6);
        myList.add(7);
        myList.add(8);
        myList.add(9);
        myList.add(10);

        System.out.println(evenAdd(myList));
        String textExample = "Write a static method to print out each word in a list that has exactly 5 letters.";
        System.out.println(fiveLetterWords(textExample));

    }
    public static int evenAdd (ArrayList<Integer> arr) {
        int total = 0;
        for (int integer : arr) {
            if (integer % 2 == 0) {
                total += integer;
            }
        }
        return total;
    }

    public static ArrayList<String> fiveLetterWords(String word){
        Scanner input = new Scanner(System.in);
        System.out.println("What length of word would you like to print?");
        int number = input.nextInt();
        input.close();

        String[] splitArray = word.split(" ");
        ArrayList<String> myList = new ArrayList<>();

        for (String s : splitArray) {
            if (s.length() == number) {
                myList.add(s);
            }
        }
        return myList;
    }
}

//        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        int total = 0;
//
//        for (int integer : arr) {
//            if (integer % 2 == 0) {
//                total += integer;
//            }
//        }
//        System.out.println(total);
//    }
