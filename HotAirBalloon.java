/**
 *   @purpose create an HotAirBalloon subclass representing a
 *   hot air balloon with attributes representing what the design on the basket is
 *   @author Christian Boyer
 *   @date: 10.26.23
 *   @section: CSC 331-001
 */
public class HotAirBalloon extends AirTransportation{
    // Class Attributes
    private String basketDesign;

    // Constructor
    public HotAirBalloon(String name, double cost, boolean purchaseType,
                         int averageSpeed, int numOfPassengers, String departure, String color,
                         String fueledBy, String propelledBy, String pilotName,
                         String basketDesign) {
        // From AirTransportation
        super(name, cost, purchaseType, averageSpeed, numOfPassengers,
                departure, color, fueledBy, propelledBy, pilotName);
        this.basketDesign = basketDesign;
    }

    // No Argument Constructor
    public HotAirBalloon() {
        this.setName("Hot Air Balloon"); this.setCost(250); this.setPurchaseType(true);
        this.setAverageSpeed(10); this.setNumOfPassengers(2); this.setDeparture("6PM");
        this.setColor("rainbow");

        // From AirTransportation
        this.setFueledBy("Propane"); this.setPropelledBy("Wind"); this.setPilotName("Bob");

        this.basketDesign = "floral";
    }

    // Accessors
    public String getBasketDesign() {return basketDesign;}

    // Mutators
    public void setBasketDesign(String basketDesign) {this.basketDesign = basketDesign;}

    /**
     * display ALL information about the selected mode using an
     * overridden toString method
     * @return a string
     */
    // From AirTransportation
    @Override
    public String toString(){
        return super.toString() + String.format("%21s: %s\n\n",
                "Basket Design", getBasketDesign());
    }

    /**
     * display travel instructions
     * @return a string
     */
    // From Transportation
    @Override
    public String travelInstructions() {
        return "Departure Time: " + getDeparture() + "\n" +
                "1. Arrive at Boone Balloons 30 minutes before departure time.\n" +
                "2. Present ticket or QR Code to front gate.\n" +
                "3. Locate the " + super.getColor() + " " + getName() + " with " +
                getBasketDesign() + "basket" + ".\n" +
                "4. Locate your seat and enjoy the ride!";
    }
}
