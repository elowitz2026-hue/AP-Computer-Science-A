/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collegelifesimulator;

/**
 *
 * @author ELowitz2026
 */
/*import java.io*;
import java.util;

public class EventFileReader {
    public static ArrayList<Event> loadEvents() {
        ArrayList<Event> events = new ArrayList<>();
        try {
            BufferedReader = reader = new BufferedReader(new FileReader("events.csv"));
            
            reader.readLine(); // skip header
            
            String line;
            while ((line = reader.readLine()) != null) {
                String [] parts = line.split(", "); 
                
                Event e = new Event (parts[0]);
                
                e.addChoice(new Choice(parts[1], 1, -5, 5, -10));
                e.addChoice(new Choice(parts[2], 0, 0, 2, 0));
                e.addChoice(new Choice(parts[3], 2, -10, -5, 0));
                
                events.add(e);
            }
            reader.close();
        }   catch (Exception e) {
            System.out.println("Error reading events file.");
        }
        return events;
    }
    
}
*/