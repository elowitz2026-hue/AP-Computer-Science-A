/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collegelifesimulator;

/**
 *
 * @author ELowitz2026
 */
public class Choice {
    private String description;
    private int gpaEffect, healthEffect, socialEffect, moneyEffect;
    
    public Choice (String description, int g, int h, int s, int m) {
        this.description = description;
        gpaEffect = g;
        healthEffect = h;
        socialEffect = s;
        moneyEffect = m;
    }
    
    public void apply (Player player) {
        player.getGPA().increase(gpaEffect);
        player.getHealth().increase(healthEffect);
        player.getSocial().increase(socialEffect);
        player.getMoney().increase(moneyEffect);
        
    }
    
    public String getDescription() {
        return description;
    }
}
