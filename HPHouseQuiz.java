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
    
    int totalPoints = 0;
    int answer = 0;    
    
 
    System.out.println("WELCOME TO THE HARRY POTTER HOUSE SORTING QUIZ!");
    System.out.println("For each question, choose 1-4.");
    System.out.println("Each choice is worth a different number of points.");
    System.out.println("Your points will be tallied up at the end to determine where you will be sorted.\n");
    
    
    // Mapping -> points
    // House-answer = 1) Gryffindor (1pt); 2) Ravenclaw (2pts); 3) Slytherin (3pts); 4) Hufflepuff (4pts)
    int[] choicePoints = {1, 2, 3, 4};
    
    // QUESTION 1
        System.out.println("What do you fear most?");
        System.out.println("1) Being seen as a coward");
        System.out.println("2) Being ignorant or wrong");
        System.out.println("3) Being powerless or overlooked");
        System.out.println("4) Being alone or disliked");
        answer = getValidAnswer(input);
        totalPoints += choicePoints[answer - 1];
        
    // QUESTION 2
        System.out.println("Which animal do you feel most connected to: ");
        System.out.println("1) Lion");
        System.out.println("2) Eagle");
        System.out.println("3) Snake");
        System.out.println("4) Badger");
        answer = getValidAnswer(input);
        totalPoints += choicePoints[answer - 1];
        
    // QUESTION 3
        System.out.println("How do you usually solve a problem");
        System.out.println("1) Jump in & take action");
        System.out.println("2) Think it through logically");
        System.out.println("3) Find the most strategic advantage");
        System.out.println("4) Ask for help & work together");
        answer = getValidAnswer(input);
        totalPoints += choicePoints[answer - 1];
        
    // QUESTION 4
        System.out.println("What type of classes interest you the most?");
        System.out.println("1) Defense Against the Dark Arts");
        System.out.println("2) Charms or Ancient Runes");
        System.out.println("3) Potions");
        System.out.println("4) Herbology or Care of Magical Creatures");
        answer = getValidAnswer(input);
        totalPoints += choicePoints[answer - 1];
    
    // QUESTION 5
        System.out.println("When you work with a team, what's your role?");
        System.out.println("1) The leader who motivates everyone");
        System.out.println("2) The thinker who solves tough problems");
        System.out.println("3) The strategist who plans the route");
        System.out.println("4) The supporter who ensures everyone is okay");
        answer = getValidAnswer(input);
        totalPoints += choicePoints[answer - 1];
    
    // QUESTION 6
        System.out.println("How do you make decisions?");
        System.out.println("1) Go with your gut");
        System.out.println("2) Analyze all the details");
        System.out.println("3) Think about how it benefits your future");
        System.out.println("4) Consider how it affects others");
        answer = getValidAnswer(input);
        totalPoints += choicePoints[answer - 1];
    
    // QUESTION 7
        System.out.println("What type of social events do you prefer?");
        System.out.println("1) Big, active outings");
        System.out.println("2) Quiet hangouts");
        System.out.println("3) Exclusive or high-profile gatherings");
        System.out.println("4) Cozy get-togethers with family/friends");
        answer = getValidAnswer(input);
        totalPoints += choicePoints[answer - 1];
    
    // QUESTION 8
        System.out.println("How do you react to unexpected changes?");
        System.out.println("1) Adapt quickly & improvise");
        System.out.println("2) Pause & evaluate the new structure");
        System.out.println("3) See how to turn it into your advantage");
        System.out.println("4) Stay calm & help others adjust");
        answer = getValidAnswer(input);
        totalPoints += choicePoints[answer - 1];
    
    // QUESTION 9
        System.out.println("What's your ideal learning environment?");
        System.out.println("1) Hand's-on experiences");
        System.out.println("2) Quiet, focused settings");
        System.out.println("3) Competitive or high-achieving spaces");
        System.out.println("4) Supportive group environments");
        answer = getValidAnswer(input);
        totalPoints += choicePoints[answer - 1];
    
    // QUESTION 10
        System.out.println("What hobby sounds most appealing?");
        System.out.println("1) Traveling or exploring");
        System.out.println("2) Reading, puzzles, creative thinking");
        System.out.println("3) Self-development or money-making projects");
        System.out.println("4) Cooking, gardening, crafting");
        answer = getValidAnswer(input);
        totalPoints += choicePoints[answer - 1];
    
    
    // Determine House based on total points
    
    // Point range: Gryffindor - 10-17; Ravenclaw - 18-24; Slytherin - 25-32; Hufflepuff - 33-40;
    // NOTE: since 30 is not divisible by 4, Ravenclaw has 1 pt less chance than the other 3 houses
    
    String house;
    
    // Note: else if needs condition, else is deafult
    
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
    
    // Input Validation Method (in case user enters wrong number or input
    
    // Integer field exists on class (not on each instance)
    public static int getValidAnswer(Scanner input) {
        boolean 
            
            System.out.println("Invalid number - must be 1, 2, 3, or 4.");
            
            System.out.println("Invalid input - please enter a number");
            
        }
            
        // return ;
        
    }





