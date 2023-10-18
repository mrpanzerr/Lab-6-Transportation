/**
 *   @purpose create an Automobile subclass representing an
 *   automobile with attributes representing the make and model of an
 *   automobile and if it's stick shift operated or automatic
 *   @author Gaetano Panzer
 *   @date: 10.25.23
 *   @section: CSC 331-001
 */
public class Automobile extends LandTransportation{
    // Class Attributes
    private String make; private String model;
    private boolean stick;

    // Constructor
    public Automobile(String name, double cost, boolean purchaseType,
                      int averageSpeed, int numOfPassengers, String departure, String color,
                      int wheels, String infrastructure, String steer, String make, String model, boolean stick) {
        super(name, cost, purchaseType, averageSpeed, numOfPassengers,
                departure, color, wheels, infrastructure, steer);
        this.make = make; this.model = model; this.stick = stick;
    }

    // No Argument Constructor
    public Automobile() {
        this.setName("Automobile"); this.setCost(79.44); this.setPurchaseType(false);
        this.setAverageSpeed(60); this.setNumOfPassengers(5); this.setDeparture("10AM"); this.setWheels(4);
        this.setInfrastructure("Highway"); this.setColor("Black"); this.setSteer("Wheel");
        this.make = "Sonata"; this.model = "Sedan"; this.stick = false;
    }

    // Accessor Methods
    public String getMake() {return make;}
    public String getModel() {return model;}
    public boolean getStick() {return stick;}

    // Mutator Methods
    public void setMake(String make) {this.make = make;}
    public void setModel(String model) {this.model = model;}
    public void setStick(boolean stick) {this.stick = stick;}

    /**
     * display ALL information about the selected mode using an
     * overridden toString method
     * @return a string
     */
    @Override
    public String toString() {
        return super.toString() + String.format("%21s: %s\n%21s: %s\n%21s: %s\n",
                "Make", getMake(),
                "Model", getModel(),
                "Stick or Automatic", getStick() ? "Stick" : "Automatic");
    }

    /**
     * display travel instructions
     * @return a string
     */
    public String travelInstructions() {
        return "";
    }
}
