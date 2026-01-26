/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.radiuscalc;

/**
 *
 * @author ELowitz2026
 */

import java.util.Scanner;

    //carry out calculations or circular items
    //such as a circle, a sphere, a cone, a column
public class RadiusCalc {
    
    // Scanner must be accessible to ALL methods
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        
        System.out.println("This program calculates values for round objects.");
        
        // Loop added so program continues running
        // Multiple calculations instead of exiting after single input
        while (true) {
            System.out.println("\nChoose a calculation:");
            System.out.println("1 - Area of a circle (pi r^2)");
            System.out.println("2 - Volume of a sphere (4/3 pi r^3)");
            System.out.println("3 - Volume of a cone (pi r^2 h/3)");
            System.out.println("4 - Volume of a cylinder (pi r^2 h)");
            System.out.println("0 - Exit program");
            
            System.out.print("Enter your choice: ");
            int choice = s.nextInt();
            
        // Fix output to print with correct equation
        if (choice == 0) {
            System.out.println("Program ended. Goodbye!");
            break;
        } else if (choice == 1) {
            cCalc4();
        } else if (choice == 2) {
            cCalc();
        } else if (choice == 3) {
            cCalc2();
        } else if (choice == 4) {
            cCalc3();
        } else {
            System.out.println("Invalid choice. Please enter a number from 0-4");
        }
    }
}
    
    // Volume of a cylinder
    public static void cCalc3(){
        System.out.println("Enter the radius of your cylinder, then height of your cylinder"); // Fix output wording
        int r = s.nextInt();
        int h = s.nextInt(); // Variable "h" read
        
        double result = Math.PI * Math.pow(r, 2) * h;
        System.out.println(result);
    }
    
    // Volume of a sphere
    public static void cCalc(){
        System.out.println("Enter the radius of your circle");
        int r = s.nextInt();
        
        double result = (4.0/3.0) * Math.PI * Math.pow(r, 3);
        System.out.println(result); // Result read instead of "r"
    }
    
    // Volume of a cone
    public static void cCalc2(){
        System.out.println("Enter the radius of your cone, then height of your cone");
        int r = s.nextInt();
        int h = s.nextInt();
        
        double result = Math.PI * Math.pow(r, 2) * h/3; // Pi(r^2)(h/3) - changed from h
        System.out.println(result);
    }
    
    // Area of a circle
    public static void cCalc4(){
        System.out.println("Enter the radius of your circle");
        int r = s.nextInt();
        
        double result = Math.PI * Math.pow(r, 2);
        System.out.println(result);
    }
}        
