/**
 *   @purpose Created as a group class assignment. This class represents submarine.
 *   @author Andrew Horstkamp
 *   @date: 10/26/2023
 *   @section: CSC 331-001
 */
public class Submarine extends WaterTransportation{
    // This is an example of polymorphism, as Submarine extends WaterTransportation which in turn extends Transportation

    // Instance Variables
    private double maxDepth;
    private double airSupply;

    // Primary class constructor
    public Submarine(String name, double cost, boolean purchaseType, int averageSpeed, int numOfPassengers, String departure,
                     String color, String captain, int crewSize, String fuelType, String propulsionType, int cargoCapacity,
                     int fuelCapacity, int size, double maxDepth, double airSupply) {
        super(name, cost, purchaseType, averageSpeed, numOfPassengers, departure, color, captain, crewSize, fuelType,
                propulsionType, cargoCapacity, fuelCapacity, size);
        this.maxDepth = maxDepth;
        this.airSupply = airSupply;
    }

    // No-arg constructor
    public Submarine() {
        // From Transportation
        this.setName("Submarine"); this.setCost(59999.99); this.setPurchaseType(false);
        this.setAverageSpeed(125); this.setNumOfPassengers(350); this.setDeparture("9 AM"); this.setColor("Blue");

        // From WaterTransportation
        this.setCaptain("Nemo Dakkar"); this.setCrewSize(850); this.setFuelType("Uranium"); setPropulsionType("Nuclear Reactor");
        this.setCargoCapacity(5000); this.setFuelCapacity(1000); this.setSize(10);

        this.maxDepth = 400.50;
        this.airSupply = 100.63;
    }

    // Accessors
    public double getMaxDepth() {
        return maxDepth;
    }

    public double getAirSupply() {
        return airSupply;
    }

    // Mutators
    public void setMaxDepth(double maxDepth) {
        this.maxDepth = maxDepth;
    }

    public void setAirSupply(double airSupply) {
        this.airSupply = airSupply;
    }

    // From WaterTransportation
    @Override
    public String toString() {
        return super.toString() + String.format("%21s: %f\n%21s: %f\n",
                "Max Depth", getMaxDepth(),
                "Air Supply", getAirSupply());
    }

    // From Transportation
    @Override
    public String travelInstructions() {
        return "Meet with the captain at Dock A12 of the Carolina Harbor, by the " + getColor() + " " + getName() +
                " at " + getDeparture() + ". Your ticket will be taken as you board and you will be escorted to" +
                "your seat";
    }
}
