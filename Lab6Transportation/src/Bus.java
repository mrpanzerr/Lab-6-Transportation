/**
 *   @purpose create a bus subclass representing a bus with
 *   attributes party, representing if the bus is a party bus, and
 *   luxury, representing the luxury level of the bus
 *   @author Gaetano Panzer
 *   @date: 10.25.23
 *   @section: CSC 331-001
 */
public class Bus extends LandTransportation {
    // Class Attributes
    private boolean party; private String luxury;

    // Constructor
    public Bus(String name, double cost, boolean purchaseType, int averageSpeed,
               int numOfPassengers, String departure, String color, int wheels,
               String infrastructure, String steer, boolean party, String luxury) {
        // From LandTransportation
        super(name, cost, purchaseType, averageSpeed, numOfPassengers, departure, color, wheels, infrastructure, steer);

        this.party = party; this.luxury = luxury;
    }

    // No Argument Constructor
    public Bus() {
        // From Transportation
        this.setName("Bus"); this.setCost(9.99); this.setPurchaseType(true);
        this.setAverageSpeed(50); this.setNumOfPassengers(50); this.setDeparture("1230PM"); this.setColor("Yellow");

        // From LandTransportation
        this.setWheels(4);this.setInfrastructure("Highway"); this.setSteer("Wheel");

        this.party = false; this.luxury = "Basic";
    }

    // Accessor Methods
    public boolean getParty() {return party;}
    public String getLuxury() {return luxury;}

    // Mutator Methods
    public void setParty(boolean party) {this.party = party;}
    public void setLuxury(String luxury) {this.luxury = luxury;}

    /**
     * display ALL information about the selected mode using an
     * overridden toString method
     * @return a string
     */
    // From LandTransportation
    @Override
    public String toString() {
        return super.toString() + String.format("%21s: %s\n%21s: %s\n\n",
                "Party Bus", getParty() ? "Yes" : "No",
                "Luxury Level", getLuxury());
    }

    /**
     * display travel instructions
     * @return a string
     */
    // From Transportation
    @Override
    public String travelInstructions() {
        return "The bus leaves at " + getDeparture() + " sharp!\n" +
                "You will be looking for the " + getColor() + " " + getName() + "\n" +
                "located on the corner of 17 and Red Bug Road.";
    }
}
