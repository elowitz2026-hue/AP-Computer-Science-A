/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.leapyear;

/**
 *
 * @author ELowitz2026
 */

import java.util.Scanner;
public class LeapYear {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        boolean isLeapYear = false;
        final int MIN_YEAR = 1582; //Set minimum year
        
        System.out.print("Please enter a year from 1582 to present: ");
        int year = scan.nextInt();
        System.out.println("You entered: " + year);
        
        //Leap year if divisible by 4, unless divisible by 100 but not 400
        if(year < MIN_YEAR){
            System.out.println("Error! You entered an invalid year. Please try again.");
        }else{
            if (year %4 == 0){ //%4 (divisible by 4)
                if (year %100 == 0){
                    if (year %400 == 0){
                        isLeapYear = true; //divisible by 400 -> leap year
                    }
                } else {
                    isLeapYear = true; //divisible by 4 but not by 100 -> leap year
                }
            }
            
            if (isLeapYear) {
                System.out.println(year + " is a leap year.");
            } else {
                System.out.println(year + " is NOT a leap year.");
            }    
        }
    }
}          