/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.hphousequiz;

/**
 *
 * @author ELowitz2026
 */

import java.util.Scanner;

public class HPHouseQuiz {
    
    public static void main(String[] args) {
        
    Scanner input = new Scanner(System.in);
    
    // Set total points based on answers at 0 -> added up later
    int totalPoints = 0;
    int answer = 0;    
    
 
    System.out.println("WELCOME TO THE HARRY POTTER HOUSE SORTING QUIZ!");
    System.out.println("    - For each of the following 10 questions, choose an answer 1-4.");
    System.out.println("    - Each choice is worth a different number of points.");
    System.out.println("    - Your points will be tallied up at the end to determine where you will be \n      sorted in either: Hufflepuff, Ravenclaw, Gryffindor, or Slytherin.\n");
    
    
    // Mapping -> points
    // House-answer = 1) Gryffindor (1pt); 2) Ravenclaw (2pts); 3) Slytherin (3pts); 4) Hufflepuff (4pts)
    int[] choicePoints = {1, 2, 3, 4};
    
    // QUESTION 1
        System.out.println("QUESTION 1: What do you fear most?");
        System.out.println("1) Being seen as a coward");
        System.out.println("2) Being ignorant or wrong");
        System.out.println("3) Being powerless or overlooked");
        System.out.println("4) Being alone or disliked");
        answer = getValidAnswer(input);
        totalPoints += choicePoints[answer - 1]; // Increases the value of the variable by the value after +=
        
    // QUESTION 2
        System.out.println("\nQUESTION 2: How do you usually solve a problem?");
        System.out.println("1) Jump in & take action");
        System.out.println("2) Think it through logically");
        System.out.println("3) Find the most strategic advantage");
        System.out.println("4) Ask for help & work together");
        answer = getValidAnswer(input);
        totalPoints += choicePoints[answer - 1];    
        
    // QUESTION 3
        System.out.println("\nQUESTION 3: Given the choice, would you rather \ninvent a potion that would guarantee you: ");
        System.out.println("1) Glory?");
        System.out.println("2) Wisdom?");
        System.out.println("3) Power?");
        System.out.println("4) Love?");
        answer = getValidAnswer(input);
        totalPoints += choicePoints[answer - 1];
        
    // QUESTION 4
        System.out.println("\nQUESTION 4: Which quality matters most to you in a friend?");
        System.out.println("1) Courage & honesty");
        System.out.println("2) Intelligence & curiosity");
        System.out.println("3) Ambition & confidence");
        System.out.println("4) Kindness & loyalty");
        answer = getValidAnswer(input);
        totalPoints += choicePoints[answer - 1];
        
    // QUESTION 5
        System.out.println("\nQUESTION 5: What type of social events do you prefer?");
        System.out.println("1) Big, active outings");
        System.out.println("2) Quiet hangouts");
        System.out.println("3) Exclusive or high-profile gatherings");
        System.out.println("4) Cozy get-togethers with family/friends");
        answer = getValidAnswer(input);
        totalPoints += choicePoints[answer - 1];        
        
    // QUESTION 6
        System.out.println("\nQUESTION 6: What type of classes interest you the most?");
        System.out.println("1) Defense Against the Dark Arts");
        System.out.println("2) Charms or Ancient Runes");
        System.out.println("3) Potions");
        System.out.println("4) Herbology or Care of Magical Creatures");
        answer = getValidAnswer(input);
        totalPoints += choicePoints[answer - 1];
    
    // QUESTION 7
        System.out.println("\nQUESTION 7: How do you react to unexpected changes?");
        System.out.println("1) Adapt quickly & improvise");
        System.out.println("2) Pause & evaluate the new structure");
        System.out.println("3) See how to turn it into your advantage");
        System.out.println("4) Stay calm & help others adjust");
        answer = getValidAnswer(input);
        totalPoints += choicePoints[answer - 1];
    
    // QUESTION 8
        System.out.println("\nQUESTION 8: What's your ideal learning environment?");
        System.out.println("1) Hand's-on experiences");
        System.out.println("2) Quiet, focused settings");
        System.out.println("3) Competitive or high-achieving spaces");
        System.out.println("4) Supportive group environments");
        answer = getValidAnswer(input);
        totalPoints += choicePoints[answer - 1];
    
    // QUESTION 9
        System.out.println("\nQUESTION 9: If you stumbled on a secret passageway, what would you do?");
        System.out.println("1) Explore it immediately without hesitation");
        System.out.println("2) Inspect it first to see if it's safe");
        System.out.println("3) Keep it a secret & use it strategically when it benefits you");
        System.out.println("4) Tell somebody before proceeding");
        answer = getValidAnswer(input);
        totalPoints += choicePoints[answer - 1];
    
    // QUESTION 10
        System.out.println("\nQUESTION 10: What hobby sounds most appealing?");
        System.out.println("1) Traveling or exploring");
        System.out.println("2) Reading, solving puzzles, creative thinking"); // Creative thinking -> play an instrument
        System.out.println("3) Self-development or money-making projects"); // Money-making -> poker?
        System.out.println("4) Cooking, gardening, crafting");
        answer = getValidAnswer(input);
        totalPoints += choicePoints[answer - 1];
    
    
    /* Determine House based on total points
       Point range: Gryffindor - 10-17; Ravenclaw - 18-24; Slytherin - 25-32; Hufflepuff - 33-40;
       NOTE: since 30 is not divisible by 4, Ravenclaw has 1 pt less chance than the other 3 houses */
    
    String house;
    
    // Note: else if needs condition, else is deafult
    
    // Point ranges 
    if (totalPoints >= 10 && totalPoints <= 17) {
        house = "Gryffindor";
    } else if (totalPoints >= 18 && totalPoints <= 24) {
        house = "Ravenclaw";
    } else if (totalPoints >= 25 && totalPoints <= 32) {
        house = "Slytherin";
    } else if (totalPoints >= 33 && totalPoints <= 40) {
        house = "Hufflepuff";
    } else {
        house = "Unknown - score out of range";
    }
    
    System.out.println("\nYou belong in: " + house + "!");    
    
    }
    
    // Input Validation Method (in case user enters wrong number or input)
    
    // Integer field exists on class (not on each instance)
    public static int getValidAnswer(Scanner input) {
        int ans = 0;
        boolean valid = false;
        
        // Since boolean valid = false -> != "not equal to" operator 
        while (!valid){
            System.out.println("Enter 1-4: ");
            // Use Scanner input
            if (input.hasNextInt()) {
                ans = input.nextInt();
                if (ans >= 1 && ans <= 4) {
                valid = true;
        } else {
            System.out.println("Invalid number - must be 1, 2, 3, or 4.");
        } 
        } else {
            System.out.println("Invalid input - please enter a number"); 
            input.next(); // Clear invalid input
        }
            
        }
        
        return ans;
        
        }
    
    }

        