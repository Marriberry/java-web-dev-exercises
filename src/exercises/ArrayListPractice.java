package exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice {
//    public static void main(String[] args) {
//        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        double newSum = 0;
//        for(int i: nums){
//            if(nums[i] % 2 == 0) {
//                newSum += nums[i];
//            }
//            System.out.println(newSum);
//        }
//    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int total = 0;

        for (int integer : arr) {
            if (integer % 2 == 0) {
                total += integer;
            }
        }
        System.out.println(total);
    }
}
