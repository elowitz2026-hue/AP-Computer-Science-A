/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.todolist;

/**
 *
 * @author ELowitz2026
 */
public class ToDoList {

    public static void main(String[] args) {

        /* Notes:
        - College Apps (t3), Homework (t1), Workout (t2), Clean room (t4), Do laundry (t5) - list in that order
        - Compare t3 to t1; t1 to t2; t2 to t4; t4 to t5
        - College Apps comes before Homework, Homework comes before Workout, etc
        */
        
        // Create Task objects
        Task t1, t2, t3, t4, t5;
        
        t1 = new Task("Homework");
        t1.setPriority(2); // Set priority to 2
        t1.setComplexity(5); // Set complexity to 5
        
        t2 = new Task("Workout");
        t2.setPriority(3); // Set priority to 3
        t2.setComplexity(4); // Set complexity to 4
        
        t3 = new Task("College Apps"); 
        t3.setPriority(1); // Set priority to 1
        t3.setComplexity(8); // Set complexity to 8
        
        t4 = new Task("Clean room");
        t4.setPriority(4); // Set priority to 4
        t4.setComplexity(2); // Set complexity to 2
            // t4 & t5 have same priority 
        t5 = new Task("Do laundry");
        t5.setPriority(4); // Set priority to 4
        t5.setComplexity(4); // Set complexity to 4
        
        // Compare t3 and t1 and print which one should come first
        if (t3.compareTo(t1) > 0)
            System.out.println(t1 + " comes before " + t3);
        else
            System.out.println(t3 + " comes before " + t1);
        
        // Compare t1 and t2 and print which one comes first
        if (t1.compareTo(t2) > 0)
            System.out.println(t2 + " comes before " + t1);
        else 
            System.out.println(t1 + " comes before " + t2);
        
        // Compare t2 and t4 and print which one comes first
        if (t2.compareTo(t4) > 0)
            System.out.println(t4 + " comes before " + t2);
        else 
            System.out.println(t2 + " comes before " + t4);
        
        // Compare t4 and t5 and print which one comes first
            // Same priority - larger complexity comes first 
        if (t4.compareTo(t5) > 0)
            System.out.println(t4 + " comes before " + t5);
        else 
            System.out.println(t5 + " comes before " + t4);
    } 
}

// Task class represents a to-do item
// Implements Priority, Complexity, and Comparable so tasks can be compared
class Task implements Priority, Complexity, Comparable<Task> {
    private final String name; // Name of the task
    private int priority; // Priority level of the task
    private int complexity; // Complexity level of the task
    
    // Constructor to create a task with a name
    public Task(String taskName) {
        name = taskName;
        priority = 1; // Default priority
        complexity = 1; // Default complexity 
    }
    
    // Set the priority of the task
    public void setPriority(int p) {
        priority = p;
    }
    
    // Get the priority of the task
    public int getPriority() {
        return priority;
    }
    
    // Set the complexity of the task
    public void setComplexity(int c) {
        complexity = c;
    }
    
    // Get the complexity of the task
    public int getComplexity() {
        return complexity;
    }
    
    // Compare this task to another task (arithmetic operator to compare)
    // First by priority, then by complexity if priorities are equal
    public int compareTo(Task other) {
        if (priority != other.priority) // Relational operator "!=" - boolean not equal to 
            return priority - other.priority;
        
        return complexity - other.complexity;
    }
    
    // Print the task nicely with its name, priority, and complexity
    public String toString() {
        return name + " (Priority: " + priority + ", Complexity: " + complexity + ")";
    } 
}

    // Interface to handle prioriy methods
    interface Priority {
        public void setPriority(int p);
        public int getPriority();
    }

    // Interface to handle complexity methods
    interface Complexity {
        public void setComplexity(int c);
        public int getComplexity();
    }