/**
 *   @purpose create a Plane subclass representing a
 *   plane with attributes representing its wingspan, engine type
 *   and whether it's commercial or not
 *   @author Christian Boyer
 *   @date: 10.26.23
 *   @section: CSC 331-001
 */
public class Plane extends AirTransportation{
    // Class Attributes
    private String airline; private String engineType; private boolean isCommercial;
    // Constructor
    public Plane(String name, double cost, boolean purchaseType,
                 int averageSpeed, int numOfPassengers, String departure, String color,
                 String fueledBy, String propelledBy, String pilotName,
                 String airline, String engineType, boolean isCommercial) {
        // From AirTransportation
        super(name, cost, purchaseType, averageSpeed, numOfPassengers,
                departure, color, fueledBy, propelledBy, pilotName);
        this.airline = airline; this.engineType = engineType; this.isCommercial = isCommercial;
    }

    // No Argument Constructor
    public Plane() {
        // From Transportation
        this.setName("Plane"); this.setCost(200); this.setPurchaseType(true);
        this.setAverageSpeed(575); this.setNumOfPassengers(850); this.setDeparture("8AM");
        this.setColor("White");

        // From AirTransportation
        this.setFueledBy("Gasoline"); this.setPropelledBy("Engine"); this.setPilotName("Eric");

        this.airline = "Delta"; this.engineType = "Turbofan"; this.isCommercial = true;
    }

    // Accessors
    public String getAirline() {return airline;}
    public String getEngineType() {return engineType;}
    public boolean getIsCommercial() {return isCommercial;}

    // Mutators
    public void setAirline(String airline) {this.airline = airline;}
    public void setEngineType(String engineType) {this.engineType = engineType;}
    public void setIsCommercial(boolean isCommercial) {this.isCommercial = isCommercial;}

    /**
     * display ALL information about the selected mode using an
     * overridden toString method
     * @return a string
     */
    // From AirTransportation
    @Override
    public String toString() {
        return super.toString() + String.format("%21s: %s\n%21s: %s\n%21s: %s\n\n",
                "Airline", getAirline(),
                "Engine Type", getEngineType(),
                "Is Commercial", getIsCommercial());
    }

    /**
     * display travel instructions
     * @return a string
     */
    // From Transportation
    @Override
    public String travelInstructions() {
        return "Departure Time: " + getDeparture() + "\n" +
                "1. Arrive at the Wilmington International Airport two hours before departure time.\n" +
                "2. Check in baggage and get boarding pass from " + getAirline() + " agent\n" +
                "3. Go through security and locate the gate near your " + getName() + "\n" +
                "4. Wait to board if not already boarding\n" +
                "5. Hand the " + getAirline() + " agent your boarding pass when your group is called\n" +
                "6. Locate your seat and enjoy the ride!";
    }
}