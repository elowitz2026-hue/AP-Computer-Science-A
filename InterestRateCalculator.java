/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.interestratecalculator;

/**
 *
 * @author ELowitz2026
 */

import java.text.NumberFormat;
import java.util.Scanner;

public class InterestRateCalculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        NumberFormat percent = NumberFormat.getPercentInstance();
 
        //Principal amount
        System.out.print("Enter principal amount (ex. 1,000,000): ");
        double amount = scan.nextDouble();
        
        //Number of months for repayment
        System.out.print("Enter number of months for repayment: ");
        int months = scan.nextInt();
        
        //Show interest rate used
        System.out.println("Using interest rate of: " + percent.format(InterestRateCalculation.RATE));
        
        //Call method to calculate payments
        InterestRateCalculation calc = new InterestRateCalculation(); //class - does the math
        calc.setMonths(months); //set months first
        calc.calculatePayments(amount); //then calculate payments based on amount
    
    }
}

//New Class - "black box" ("InterestRateCalculator" already main method)
        class InterestRateCalculation {
            public static final double RATE = 0.10; //10% annual interest - constant
            private double amount; //principal amount
            private int months; //repayment months
            
            public void setMonths(int m){
                months = m;
            }
            
            public void calculatePayments(double a){
                amount = a;
                
                //Divide amount/months - monthly payment 
                double monthlyPayment = amount / months;
                
                //Monthly interest
                double interest = (amount * RATE);
                //double interest = monthlyPayment * (RATE * 12);
                
                //Monthly payment with interest
                double monthlyPaymentWithInterest = monthlyPayment + interest;
                
                NumberFormat currency = NumberFormat.getCurrencyInstance();
                
                System.out.println("Monthly payment: " + currency.format(monthlyPayment));
                
                System.out.println("Total amount repaid: " + currency.format(months * monthlyPaymentWithInterest));
                
            }
        }  
