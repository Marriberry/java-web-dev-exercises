package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newStudent;

        System.out.println("Enter your students (or ENTER to finish):");
        //Get student names and ID numbers

        do {
            System.out.print("Student: ");
            newStudent = input.nextLine();

            if(!newStudent.equals("")) {
                System.out.print("ID number: ");
                Integer newID = input.nextInt();
                students.put(newID, newStudent);

                input.nextLine();
            }
        } while(!newStudent.equals(""));
        input.close();

        // Print class roster
        System.out.println("\nClass roster:");
        for(Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println("(" + student.getKey() + "): " + student.getValue());
        }
        System.out.println("Roster number: " + students.size());
    }
}
