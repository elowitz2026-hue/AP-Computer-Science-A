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

public class EventLogger {
    public static void logEvent(String event, String choice) {
        try {
            PrintWriter writer = new PrintWriter(new FileWriter("eventlog.csv", true));
            writer.println(event + ", " + choice);
            writer.close();
        }   catch (Exception e) {
            System.out.println("Error logging event.");
        }
    }
}
