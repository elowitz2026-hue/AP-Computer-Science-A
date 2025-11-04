/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mystore;

/**
 *
 * @author ELowitz2026
 */
import java.util.Scanner;
public class MyStore {

    public static void main(String[] args) {
        final double MAX_BUDGET = 250.00; //Constant variable for max budget
        double total = 0.0; //Keep track of total spending
        int itemCount = 0; //Keep track of number of items purchased 
        Scanner input = new Scanner(System.in);
        
        //Create item objects (name,price)
        Item tShirt = new Item("T-Shirt", 29.99);
        Item shoes = new Item("Shoes", 125.99);
        Item jeans = new Item("Jeans", 60.99);
        Item jacket = new Item("Jacket", 250.00);
        Item hat = new Item("Hat", 25.99);
        Item shorts = new Item("Shorts", 75.99);
        Item blouse = new Item("Blouse", 88.99);  
        
        //Item list
        System.out.println("Welcome to MyStore!");
        System.out.println("You have a budget of $" + MAX_BUDGET);
        System.out.println();
        System.out.println("Available items: ");
        System.out.println("1. " + tShirt);
        System.out.println("2. " + shoes);
        System.out.println("3. " + jeans);
        System.out.println("4. " + jacket);
        System.out.println("5. " + hat);
        System.out.println("6. " + shorts);
        System.out.println("7. " + blouse);
        System.out.println("8. Quit");
        
        
        while (true) {
            System.out.print("\nEnter the number of the item you want to purchase: ");
            int choice = input.nextInt(); //User enters a number (1-8)
            
            //Quit option
            if (choice == 8) {
                System.out.println("\nThank you for shopping!");
                break;
            }
            
            //Variable to store which item was chosen
            Item selectedItem = null;
            
            //Match numbers to items
            if (choice == 1) {
                selectedItem = tShirt;
            } else if (choice == 2) {
                selectedItem = shoes;
            } else if (choice == 3) {
                selectedItem = jeans;
            } else if (choice == 4) {
                selectedItem = jacket;
            } else if (choice == 5) {
                selectedItem = hat;
            } else if (choice == 6) {
                selectedItem = shorts;
            } else if (choice == 7) {
                selectedItem = blouse;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
            
            //If valid item was selected
            if (selectedItem != null) { //!= -> NOT equal
                //Check if adding it would go over max budget
                if (total + selectedItem.getDblPrice() > MAX_BUDGET) {
                    System.out.println("That would go over your budget!");
                } else {
                    //Otherwise, add price to total & increase item count
                    total +=
                    selectedItem.getDblPrice();
                    itemCount++;
                    
                    //Show feedback to user
                    System.out.println("Added " + selectedItem.getStrName() + " for $ " + selectedItem.getDblPrice());
                    System.out.println("Items bought: " + itemCount + " | Total spent: $" + total);
                }
            } 
        }
        
        //Display final total & count
        System.out.println("\nFinal total: $" + total + " for " + itemCount + " item(s).");
        input.close();
        
    }
}

//Item class
class Item {
    private String strName; //Stores name of item
    private double dblPrice; //Stores price of item

    //Constructor - sets up name & price for each item
    public Item (String strName, double dblPrice){
        this.strName = strName;
        this.dblPrice = dblPrice;
    }
    
    //Getters (accessors) - return values
    public String getStrName(){
        return strName;
    }
    
    public double getDblPrice(){
        return dblPrice;
    }
    
    //Setters (mutators/manipulators) - change values 
    public void setStrName(String strName){
        this.strName = strName;
    }
    
    public void setDblPrice(double dblPrice){
        this.dblPrice = dblPrice;
    }
    
    //toString method - returns item's name & price as text
    @Override
    public String toString(){
        return "Item: " + strName + ", Price: $" + dblPrice;
                
    }
}