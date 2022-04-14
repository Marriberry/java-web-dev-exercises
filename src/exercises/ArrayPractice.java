package exercises;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] integerArray = {1, 1, 2, 3, 5, 8};

        for(int number : integerArray) {
            if(number % 2 == 0) {
            } else {
                System.out.println(number);
            }
        }

        String phrase = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] words = phrase.split(" ");
        for(int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }

        String[] sentences = phrase.split("\\.");
        for(int i = 0; i < sentences.length; i++) {
            System.out.println(sentences[i]);
        }
    }
}