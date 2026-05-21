/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collegelifesimulator;

/**
 *
 * @author ELowitz2026
 */
import java.util.ArrayList;

public class Event {
    private String description;
    private ArrayList<Choice> choices;
    
    public Event (String description) {
        this.description = description;
        choices = new ArrayList<>();
    }
    
    public void addChoice (Choice c) {
        choices.add(c);
    }
    
    public void displayEvent() {
        System.out.println(description);
        for (int i = 0; i < choices.size(); i++) {
            System.out.println((i + 1) + ". " + choices.get(i).getDescription());
        }
    }
    
    public Choice getChoice(int index) {
        return choices.get(index);
    }
    
    public String getDescription() {
        return description;
    }
}
