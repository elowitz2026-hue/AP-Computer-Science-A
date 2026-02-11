/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.deckofcards;

/**
 *
 * @author ELowitz2026
 */
public class DeckOfCards {

    public static void main(String[] args) {
        
        // Create a 2D array to represent the deck
        // (Outer loop) Rows = suits (4), (Inner loop) Columns = card values (13)
        String[][] deckOfCards = new String[4][13];

        // Array holding the 4 possible suits & 13 possible card values
        String[] suits = {"Diamonds", "Hearts", "Clubs", "Spades"};
        String[] values = {"Ace", "2", "3", "4", "5", "6", "7",
                           "8", "9", "10", "Jack", "Queen", "King"};

        // Fill the deck with cards in order
        // Each card is created by combining a value with a suit
        for (int row = 0; row < deckOfCards.length; row++)
        {
            for (int col = 0; col < deckOfCards[row].length; col++)
            {
                // Example" "Ace of Diamonds"
                deckOfCards[row][col] = values[col] + " of " + suits[row];
            }
        }

        // Shuffle the deck by swapping each card with a random card
        for (int row = 0; row < deckOfCards.length; row++)
        {
            for (int col = 0; col < deckOfCards[row].length; col++)
            {
                // Generate random row & column indices
                int randRow = (int)(Math.random() * 4);
                int randCol = (int)(Math.random() * 13);

                // Swap the current card with the randomly selected card
                String temp = deckOfCards[row][col];
                deckOfCards[row][col] = deckOfCards[randRow][randCol];
                deckOfCards[randRow][randCol] = temp;
            }
        }

        // Variables to keep track of which card to deal next - keep cards in order
        int cardRow = 0;
        int cardCol = 0;

        // Deal 4 hands, each containing 5 cards 
            // Outer loop - each hand; Inner loop - 5 cards per hand 
            // Move across deck left to right, top to bottom
        for (int hand = 0; hand < 4; hand++)
        {
            // Print the name of the hand being dealt (Hand 1-4)
            System.out.println("Hand: " + (hand + 1) + ":");
            
            for (int card = 0; card < 5; card++)
            {
                // Print the current card
                System.out.println(deckOfCards[cardRow][cardCol]);

                // Move to the next card in the deck
                cardCol++;
                
                // If we reach the end of a row, move to the next row
                if (cardCol == 13)
                {
                    cardCol = 0;
                    cardRow++;
                }
            }
            
            // Blank line between hands for readability
            System.out.println();
        }
    }
}
