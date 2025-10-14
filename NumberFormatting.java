/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.numberformatting;

import java.text.NumberFormat;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author ELowitz2026
 */
public class NumberFormatting {

    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         Random rand = new Random();
             
    /*NOTE:
      NumberFormat fmt1 = NumberFormat.getCurrencyInstance();
      NumberFormat fmt2 = NumberFormat.getPercentInstance();*/

/*1) Ask for total number of students at a school (any school). Now ask for the 
     number of girls at that school. Using Number formatting, output the % of 
     girls and % of boys at that school.*/

    //Ask user for input
     System.out.print("Enter total number of students at any school: ");
     int students = scan.nextInt();
     
     System.out.print("Enter total number of girls at the school: ");
     int girls = scan.nextInt();
     
     //Calculate boys & percentages
     int boys = students - girls;
     double percentGirls = (double) girls / students; //Cast for integer (whole #) result
     double percentBoys = (double) boys / students; //Cast for integer (whole #) result
     
     //NumberFormat for percentage output
     NumberFormat percentFormat = NumberFormat.getPercentInstance();
     
     System.out.println("Percentage of girls: " + percentFormat.format(percentGirls));
     System.out.println("Percentage of boys: " + percentFormat.format(percentBoys));
     

/*2) Ask for total amount of money in Dollars and Cents. The method must convert 
    this value to British Pounds (gbp - Exchange rate is 0.75 pence to 1$). 
    Output the number of Pounds, mentioning the exchange rate, in a British (locale) 
    number format. Do the same for the Euro (86 eCents to 1$ today)*/

    //Ask user for input in U.S. dollars
    System.out.print("Enter total amount of money in U.S. dollars & cents: ");
    double dollars = scan.nextDouble();
    
    //Conversion
    double gbpRate = 0.75; //0.75 GBP per $1
    double eurRate = 0.86; //0.86 EUR per $1
    
    //Convert amounts (double for decimals)
    double pounds = dollars * gbpRate; //ex. $3 * 0.75 = 2.25 GBP
    double euros = dollars * eurRate;
    
    //Currency formatting
    NumberFormat dollarFormat = NumberFormat.getCurrencyInstance(); //Currency includes "$" & rounds to 2 decimal places (even if input is more than 2)
    
    //Output results - exchange rate & number of pounds/euros
    System.out.println("Exchange rate: $1 = " + gbpRate + " GBP");
    System.out.println("In British Pounds: GBP " + dollarFormat.format(pounds));
    
    System.out.println("Exchange rate: $1 = " + eurRate + " EUR");
    System.out.println("In Euros: EUR " + dollarFormat.format(euros));
    
    
/*3) Ask for an integer from 0 to 15, and based on the input, format the number Pi 
     (from the Math class) to that number of decimal places, and print it out appropriately.
     (printing Pi from 0-15 decimal places)*/

     //Ask user for number of decimal places
     System.out.print("Enter an integer from 0 to 15 for number of decimal places: ");
     int decimals = scan.nextInt();

     //Format Pi from Math class
     double pi = Math.PI;
    
     //Round/format Pi to number of decimal places; needed to look up how to round PI
     double scale = Math.pow(10, decimals);
     double roundedPi = Math.round(pi * scale) / scale;
     System.out.println("Pi to " + decimals + " decimal places is: " + roundedPi);
     

//4) Generate a random number from 100,000,000 to 999e18 as a decimal number (no scientific notation).

    //Define range
     double min = 100000000; //Both doubles for consistency
     double max = 999e18;
     
     //Prints random number in decimal number format (not scientific notation)
     DecimalFormat randFormat = new DecimalFormat();
     double randNumber = min + (rand.nextDouble() * (max-min)); //Shifts start at min, within range
     
     System.out.println("Random number: " + randFormat.format(randNumber));

             
    }
}
