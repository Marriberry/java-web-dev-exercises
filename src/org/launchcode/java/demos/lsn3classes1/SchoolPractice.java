package org.launchcode.java.demos.lsn3classes1;

public class SchoolPractice {

    public static void main(String[] args) {
        // Instantiate your Student class for part 2 here!
        Student myself = new Student("Jake", 123, 1, 4.0);
        System.out.println(myself.studentInfo());
        myself.setGpa(3.8);
        System.out.println(myself.studentInfo());
        System.out.println(myself.getName());
    }
}
