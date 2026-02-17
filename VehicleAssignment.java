/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vehicleassignment;

/**
 *
 * @author ELowitz2026
 */
public class VehicleAssignment {

    public static void main(String[] args) {
       
    }
    
// The Base Vehicle Class, implements the Speedometer interface
public class Vehicle implements Speedometer{
    //base (Class wide) variables
    protected String brandName = "";
    protected double speed = 0.0;
    protected int passengers = 0;
    protected double cargoWeight = 0.0;
    //Base default constructor 
    public Vehicle(){
        brandName = "";
        speed = 0.0;
        passengers = 0;
        cargoWeight = 0.0;
    }

    public Vehicle(String inBrand, double inSpeed, int inPassengers, double inCargo){
        brandName = inBrand;
        speed = inSpeed;
        passengers = inPassengers;
        cargoWeight = inCargo;
    }

    //getters and setters
    public Vehicle(String inBrand){
        brandName = inBrand;
    }

    public String getBrand(){
        return brandName;
    }

    public  void setBrandName(String inBrand){
        brandName = inBrand;
    }

    @Override
    public double getSpeed(){
        return  speed;
    }

    @Override
    public void setSpeed(double inSpeed){
        speed = inSpeed;
    }

    public int getPassengers(){
        return  passengers;
    }

    public void setPassengers(int inPassengers){
        speed = inPassengers;
    }

    public double getCargoWeight(){
        return  cargoWeight;
    }

    public void setCargoWeight(double inCargoWeight){
        cargoWeight = inCargoWeight;
    }

    //Base toString
    @Override
    public String toString(){
        String result = "";
        result = "Brand: \t\t\t" + getBrand() + "\n" +
                "Speed (mph): \t" + getSpeed() + "\n" +
                "Passengers: \t" + getPassengers() + "\n" +
                "Cargo (lbs): \t" + getCargoWeight() + "\n";
        return result;
    }
}
//the Speedometer interface to show the speed of any vehicle in the same way
interface Speedometer{
    public void setSpeed(double inSpeed);
    public double getSpeed();
 }

// -----------------------------------------------------------------

// Car Class inherits from Vehicle Class
public class Car extends Vehicle{
    int wheels = 4;
    String color = "White";
    boolean spoiler = false;
    boolean stereo = false;
    double mpg = 0.0; //has an extra variable, mpg

    public Car(String inBrand, double inSpeed, int inPassengers, double inCargo, double inMPG){
        super(inBrand, inSpeed, inPassengers, inCargo); //uses the super constructor
        mpg = inMPG; //also include the extra variable in the Car constructor
    }
    //another additional variable
    public void setSpoiler(boolean inSpoiler){
        spoiler = inSpoiler;
    }

    public boolean getSpoiler(){
        return spoiler;
    }
    //another additional variable
    public void setStereo(boolean inStereo){
        stereo = inStereo;
    }

    public boolean getStereo(){
        return  stereo;
    }
    //overrides the super getSpeed method
    @Override
    public double getSpeed() {
        if (spoiler)
            return super.getSpeed() + 20;
        else
            return super.getSpeed();
    }

    public void setMpg(double mpg) {
        this.mpg = mpg;
    }

    public double getMPG(){
        if(stereo)
            return mpg - (mpg / 10);
        else
            return mpg;
    }
    //usesd the super toString, as well as addingnthe new variable to it.
    @Override
    public String toString(){
        String result = super.toString() +
                "MPG :\t\t\t" + this.getMPG();
        return  result ;
    }
}

// -----------------------------------------------------------------

// McLaren F1 supercar
// Inherits from Car
public class McLarenF1 extends Car {
    
    private boolean racingMode; // Boosts speed temporarily
    
    // In order from inheritance - brand, speed, passengers, cargo weight + (mpg)
    public McLarenF1() {
        super("McLaren", 250, 2, 300, 12); // Realistic specs
        racingMode = false;
    }

    public void setRacingMode(boolean mode) {
        racingMode = mode;
    }

    @Override
    public double getSpeed() {
        if (racingMode) {
            return super.getSpeed() + 50; // Temporary boost
        }
        
        return super.getSpeed();
    }
    
    @Override
    public String toString() {
        return super.toString() + "Racing Mode:\t" + racingMode + "\n"; 
    }
}

// -----------------------------------------------------------------

// Tesla Model 3 electric car
// Inherits from Car
public class TeslaModel3 extends Car {

    private final double batteryRange; // in miles
    private boolean autopilotEnabled; // self-driving feature

    // Default constructor
    public TeslaModel3() {
        super("Tesla", 140, 5, 400, 120); // mph, passengers, cargo, "mpg" as equivalent range
        batteryRange = 310;
        autopilotEnabled = true;
    }

    public void setAutopilot(boolean enabled) {
        autopilotEnabled = enabled;
    }

    @Override
    public String toString() {
        return super.toString() + // use Car's toString first
                "Battery Range:\t" + batteryRange + " miles\n" +
                "Autopilot:\t" + autopilotEnabled + "\n";
    }
}

// -----------------------------------------------------------------

// Disney Cruise Ship class
// Inherits directly from Vehicle
public class DisneyCruiseShip extends Vehicle {

    private final int decks; // number of levels on ship
    private final boolean waterSlides; // entertainment feature

    // For all Vehicle Inheritance --> brand, speed, passengers, cargo weight 
    public DisneyCruiseShip() {
        super("Disney Cruise Line", 22, 4000, 2000000);
        decks = 14;
        waterSlides = true;
    }

    @Override
    public String toString() {
        return super.toString() + // adds cruise-specific details
                "Decks:\t\t\t" + decks + "\n" +
                "Water Slides:\t" + waterSlides + "\n";
    }
}


// -----------------------------------------------------------------

// Aircraft Carrier class - military boat
// Inherits from Vehicle
public class AircraftCarrier extends Vehicle {

    private final int numberOfJets; // aircraft stored onboard
    private final double runwayLength; // length of runway in feet

    public AircraftCarrier() {
        super("US Navy", 35, 5000, 3000000);
        numberOfJets = 70;
        runwayLength = 1000; // feet
    }

    @Override
    public String toString() {
        return super.toString() + // adds military specs
                "Jets Onboard:\t" + numberOfJets + "\n" +
                "Runway Length:\t" + runwayLength + " ft\n";
    }
}

// -----------------------------------------------------------------

// Fighter Jet inspired by Top Gun
// Inherits from Vehicle
public class FighterJet extends Vehicle {

    private boolean afterburner; // speed boost feature

    public FighterJet() {
        super("US Air Force", 1800, 1, 2000);
        afterburner = false;
    }

    // allows afterburner to be toggled
    public void setAfterburner(boolean on) {
        afterburner = on;
    }

    @Override
    public double getSpeed() {
        if (afterburner) {
            return super.getSpeed() + 500; // increased speed
        }
        return super.getSpeed();
    }

    @Override
    public String toString() {
        return super.toString() +
                "Afterburner:\t" + afterburner + "\n";
    }
}

// -----------------------------------------------------------------

// Commercial passenger airplane
// Inherits from Vehicle
public class AmericanAirlinesJet extends Vehicle {

    private final int numberOfPassengers; // seating capacity
    private final double flightRange; // in miles

    public AmericanAirlinesJet() {
        super("American Airlines", 600, 180, 80000);
        numberOfPassengers = 180;
        flightRange = 3000;
    }

    @Override
    public String toString() {
        return super.toString() + // adds airline details
                "Passengers:\t" + numberOfPassengers + "\n" +
                "Flight Range:\t" + flightRange + " miles\n";
    }
}

// -----------------------------------------------------------------

// Star Wars X-Wing Fighter
// Inherits from Vehicle
public class XWingFighter extends Vehicle {

    private boolean hyperdrive; // sci-fi feature

    public XWingFighter() {
        super("Rebel Alliance", 1050, 1, 500);
        hyperdrive = false;
    }

    // Enables or disables faster-than-light travel
    public void setHyperdrive(boolean enabled) {
        hyperdrive = enabled;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Hyperdrive Enabled:\t" + hyperdrive + "\n";
    }
}

// -----------------------------------------------------------------

// Back to the Future DeLorean
// Inherits from Car
public class BackToTheFutureDeLorean extends Car {

    private boolean fluxCapacitorActive; // enables time travel

    public BackToTheFutureDeLorean() {
        super("DeLorean DMC-12", 88, 2, 300, 25);
        fluxCapacitorActive = true;
    }

    // Turns time travel feature on or off
    public void setFluxCapacitor(boolean active) {
        fluxCapacitorActive = active;
    }

    // Overrides speed to simulate time travel activation
    @Override
    public double getSpeed() {
        if (fluxCapacitorActive) {
            return super.getSpeed() + 88; // time travel speed + 1.2 gigawatts of power
        }
        return super.getSpeed();
    }

    @Override
    public String toString() {
        return super.toString() +
                "Flux Capacitor Active:\t" + fluxCapacitorActive + "\n";
    }
}


}