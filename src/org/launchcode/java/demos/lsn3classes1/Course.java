package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;
import java.util.Objects;

public class Course {
    private String courseTitle;
    private String courseTeacher;
    private ArrayList<Student> courseStudents;

    @Override
    public String toString() {
        return "Course{" +
                "courseTitle='" + courseTitle + '\'' +
                ", courseTeacher='" + courseTeacher + '\'' +
                ", courseStudents=" + courseStudents +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return Objects.equals(courseTitle, course.courseTitle) && Objects.equals(courseTeacher, course.courseTeacher) && Objects.equals(courseStudents, course.courseStudents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(courseTitle, courseTeacher, courseStudents);
    }
}
