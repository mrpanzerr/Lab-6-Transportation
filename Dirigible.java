/**
 *   @purpose create a Dirigible subclass representing a
 *   dirigible with attributes representing the manufacturer and model
 *   @author Christian Boyer
 *   @date: 10.26.23
 *   @section: CSC 331-001
 */
public class Dirigible extends AirTransportation{
    // Class Attributes
    private String manufacturer; private String model;
    // Constructor
    public Dirigible(String name, double cost, boolean purchaseType,
                     int averageSpeed, int numOfPassengers, String departure, String color,
                     String fueledBy, String propelledBy, String pilotName,
                     String manufacturer, String model) {
        // From AirTransportation
        super(name, cost, purchaseType, averageSpeed, numOfPassengers,
                departure, color, fueledBy, propelledBy, pilotName);

        this.manufacturer = manufacturer; this.model = model;
    }

    // No Argument Constructor
    public Dirigible() {
        // From Transportation
        this.setName("Dirigible"); this.setCost(495.99); this.setPurchaseType(true);
        this.setAverageSpeed(35); this.setNumOfPassengers(12); this.setDeparture("12PM");
        this.setColor("White");

        // From AirTranportation
        this.setFueledBy("Gasoline"); this.setPropelledBy("Engine"); this.setPilotName("Tim");

        this.manufacturer = "Airship Industries"; this.model = "Hybrid";
    }
    // Accessors
    public String getManufacturer() {return manufacturer;}
    public String getModel() {return model;}

    // Mutators
    public void setManufacturer(String manufacturer) {this.manufacturer = manufacturer;}
    public void setModel(String model) {this.model = model;}

    /**
     * display ALL information about the selected mode using an
     * overridden toString method
     * @return a string
     */
    // From AirTransportation
    @Override
    public String toString(){
        return super.toString() + String.format("%21s: %s\n%21s: %s\n\n",
                "Manufacturer", getManufacturer(),
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
                "1. Arrive at Carolina Hills 30 minutes before departure time.\n" +
                "2. Present ticket or QR Code to front gate.\n" +
                "3. Locate the " + super.getColor() + " " + getModel() + " " + getName() + " brought to you by " + getManufacturer() + ".\n" +
                "4. Locate your seat and enjoy the ride!";
    }
}
