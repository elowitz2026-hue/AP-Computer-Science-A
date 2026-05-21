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

public class FileManager {
    public static void save(Player p, int turn) {
        try {
            PrintWriter writer = new PrintWriter(new FileWriter("save.csv"));
            
            writer.println("Name, Turn, GPA, Health, Social, Money");
            
            writer.println(
                    p.getName() + ", " +
                    turn + ", " + 
                    p.getGPA().getValue() + ", " + 
                    p.getHealth().getValue() + ", " + 
                    p.getSocial().getValue() + ", " +
                    p.getMoney().getValue());
            
            writer.close();
        }   catch (IOException e) {
            System.out.println("Error saving game.");
        }
    }
}
