/**
 *   @purpose Created as a group class assignment. This class represents boats.
 *   @author Andrew Horstkamp
 *   @date: 10/26/2023
 *   @section: CSC 331-001
 */
public class Boat extends WaterTransportation{
// This is an example of polymorphism, as Boat extends WaterTransportation which in turn extends Transportation

    // Instance variables
    private String hullMaterial;
    private String propellerType;
    private boolean refreshments;

    // Class primary constructor

    public Boat(String name, double cost, boolean purchaseType, int averageSpeed, int numOfPassengers, String departure, String color,
                String captain, int crewSize, String fuelType, String propulsionType, int cargoCapacity, int fuelCapacity, int size, String
                hullMaterial, String propellerType, boolean refreshments) {

        super(name, cost, purchaseType, averageSpeed, numOfPassengers, departure, color, captain, crewSize, fuelType, propulsionType,
                cargoCapacity, fuelCapacity, size);
        this.hullMaterial = hullMaterial;
        this.propellerType = propellerType;
        this.refreshments = refreshments;

    }

    // No-arg constructor
    public Boat() {
        // From Transportation
        this.setName("Boat"); this.setCost(19.99); this.setPurchaseType(true);
        this.setAverageSpeed(40); this.setNumOfPassengers(5); this.setDeparture("2:30 PM"); this.setColor("White");

        // From WaterTransportation
        this.setCaptain("Jonas Gumby"); this.setCrewSize(2); this.setFuelType("Gas"); setPropulsionType("Gas-Powered Motor");
        this.setCargoCapacity(20); this.setFuelCapacity(40); this.setSize(4);

        this.hullMaterial = "Aluminum";
        this.propellerType = "Inboard";
        this.refreshments = true;
    }

    // Accessors
    public String getHullMaterial() {
        return hullMaterial;
    }

    public String getPropellerType() {
        return propellerType;
    }

    public boolean isRefreshments() {
        return refreshments;
    }

    // Mutators
    public void setHullMaterial(String hullMaterial) {
        this.hullMaterial = hullMaterial;
    }

    public void setPropellerType(String propellerType) {
        this.propellerType = propellerType;
    }

    public void setRefreshments(boolean refreshments) {
        this.refreshments = refreshments;
    }

    // From WaterTransportation
    @Override
    public String toString() {
        return super.toString() + String.format("%21s: %s\n%21s: %s\n%21s: %s\n\n",
                "Hull Material", getHullMaterial(),
                "Propeller Type", getPropellerType(),
                "Refreshments Provided", isRefreshments() ? "Yes" : "No");
    }

    // From Transportation
    @Override
    public String travelInstructions() {
        return "The boat will be available at the West Docks main office. Head to the front desk and show them your ticket, " +
                "and your " + getColor() + " " + getName() +
                " will be provided to you at " + getDeparture() + ". All rentals should be returned within 12 hours.";
    }
}
