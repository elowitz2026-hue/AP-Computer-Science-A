/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.course;

/**
 *
 * @author ELowitz2026
 */

public class Course {
    //Instance variables
    private String courseTitle;
    private String courseCode;
    private int pointsTotal;
    private String instructorName;

    //Full Constructor
    public Course (String courseTitle, String courseCode, int pointsTotal, String instructorName) {
        this.courseTitle = courseTitle;
        this.courseCode = courseCode;
        this.pointsTotal = pointsTotal;
        this.instructorName = instructorName;
}
    //Constructor with only title
    public Course (String courseTitle) {
        this.courseTitle = courseTitle;
        this.courseCode = "";
        this.pointsTotal = 0;
        this.instructorName = "";
}
    //Getters (accessor)
    public String getCourseTitle() {return courseTitle;}
    public String getCourseCode() {return courseCode;}
    public int getPointsTotal() {return pointsTotal;}
    public String getInstructorName() {return instructorName;}
    
    //Setters (mutator)
    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;}
    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;}
    public void setPointsTotal(int pointsTotal) {
        this.pointsTotal = pointsTotal;}
    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;}

    //toString method
    @Override
    public String toString() {
        return "Course Title: " + courseTitle + "\n" + 
                "Course Code: " + courseCode + "\n" + 
                "Total Points: " + pointsTotal + "\n" +
                "Instructor's Name: " + instructorName + "\n";
    }
}
 
    //Driver class (not public - not file name)
    class CourseDetails {
         public static void main(String[] args) {
             //Using full constructor - commas separate parameters
             Course course1 = new Course("Computer Science", "AP CS A", 3, "Mr. Nelson");
             
             //Title-only constructor + setters
             Course course2 = new Course("Calculus");
             course2.setCourseCode("AP Calculus BC");
             course2.setPointsTotal(4);
             course2.setInstructorName("Mr. Dahms");
             
             //More examples
             Course course3 = new Course("Religion", "Campus Ministry 12", 5, "Mr. Martinez");
             Course course4 = new Course("History", "American Government ", 2, "Mrs. Martinez");
             Course course5 = new Course("Physics", "AP Physics 1", 3, "Mrs. Rafie");
             
             Course course6 = new Course("English");
             course6.setCourseCode("AP Literature & Composition");
             course6.setPointsTotal(5);
             course6.setInstructorName("Mrs. Carlson");
             
             Course course7 = new Course("Engineering");
             course7.setCourseCode("STEAM Capstone & Practicum");
             course7.setPointsTotal(4);
             course7.setInstructorName("Mr. Knoll");
             
             //Print course info (toString method)
             System.out.println(course1.toString());
             System.out.println(course2.toString());
             System.out.println(course3.toString());
             System.out.println(course4.toString());
             System.out.println(course5.toString());
             System.out.println(course6.toString());
             System.out.println(course7.toString());
    
   }      
}