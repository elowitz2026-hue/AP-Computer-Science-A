/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collegelifesimulator;

/**
 *
 * @author ELowitz2026
 */
import java.io.*;

public class HighScoreManager {
    public static void saveHighScore(Player p) {
        try {
            PrintWriter writer = new PrintWriter("highscore.csv");
            
            // Header Row (explains file)
            writer.println("=== HIGH SCORE DATA ===");
            writer.println("Name, GPA, Health, Social, Money");
            
            // Data Row (actual stats)
            writer.println(
                    p.getName() + ", " + 
                    p.getGPA().getValue() + ", " +
                    p.getHealth().getValue() + ", " +
                    p.getSocial().getValue() + ", " +
                    p.getMoney().getValue());
            
            writer.close();
            
        }   catch (Exception e) {
            System.out.println("Error saving high score.");
        }
    }
}
