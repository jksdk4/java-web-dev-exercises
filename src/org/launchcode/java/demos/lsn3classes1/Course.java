package org.launchcode.java.demos.lsn3classes1;

import java.util.HashMap;

public class Course {
    private String courseName;
    private int credits;
    private char grade;
    private HashMap<String, Integer> classCode = new HashMap<>();

    public Course(String courseName, int credits, String subject, Integer courseNum){
        this.courseName = courseName;
        this.credits = credits;
        this.classCode.put(subject,courseNum);
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credit){
        this.credits = credit;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = Character.toUpperCase(grade);
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public HashMap<String, Integer> getClassCode() {
        return classCode;
    }

    public void setClassCode(String subject, Integer courseNum) {
        this.classCode.put(subject,courseNum);
    }

//    public double updateGpaByCourse(Student student){
//        int creditNumerator;
//        int numOfCredits = student.getNumberOfCredits();
//        if (grade == 'A'){
//            creditNumerator = 4;
//        } else if (grade == 'B'){
//            creditNumerator = 3;
//        } else if (grade == 'C'){
//            creditNumerator = 2;
//        } else if (grade == 'D'){
//            creditNumerator = 1;
//        } else {
//            creditNumerator = 0;
//        }
//        // I don't know what the formula is so blah
////        double newGpa = ((creditNumerator * credits) + numOfCredits )/ numOfCredits;
////        return newGpa;
//    }

}
