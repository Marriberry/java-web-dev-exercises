package org.launchcode.java.demos.lsn3classes1;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

import java.util.Objects;

public class Student {

    private static int nextStudentId = 1;
    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public Student(String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) {
        this(name, studentId, 0, 0);
    }

    public Student(String name) {
        this(name, nextStudentId);
        nextStudentId++;
    }

    public String studentInfo() {
        return (this.name + " StudentID: " + this.studentId + " has a GPA of: " + this.gpa + " and has taken " + this.numberOfCredits + " credit hours.");
    }

    public void setNextStudentID(int nextStudentId) {
        this.nextStudentId = nextStudentId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    private void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

    public int getNextStudentId(){
        return nextStudentId;
    }

    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public double getGpa() {
        return gpa;
    }

    public static String getGradeLevel(int numberOfCredits) {
        if (numberOfCredits <= 29){
            return "Freshman";
        } else if (numberOfCredits <= 59){
            return "Sophomore";
        } else if (numberOfCredits <= 89) {
            return "Junior";
        } else {
            return "Senior";
        }
    }

    public void addGrade(int numberOfCredits, double grade) {
        double totalQualityScore = this.gpa * this.numberOfCredits;
        totalQualityScore += numberOfCredits * grade;
        this.numberOfCredits += numberOfCredits;
        this.gpa = totalQualityScore / this.numberOfCredits;
    }

    @Override
    public String toString() {
        return name + " (" + getGradeLevel(numberOfCredits) + " with " + getNumberOfCredits() + " credits and a GPA of " + getGpa() + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studentId == student.studentId && numberOfCredits == student.numberOfCredits && Double.compare(student.gpa, gpa) == 0 && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, studentId, numberOfCredits, gpa);
    }
}