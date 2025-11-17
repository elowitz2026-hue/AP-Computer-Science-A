/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.stars;

/**
 *
 * @author ELowitz2026
 */
public class Stars {

    public static void main(String[] args) {
        
        final int MAX_ROWS = 10;
        
        // a. Inverted left-aligned triangle
        System.out.println("a.");
        for (int row = 1; row <= MAX_ROWS; row++) {
            
        //Print stars decreasing each row
        for (int star = 10; star >= row; star--){
        System.out.print("*");
            }
            System.out.println(); //Next line
        }
        
        
        // b. Right-aligned triangle
        System.out.println("\nb.");
        for (int row = 1; row <= MAX_ROWS; row++) {

            // Spaces on the left
            for (int space = 1; space <= MAX_ROWS - row; space++) {
                System.out.print(" ");
            }

            // Stars increasing each row
            for (int star = 1; star <= row; star++) {
                System.out.print("*");
            }
            System.out.println(); //Next line
        }
        
        
        // c. Inverted right-aligned triangle
        System.out.println("\nc.");
        for (int row = MAX_ROWS; row >= 1; row--) {
            
            // Spaces on the left
            for (int space = 1; space <= MAX_ROWS - row; space++) {
                System.out.print(" ");
            }
            
            // Stars decreasing each row
            for (int star = 1; star <= row; star++) {
                System.out.print("*");
            }
            System.out.println(); //Next line
        }
        
        
        // d. Diamond
        System.out.println("\nd.");
        
        int maxStars = 9; //Biggest width of the diamond

        // Top half (1 -> maxStars)
        for (int stars = 1; stars <= maxStars; stars +=2) {
            
            int spaces = (maxStars - stars) / 2; //Center diamond
            
            // Print spaces
            for (int s = 0; s < spaces; s++) {
                System.out.print(" ");
            }
            
            // Print stars
            for (int st = 0; st < stars; st++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        // Repeat the center row of 9 stars
        for (int st = 0; st < maxStars; st++) {
            System.out.print("*");
        }
        
        System.out.println();
        
        // Bottom half (maxStars - 2 -> 1)
        for (int stars = maxStars - 2; stars >= 1; stars -= 2) {
            
            int spaces = (maxStars - stars) / 2;
            
            // Print spaces
            for (int s = 0; s < spaces; s++) {
                System.out.print(" ");
            }
            
            // Print stars
            for (int st = 0; st < stars; st++) {
                System.out.print("*");
            }
            System.out.println();
        }
              
    }  
}



