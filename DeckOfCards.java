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
        
        // Create the deck
        String[][] deckOfCards = new String[4][13];

        String[] suits = {"Diamonds", "Hearts", "Clubs", "Spades"};
        String[] values = {"Ace", "2", "3", "4", "5", "6", "7",
                           "8", "9", "10", "Jack", "Queen", "King"};

        // Fill the deck
        for (int row = 0; row < deckOfCards.length; row++)
        {
            for (int col = 0; col < deckOfCards[row].length; col++)
            {
                deckOfCards[row][col] = values[col] + " of " + suits[row];
            }
        }

        // Shuffle the deck
        for (int row = 0; row < deckOfCards.length; row++)
        {
            for (int col = 0; col < deckOfCards[row].length; col++)
            {
                int randRow = (int)(Math.random() * 4);
                int randCol = (int)(Math.random() * 13);

                String temp = deckOfCards[row][col];
                deckOfCards[row][col] = deckOfCards[randRow][randCol];
                deckOfCards[randRow][randCol] = temp;
            }
        }

        // Deal 4 hands of 5 cards
        int cardRow = 0;
        int cardCol = 0;

        for (int hand = 0; hand < 4; hand++)
        {
            System.out.println(suits[hand] + " Hand:");
            for (int card = 0; card < 5; card++)
            {
                System.out.println(deckOfCards[cardRow][cardCol]);

                cardCol++;
                if (cardCol == 13)
                {
                    cardCol = 0;
                    cardRow++;
                }
            }
            System.out.println();
        }
    }
}


