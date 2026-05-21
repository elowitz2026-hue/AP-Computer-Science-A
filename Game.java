/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collegelifesimulator;

/**
 *
 * @author ELowitz2026
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Game {
    // Store all events
    private Player player;
    private Scanner scanner = new Scanner(System.in);
    
    private ArrayList<Event> events = new ArrayList<>();
    
    // Holds events without repetition
    private ArrayList<Event> remainingEvents = new ArrayList<>();
    
    private Random rand = new Random();
    private int turn = 1; // Loop game
    
    private boolean gameRunning = true;
    
   
    // Start Game
    public void startGame() {
        SoundClass.playSound("sounds/intro.wav");
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        player = new Player(name);
        
        // Description goes here
        System.out.println("==============================");
        System.out.println("    College Life Simulator  ");
        System.out.println("==============================");
        System.out.println("You are a college student trying to survive freshman year.");
        System.out.println("Your goal is to balance: ");
        System.out.println("- GPA");
        System.out.println("- Health");
        System.out.println("- Social Life");
        System.out.println("- Money");
        System.out.println("Survive 10 turns to graduate!");
        System.out.println("Tip: Every choice affects multiple stats-choose wisely!");
        System.out.println("==============================");
        System.out.println("STARTING STATS:");
        System.out.println("GPA: 3/5");
        System.out.println("Health: 70/100");
        System.out.println("Social Battery: 50/100");
        System.out.println("Money: $90");
        System.out.println("==============================");
        
        
        // Set-up events
        createEvents(); // Where it's called
        
        // Game loop
        while (gameRunning) {
            System.out.println("\n--- Turn " + turn + " ---");
            playTurn();
            turn++;
        }
        
        System.out.println("\nGame over. Thanks for playing!");
    }
    
    // Method to create events
    public void createEvents() {
        events.clear();
        remainingEvents.clear();
        
        Event e = new Event("You have free time, what do you do?");
        e.addChoice(new Choice("Study", 1, -5, -2, 0));
        e.addChoice(new Choice("Go out with friends", -1, -2, 5, -10));
        e.addChoice(new Choice("Rest", 0, 5, 1, 0));
        
        Event e1 = new Event("You have a big exam tomorrow. What do you do?");
        e1.addChoice(new Choice("Study all night", 2, -10, -5, 0));
        e1.addChoice(new Choice("Hang out with friends", -2, -2, 5, -10));
        e1.addChoice(new Choice("Get a good night's sleep", 1, 5, 0, 0));
        events.add(e1);
        
        Event e2 = new Event("Your friends invite you out to dinner. Do you...");
        e2.addChoice(new Choice("Go out", -1, 0, 5, -20));
        e2.addChoice(new Choice("Stay in and study", 2, -2, -2, 0));
        e2.addChoice(new Choice("Skip and rest", 0, 5, -1, 0));
        events.add(e2);
        
        Event e3 = new Event("You fell really tired during the day. Do you...");
        e3.addChoice(new Choice("Drink coffee and push through", 1, -5, 0, -5));
        e3.addChoice(new Choice("Take a nap", 0, 10, 0, 0));
        e3.addChoice(new Choice("Ignore it", -1, -10, 0, 0));
        events.add(e3);
        
        Event e4 = new Event("You find a part-time job opportunity. What do you do?");
        e4.addChoice(new Choice("Take the job", 0, -5, -2, 50));
        e4.addChoice(new Choice("Ignore it", 0, 0, 0, 0));
        e4.addChoice(new Choice("Ask for fewer hours", 0, -2, 0, 20));
        events.add(e4);
        
        Event e5 = new Event("You have a free weekend. Do you...");
        e5.addChoice(new Choice("Study ahead", 2, -3, -2, 0));
        e5.addChoice(new Choice("Go to a party", -2, -5, 8, -15));
        e5.addChoice(new Choice("Relax at home", 0, 5, 2, 0));
        events.add(e5);
        
        Event e6 = new Event("You have a group project due soon.");
        e6.addChoice(new Choice("Do most of the work yourself", 2, -5, -2, 0));
        e6.addChoice(new Choice("Rely on your group", -1, 0, 3, 0));
        e6.addChoice(new Choice("Meet and collaborate", 1, -2, 4, 0));
        events.add(e6);
        
        Event e7 = new Event("You feel motivated to work out. Do you...");
        e7.addChoice(new Choice("Go to the gym", 0, 10, 1, 0));
        e7.addChoice(new Choice("Skip it", 0, -5, 0, 0));
        e7.addChoice(new Choice("Go with a friend", 0, 8, 4, 0));
        events.add(e7);
        
        Event e8 = new Event("Your craving fast food late at night.");
        e8.addChoice(new Choice("Order food", 0, -5, 2, -15));
        e8.addChoice(new Choice("Ignore it", 0, 2, 0, 0));
        e8.addChoice(new Choice("Cook something simple", 0, 5, 1, -5));
        events.add(e8);
        
        Event e9 = new Event("You're feeling overwhelmed.");
        e9.addChoice(new Choice("Take a mental health day", 0, 10, 2, 0));
        e9.addChoice(new Choice("Push through it", 1, -8, 0, 0));
        e9.addChoice(new Choice("Talk to a friend", 0, 5, 5, 0));
        events.add(e9);
        
        Event e10 = new Event("You're laptop needs repairs.");
        e10.addChoice(new Choice("Fix it immediately", 0, 0, 0, -50));
        e10.addChoice(new Choice("Ignore it for now", -1, 0, 0, 0));
        e10.addChoice(new Choice("Find a cheaper solution", 0, 0, 0, -20));
        events.add(e10);
        
        Event e11 = new Event("You have a surprise quiz in class.");
        e11.addChoice(new Choice("You're prepared", 2, 0, 0, 0));
        e11.addChoice(new Choice("Guess answers", -2, 0, 0, 0));
        e11.addChoice(new Choice("Stay calm and try", 1, 0, 0, 0));
        events.add(e11);
        
        Event e12 = new Event("You accidentally oversleep");
        e12.addChoice(new Choice("Rush to class", 0, -3, 0, 0));
        e12.addChoice(new Choice("Skip class", -2, 2, 2, 0));
        e12.addChoice(new Choice("Email your professor", 0, 0, 1, 0));
        events.add(e12);
        
        Event e13 = new Event("You can apply for a scholarship");
        e13.addChoice(new Choice("Apply seriously", 2, -3, 0, 50));
        e13.addChoice(new Choice("Don't apply", 0, 0, 0, 0));
        e13.addChoice(new Choice("Half effort", 1, -1, 0, 10));
        events.add(e13);
        
        Event e14 = new Event("You're feeling homesick.");
        e14.addChoice(new Choice("Call family", 0, 5, 2, 0));
        e14.addChoice(new Choice("Ignore it", 0, -5, 0, 0));
        e14.addChoice(new Choice("Hang with friends", 0, 3, 5, -5));
        events.add(e14);
        
        Event e15 = new Event("It's homecoming weekend and there's a big football game.");
        e15.addChoice(new Choice("Go and stay out late", -1, -8, 8, -20));
        e15.addChoice(new Choice("Go for a bit, then leave early", 0, -2, 5, -10));
        e15.addChoice(new Choice("Skip it and study", 2, 0, -3, 0));
        events.add(e15);
        
        Event e16 = new Event("There's a big party tonight.");
        e16.addChoice(new Choice("Go all out", -2, -8, 10, -20));
        e16.addChoice(new Choice("Stay home and study", 2, 0, -3, 0));
        e16.addChoice(new Choice("Go for a little bit", 0, -2, 5, -10));
        events.add(e16);
        
        Event e17 = new Event("Your friends invite you to join an intramural team.");
        e17.addChoice(new Choice("Join the team", 0, 8, 5, -10));
        e17.addChoice(new Choice("Too busy", 1, 0, -2, 0));
        e17.addChoice(new Choice("Join casually", 0, 4, 3, -5));
        events.add(e17);
        
        // Copy all events for non-repeating system
        remainingEvents.addAll(events);
        
    }
    
    // Play one turn
    public void playTurn() {
        
        if (remainingEvents.isEmpty()) {
            remainingEvents.addAll(events); // reset cycle
        }
        
        int index = rand.nextInt(remainingEvents.size());
        Event e = remainingEvents.remove(index);
        
        if (e.getDescription().contains("party")) {
            SoundClass.playSound("sounds/party1.wav");
        }
        
        if (e.getDescription().contains("football")) {
            SoundClass.playSound("sounds/cheering.wav");
        }
        
        if (e.getDescription().contains("sleep")) {
            SoundClass.playSound("sounds/alarm.wav");
        }
        
        if (e.getDescription().contains("exam")) {
            SoundClass.playSound("sounds/bell.wav");
        }
        
        e.displayEvent();
        int choice = scanner.nextInt();
        
        
        e.getChoice(choice - 1).apply(player);
        
 
        EventLogger.logEvent(
                e.getDescription(), 
                e.getChoice(choice - 1).getDescription()
        );
        
        player.displayStats();
        
        checkEnd();
        
        FileManager.save(player, turn);
    }
    
    // Check win/lose
    public void checkEnd() {
        if (player.getGPA().getValue() <= 1) {
            System.out.println("You failed academically.");
            SoundClass.playSound("sounds/loser.wav");
            gameRunning = false;
            
        } else if (player.getHealth().getValue() <= 0) {
            System.out.println("You burned out.");
            SoundClass.playSound("sounds/loser.wav");
            gameRunning = false; 
            
        } else if (player.getMoney().getValue() <= 0) {
            System.out.println("You ran out of money.");
            SoundClass.playSound("sounds/loser.wav");
            gameRunning = false;
            
        } else if (turn >= 10) {
            System.out.println("You survived your first year in college! YOU WIN!");
            SoundClass.playSound("sounds/win.wav");
            HighScoreManager.saveHighScore(player);
            gameRunning = false;
           
        } else {
            System.out.println("You are still going!");
        }
    }
}
