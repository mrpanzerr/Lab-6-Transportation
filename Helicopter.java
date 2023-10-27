/**
 *   @purpose create a Helicopter subclass representing a
 *   helicopter with attributes representing the engine type and model
 *   @author Christian Boyer
 *   @date: 10.26.23
 *   @section: CSC 331-001
 */
public class Helicopter extends AirTransportation{
    // Class Attributes
    private String engineType; private String model;
    // Constructor
    public Helicopter(String name, double cost, boolean purchaseType,
                      int averageSpeed, int numOfPassengers, String departure, String color,
                      String fueledBy, String propelledBy, String pilotName,
                      String engineType, String model) {
        // From AirTransportation
        super(name, cost, purchaseType, averageSpeed, numOfPassengers,
                departure, color, fueledBy, propelledBy, pilotName);
        this.engineType = engineType; this.model = model;
    }

    // No Argument Constructor
    public Helicopter() {
        // From Transportation
        this.setName("Helicopter"); this.setCost(500.99); this.setPurchaseType(true);
        this.setAverageSpeed(160); this.setNumOfPassengers(8); this.setDeparture("3PM");
        this.setColor("Red");

        // From AirTransportation
        this.setFueledBy("Gasoline"); this.setPropelledBy("Propellers"); this.setPilotName("Mark");

        this.engineType = "Piston"; this.model = "mini";
    }

    // Accessors
    public String getEngineType() {return engineType;}
    public String getModel() {return model;}

    // Mutators
    public void setEngineType(String engineType) {this.engineType = engineType;}
    public void setModel(String model) {this.model = model;}

    /**
     * display ALL information about the selected mode using an
     * overridden toString method
     * @return a string
     */
    // From AirTransportation
    @Override
    public String toString() {
        return super.toString() + String.format("%21s: %s\n%21s: %s\n\n",
                "Engine Type", getEngineType(),
                "Model", getModel());
    }

    /**
     * display travel instructions
     * @return a string
     */
    // From Transportation
    @Override
    public String travelInstructions() {
        return "Departure Time: " + getDeparture() + "\n" +
                "1. Arrive at the Radiator Springs 30 minutes before departure time.\n" +
                "2. Present ticket or QR Code to front gate.\n" +
                "3. Locate the " + super.getColor() + " " + getModel() + " " + getName() + ".\n" +
                "4. Locate your seat and enjoy the ride!";
    }
}
