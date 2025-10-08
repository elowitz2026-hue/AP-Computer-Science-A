/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.anatomyofclass;

/**
 *
 * @author ELowitz2026
 */

public class AnatomyOfClass {

    public static void main(String[] args) {
        
    //1) What is the difference between a class and an object?
    /*   A class is like the blueprint for creating objects 
        (in this case the Car - provides inital values for variables), 
        while the object is an instance of a class (vwBug).*/
    
    //2) What happens when you pass an object to a print or println method?
    //   It calls the object's toString() method to print details on a new line.
    
    //3) What is the scope of a variable in a method? In a class?
    /*   The variable scope of data is the area in a program where that 
         data can be referenced. Data declared in a method can only be 
         referenced in that method, whereas within a class, data can be 
         referenced anywhere in the class.*/
    
    /*4) Write a class called Car that has 1 string variable called carBrand,
         an int variable called enginePower (in Horse Power), a double variable
         called MaxSped (in MPH), and a double variable called price (in $).
         Start a control main method in the Main class, and use this to construct a
         single car object from the Car class as you go along, to help debug. Write a
         constructor to produce a base car. Write methods to set and get the brand, enginePower,
         as well as carSpeed and price. Write a toString method to print out these details.
         Write a driver method in main to create car types VW Bug, Toyota Prius, BMW i8, Tesla Model 3,
         give them the enginePower and maxSpeed as you wish and print these details out.*/
             
         Car vwBug = new Car("VW Bug", 100, 200, 13000);
         System.out.println(vwBug);
         Car toyotaPrius = new Car("Toyota Prius", 196, 110, 26000);
         System.out.println(toyotaPrius);
         Car bmwi8 = new Car("BMW i8", 369, 155, 49000);
         System.out.println(bmwi8);
         Car tesla3 = new Car ("Tesla Model 3", 500, 130, 45000);
         System.out.println(tesla3);
         //("Brand", Engine Power, Max Speed, Price)
         
    }
}
        
         //Car class
         class Car {
            private String carBrand = "";
            private final int enginePower; // Horse Power
            private final double maxSpeed; // MPH - double prints w/decimal
            private final double price; // USD ($) - double prints w/decimal
            
         //Constructor
            public Car(String inBrand, int inEnginePower, double inMaxSpeed, double inPrice){
                carBrand = inBrand;
                enginePower = inEnginePower;
                maxSpeed = inMaxSpeed;
                price = inPrice;

            }
            
            //toSting method (prints car info)
          @Override
          /*Don't need String myString since int/double can't 
            be converted to String not return myString */
          
            public String toString(){
                return "Car Brand: " + carBrand + 
                        "\nEngine Power (HP): " + enginePower + 
                        "\nMax Speed (MPH): " + maxSpeed +
                        "\nPrice ($): " + price;
                        //\n ensures new line for each component for each car
                        //return = repeat
                        //no int or double since they can't convert from String
            
            }
         }