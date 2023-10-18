/**
 *   @purpose create a LandTransportation subclass representing
 *   transportation by train, automobile, bus or bike with attributes
 *   representing how many wheels, whether the mode is human or machine
 *   powered and whether the mode travels on rails or on roads
 *   @author Gaetano Panzer
 *   @date: 10.25.23
 *   @section: CSC 331-001
 */
public class LandTransportation extends Transportation {
    // Class Attributes
    private int wheels;
    private String infrastructure;
    private String steer;

    // Constructor
    public LandTransportation(String name, double cost, boolean purchaseType,
                              int averageSpeed, int numOfPassengers, String departure,
                              String color, int wheels, String infrastructure, String steer) {
        super(name, cost, purchaseType, averageSpeed, numOfPassengers, departure, color);
        this.wheels = wheels; this.infrastructure = infrastructure; this.steer = steer;
    }

    // No Argument Constructor
    public LandTransportation() {
        this.setName("Taxi"); this.setCost(29.99); this.setPurchaseType(true);
        this.setAverageSpeed(55); this.setNumOfPassengers(2); this.setDeparture("12AM");
        this.setColor("Yellow"); this.wheels = 4; this.infrastructure = "Road";
        this.steer = "Wheel";
    }

    // Accessor Methods
    public int getWheels() {return wheels;}
    public String getInfrastructure() {return infrastructure;}
    public String getSteer() {return steer;}

    // Mutator Methods
    public void setWheels(int wheels) {this.wheels = wheels;}
    public void setInfrastructure(String infrastructure) {this.infrastructure = infrastructure;}
    public void setSteer(String steer) {this.steer = steer;}
    /**
     * display ALL information about the selected mode using an
     * overridden toString method
     * @return a string
     */
    @Override
    public String toString() {
        return super.toString() + String.format("%21s: %s\n%21s: %d\n%21s: %s\n",
                "Infrastructure", getInfrastructure(),
                "Number of Wheels", getWheels(),
                "Steering Method", getSteer());

    }
}
