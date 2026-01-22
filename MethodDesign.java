/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.methoddesign;

/**
 *
 * @author ELowitz2026
 */

// Driver class
public class MethodDesign {

    public static void main(String[] args) {

    // Create Student object using constructor with first & last name
       Student st1 = new Student("Emily", "Lowitz");
       Student st2 = new Student("Bob", "Smith");

    // Set test scores for each of three courses
    // Index represents which course (0 = first, 1 = second, 2 = third)
       st1.setCourseScore(0, 85);
       st1.setCourseScore(1, 90);
       st1.setCourseScore(2, 88);
       
       st2.setCourseScore(0, 80);
       st2.setCourseScore(1, 95);
       st2.setCourseScore(2, 77);

    // Print out all student information
       System.out.println(st1);
       System.out.println();
       System.out.println(st2);
    }
}

// Student Class - print first/last name + 3 courses
class Student {
    private String firstName, lastName;

// Array of Course objects - don't need java.util.Array<>
    // Models UML relationship: Student has 3 Courses
    private Course[] courses;

// Empty constructor - creates student w/no name & initializes 3 empty courses (StudentMain reference)
    public Student() {
        firstName = "";
        lastName = "";

// Create an array w/3 slots
        courses = new Course[3];

// Initialize each course in array (researched) 
        for (int i = 0; i < courses.length; i++) { // Start at first slot & keep going until the end
            courses[i] = new Course(); // At current position (i), create new instance of Course class
        }
    }

// Constructor w/first & last name
    public Student(String first, String last) {
        firstName = first;
        lastName = last;
        
// Create array to store exactly 3 courses
        courses = new Course[3];

// Fill each position in array w/Course object
        for (int i = 0; i < courses.length; i++) {
            courses[i] = new Course();
        }
    }

// Sets test score for specific course
// Index tells which course, score = test score
    public void setCourseScore(int index, int score) {
        courses[index].setScore(score);
    }

// Gets test score for specific course
    public int getCourseScore(int index) {
        return courses[index].getScore();
    }

// Calculates average test score across all courses
    public double getAverage() { // Round decimal
        int total = 0;

// Loop through courses array & add up scores
        // Enhanced for loop to iterate over array (code suggestion)
        for (Course course : courses) {
            total += course.getScore();
        }

// Divide by number of courses (3)
        return total / 3.0; // 3.0 more efficient (double)
    }

// Display all student information
    @Override
    public String toString() {
        String result = firstName + " " + lastName + "\n";

// Loop through courses to display each score (researched operators)
        for (int i = 0; i < courses.length; i++) {
            result += "Course " + (i + 1) + " Score: " + courses[i].getScore() + "\n";
        }

// Add average score at the end
        result += "Average Score: " + getAverage();
        return result;
    }
}


// Course Class - represents single course w/one test score
class Course {

    // Test score starts at 0
    private int score = 0;

    // Sets test score
    public int setScore(int inScore) {
        score = inScore;
        return score;
    }

    // Returns test score
    public int getScore() {
        return score;
    }
}

/*

Planning: (also in UML)

- The program uses three classes: StudentMain, Student, and Course.
- The Student class has a composition relationship with the Course class,
  meaning a Student contains multiple Course objects.
- Courses are stored in an array to keep them organized and easy to loop through.
- Each Student is designed to always have exactly three courses.
- Constructors ensure all objects are initialized correctly and test scores start at zero.
- Instance variables are private, while public methods control access.
- The Driver (main) class controls program flow by creating students,
  assigning scores, and displaying results.

*/


