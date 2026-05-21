/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collegelifesimulator;

/**
 *
 * @author ELowitz2026
 */
public class Player {
    private String name;
    private Health health;
    private GPA gpa;
    private Social social;
    private Money money;
    
    public Player (String name) {
        this.name = name;
        health = new Health(70); // less buffer
        gpa = new GPA(3);
        social = new Social(50); // mid flexibility
        money = new Money(90); // tighter budget
    }
    
    public void displayStats() {
        System.out.println("GPA: " + gpa.getValue());
        System.out.println("Health/Energy: " + health.getValue());
        System.out.println("Social Battery: " + social.getValue() + "/100");
        System.out.println("Money: $" + money.getValue());
    }
    
    // Getters so other classes can change stats
    public Health getHealth() { return health; }
    public GPA getGPA() { return gpa; }
    public Social getSocial() { return social; }
    public Money getMoney() { return money; }
    public String getName() { return name; }
}
