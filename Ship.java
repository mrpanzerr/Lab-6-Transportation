/**
 *   @purpose Created as a group class assignment. This class represents ships.
 *   @author Andrew Horstkamp
 *   @date: 10/26/2023
 *   @section: CSC 331-001
 */
public class Ship extends WaterTransportation{
    // This is an example of polymorphism, as Ship extends WaterTransportation which in turn extends Transportation

    //Instance Variables
    private String passengerClass;
    private String shipClass;

    // Primary class constructor
    public Ship(String name, double cost, boolean purchaseType, int averageSpeed, int numOfPassengers, String departure,
                String color, String captain, int crewSize, String fuelType, String propulsionType, int cargoCapacity,
                int fuelCapacity, int size, String passengerClass, String shipClass) {
        super(name, cost, purchaseType, averageSpeed, numOfPassengers, departure, color, captain, crewSize, fuelType,
                propulsionType, cargoCapacity, fuelCapacity, size);
        this.passengerClass = passengerClass;
        this.shipClass = shipClass;
    }

    // No-arg constructor
    public Ship() {
        // From Transportation
        this.setName("Ship"); this.setCost(149.99); this.setPurchaseType(true);
        this.setAverageSpeed(80); this.setNumOfPassengers(350); this.setDeparture("3 PM"); this.setColor("White");

        // From WaterTransportation
        this.setCaptain("Edward Teach"); this.setCrewSize(85); this.setFuelType("N/A"); setPropulsionType("Sails");
        this.setCargoCapacity(50); this.setFuelCapacity(0); this.setSize(8);

        this.passengerClass = "Economy";
        this.shipClass = "Sloop";
    }

    // Accessors
    public String getPassengerClass(){
        return passengerClass;
    }

    public String getShipClass(){
        return shipClass;
    }

    // Mutators
    public void setPassengerClass(String passengerClass) {
        this.passengerClass = passengerClass;
    }

    public void setShipClass(String shipClass) {
        this.shipClass = shipClass;
    }

    // From WaterTransportation
    @Override
    public String toString() {
        return super.toString() + String.format("%21s: %s\n%21s: %s\n",
                "Passenger Class", getPassengerClass(),
                "Ship Class", getShipClass());
    }

    // From Transportation
    @Override
    public String travelInstructions() {
            return "Arrive at the Carolina Harbor and locate the" + getColor() + " " + getName() +
                    " at " + getDeparture() + ". Your ticket will be taken as you board and you will be escorted to" +
                    "your seat";
        }
}
