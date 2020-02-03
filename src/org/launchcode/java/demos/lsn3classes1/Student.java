package org.launchcode.java.demos.lsn3classes1;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

import java.util.ArrayList;
import java.util.HashMap;

public class Student {

    private String name;
    private final int studentId;
    private int numberOfCredits;
    private double gpa;
    private ArrayList<HashMap<String, Integer>> coursesTaken = new ArrayList<>();

    // basic constructor for existing student
    public Student(String name, int studentId, int numberOfCredits, double gpa){
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }
//    // overloaded constructor for new student
//    public Student(String name, int studentId){
//        this.name = name;
//        this.studentId = studentId;
//        this.numberOfCredits = 0;
//        this.gpa = 0.0;
//    }

    // same as above comment-out but with fewer lines and calls itself
    public Student(String name, int studentId){
        // calls the basic constructor above (hence 'this()') and fills it in that way with set defaults
        this(name, studentId, 0,0);
    }

    public String getName(){
        return this.name;
    }

    private void setName(String aName){
        name = aName;
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

    public ArrayList<HashMap<String, Integer>> addCourseTaken(Course course) {
        coursesTaken.add(course.getClassCode());
        return coursesTaken;
    }
// disabling because i don't know how to calculate cumulative gpa yet :(
//    public double updateGpa(Course course){
//        double newGpa = course.updateGpaByCourse(this);
//        gpa = newGpa;
//        return gpa;
//    }

}