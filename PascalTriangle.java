/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pascaltriangle;

/**
 *
 * @author ELowitz2026
 */

import java.util.Scanner;

public class PascalTriangle {
    
    // Recursive method to print the Nth line
    static void printPascalLine(int n) {
        int[] line = getPascalLine(n); // get the Nth line as an array
        for (int val : line) { // debugger watch - paramaters (like n - 1) change
            System.out.print(val + " ");
        }
        System.out.println();
    }
    
    // Recursive method to get the Pascal line
    static int[] getPascalLine(int n) { // NFactorial - generates Nth row (starting from 0)
        if (n == 0) {
            return new int[]{1}; // base case: first row - if asked for first row, returns {1}
            // top of triangle & tells recursion when to stop
        }
        int[] prev = getPascalLine(n - 1); // get previous row
        int[] curr = new int[n + 1]; // construction - creates new array (curr) with size of n + 1
        curr[0] = 1; // first element
        curr[n] = 1; // last element
        for (int i = 1; i < n; i++) { // loop fills middle values by adding 2 adjacent #'s from previous row
            curr[i] = prev[i - 1] + prev[i]; // sum of two above
        }
        return curr;
    }
    
    public static void main(String[] args) { // main method
        Scanner scan = new Scanner(System.in); // initializes input reading
        System.out.print("Enter the line number N: ");
        int N = scan.nextInt(); // read input - prompts user to enter row #
        printPascalLine(N); // calls recursive function to compute & display resulting array for that row
    }
}