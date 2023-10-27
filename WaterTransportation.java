/**
 *   @purpose Created as a group class assignment. This class represents all water-based vehicles and is the
 *   parent class to the boat, submarine, and ship classes.
 *   @author Andrew Horstkamp
 *   @date: 10/26/2023
 *   @section: CSC 331-001
 */
public class WaterTransportation extends Transportation {

    // Instance Variables
    private String captain;
    private int crewSize;
    private String fuelType;
    private String propulsionType;
    private int cargoCapacity;
    private int fuelCapacity;
    private int size;

    // Primary class constructor
    public WaterTransportation(String name, double cost, boolean purchaseType, int averageSpeed, int numOfPassengers,
                               String departure, String color, String captain, int crewSize, String fuelType,
                               String propulsionType, int cargoCapacity, int fuelCapacity, int size) {
        super(name, cost, purchaseType, averageSpeed, numOfPassengers, departure, color);
        this.captain = captain;
        this.crewSize = crewSize;
        this.fuelType = fuelType;
        this.propulsionType = propulsionType;
        this.cargoCapacity = cargoCapacity;
        this.fuelCapacity = fuelCapacity;
        this.size = size;
    }

    // No-arg constructor
    public WaterTransportation() {
        // From Transportation
        this.setName("S.S. Minnow"); this.setCost(79.99); this.setPurchaseType(false);
        this.setAverageSpeed(75); this.setNumOfPassengers(24); this.setDeparture("2 PM");
        this.setColor("Blue");

        this.captain = "John Smith";
        this.crewSize = 10;
        this.fuelType = "Gasoline";
        this.propulsionType = "Gas-Powered Motor";
        this.cargoCapacity = 10;
        this.fuelCapacity = 15;
        this.size = 6;
    }

    // Accessors
    public String getCaptain() {
        return captain;
    }

    public int getCrewSize() {
        return crewSize;
    }

    public String getFuelType(){
        return fuelType;
    }

    public String getPropulsionType() {
        return propulsionType;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public int getSize() {
        return size;
    }

    // Mutators
    public void setCaptain(String captain) {
        this.captain = captain;
    }

    public void setCrewSize(int crewSize) {
        this.crewSize = crewSize;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public void setPropulsionType(String propulsionType) {
        this.propulsionType = propulsionType;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    // From Transportation
    public String toString() {
        return super.toString() + String.format("%21s: %s\n%21s: %d\n%21s: %s\n%21s: %s\n%21s: %d\n%21s: %d\n%21s: %d\n",

        "Captain", getCaptain(),
                "Crew Size", getCrewSize(),
                "Fuel Type", getFuelType(),
                "Propulsion Type", getPropulsionType(),
                "Cargo Capacity", getCargoCapacity(),
                "Fuel Capacity", getFuelCapacity(),
                "Size", getSize());
    }
}
