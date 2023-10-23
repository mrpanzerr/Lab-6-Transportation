/**
 * @purpose create a Bike subclass representing a bike with bike
 * related attributes such as terrain and whether it has a motor or not
 * @author Gaetano Panzer
 * @date: 10.25.23
 * @section: CSC 331-001
 */
public class Bike extends LandTransportation {
    // Class Attributes
    private boolean terrain; private boolean motor;

    // Constructor
    public Bike(String name, double cost, boolean purchaseType,
                int averageSpeed, int numOfPassengers, String departure, String color, int wheels,
                String infrastructure, String steer, boolean terrain, boolean motor) {
        // From LandTransportation
        super(name, cost, purchaseType, averageSpeed, numOfPassengers,
                departure, color, wheels, infrastructure, steer);

        this.motor = motor; this.terrain = terrain;
    }

    // No Argument Constructor
    public Bike() {
        // From Transportation
        this.setName("Bike"); this.setCost(120); this.setPurchaseType(false);
        this.setAverageSpeed(45); this.setNumOfPassengers(1); this.setDeparture("2PM"); this.setColor("Green");

        // From LandTransportation
        this.setWheels(2); this.setInfrastructure("Bike Path"); this.setSteer("Handle Bars");

        this.motor = true; this.terrain = true;
    }

    // Accessor Methods
    public boolean getMotor() {return motor;}
    public boolean getTerrain() {return terrain;}

    // Mutator Methods
    public void setMotor(boolean motor) {this.motor = motor;}
    public void setTerrain(boolean terrain) {this.terrain = terrain;}

    /**
     * display ALL information about the selected mode using an
     * overridden toString method
     * @return a string
     */
    // From LandTransportation
    @Override
    public String toString() {
        return super.toString() + String.format("%21s: %s\n%21s: %s\n\n",
                "Motor", getMotor() ? "Yes" : "No",
                "Terrain", getTerrain() ? "Pavement" : "Mountain");
    }

    /**
     * display travel instructions
     * @return a string
     */
    // From Transportation
    @Override
    public String travelInstructions() {
        return "You may pick up your " + getColor() + " " + getName() +
                " at " + getDeparture() + " at Hector's Bike Shop.\n" +
                "All rentals must be returned within 48 hours of your pickup time.";
    }
}
