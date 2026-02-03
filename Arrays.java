/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arrays;

/**
 *
 * @author ELowitz2026
 */
public class Arrays {

    public static void main(String[] args) {

// Create and initialize array with all 7 days
    String [] weekDays = {
        "Monday", "Tuesday", "Wednesday", "Thursday",
        "Friday", "Saturday", "Sunday"
    };
    
// Print all days of the week
    System.out.println("All days:");
    for (int i = 0; i < weekDays.length; i++) {
        System.out.println(weekDays[i]);
    }
    
    System.out.println();
    
// RESIZING THE ARRAY - resize to 5 & copy only weekdays (Mon-Fri)
    String[] weekDaysResized = new String[5]; // New resized array - temporary
    
// Monday --> Friday
    for (int i = 0; i < weekDaysResized.length; i++) {
        weekDaysResized[i] = weekDays[i];    
    }
    
    weekDays = weekDaysResized; // Set working array to resized array
    
// Print weekdays only
    System.out.println("Weekdays only:");
    for (int i = 0; i < weekDays.length; i++) {
        System.out.println(weekDays[i]);
    }  
    
    }
}

/* NOTES:
    1) int i = 0 --> initialization (counter variable)
        Initializes loop to start at very beginning of array
    2) i < weekDays.length; --> Condition (if loop should continue running)
        How many elements it contains
    3) i++ --> Iteration
        Increments counter by one - loop moves to next element in array during subsequent iteration
*/