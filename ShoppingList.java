/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.shoppinglist;



/**
 *
 * @author ELowitz2026
 */

import java.util.Scanner;
import java.util.ArrayList;
public class ShoppingList {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in); //Scanner to get input from user
        ArrayList<String> list = new ArrayList<>(); //ArrayList to store shopping items
        boolean running = true; //Controls main program loop
        
        System.out.println("Welcome to your shopping list!");
    
    //Main program loop
    while (running) {
        //Display menu options
        System.out.println("\nPlease select an option: ");
        System.out.println("1. Add an item");
        System.out.println("2. View list");
        System.out.println("3. Remove item");
        System.out.println("4. Quit");
        System.out.println("Please enter your choice: ");
        
        int choice = scan.nextInt(); //Get user's choice
        scan.nextLine(); //Clear leftover newline from nextInt()
        
        
        //Option 1: Add item
        if (choice == 1) {
           System.out.println("Enter item to add: ");
           String item = scan.nextLine();
           list.add(item); //Add item to ArrayList
           System.out.println(item + " added to your list");
        }
        
        //Option 2: View list
        else if (choice == 2) {
            if (list.isEmpty()) { //**No semi-colon - misplaced for 'else' w/o 'if' error (inital error)**
            System.out.println("Your shopping list is empty");
        } else {          
            System.out.println("\nYour shopping list: ");
            int index = 0;
            //Use while loop to display each item with a number
            while (index < list.size()) {
                System.out.println((index + 1) + ". " + list.get(index));
                index++;
            }
        }
    }
        
        //Option 3: Remove item
        else if (choice == 3) {
            if (list.isEmpty()) {
                System.out.println("Your list is empty, nothing to remove.");
            } else {
                //Display list so user can pick which number to remove
                System.out.println("\nYour shopping list: ");
                int index = 0;
                while (index < list.size()) {
                    System.out.println((index + 1) + ". " + list.get(index));
                    index++;
                }
            
            //Ask user for number of the item to remove
            System.out.println("Enter the number of the item to remove: ");
            int removeNum = scan.nextInt();
            scan.nextLine(); //Clear leftover newline
            
            //Nested if statements to check valid input
            if (removeNum <= 0) {
                System.out.println("Invalid number.");
            } else {
                if (removeNum > list.size()) {
                    System.out.println("Invalid number.");
                } else {
                    String removedItem = list.remove(removeNum - 1); //Remove item
                    System.out.println(removedItem + " removed from your list.");
                }
            }
        }
    }
        
        //Option 4: Quit program
        else if (choice == 4) {
            System.out.println("Goodbye!");
                running = false; //Ends 'while' loop
        }
        //If user enters something other than 1-4
        else {
            System.out.println("Invalid choice, please try again.");
        }
    }
    
        scan.close(); //**Close Scanner to avoid resource leak - (inital error)**
        
    }
}