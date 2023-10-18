/**
 *   @purpose create a Train subclass representing a train with train related
 *   attributes such as style of train and weather it's steam or electric powered
 *   @author Gaetano Panzer
 *   @date: 10.25.23
 *   @section: CSC 331-001
 */
public class Train extends LandTransportation {
    // Class Attributes
    private String style; private boolean steam;

    // Constructor
    public Train(String name, double cost, boolean purchaseType,
                 int averageSpeed, int numOfPassengers, String departure, String color, int wheels,
                 String infrastructure, String steer, String style, boolean steam) {
        super(name, cost, purchaseType, averageSpeed, numOfPassengers,
                departure, color, wheels, infrastructure, steer);
        this.style = style; this.steam = steam;
    }

    // No Argument Constructor
    public Train() {
        this.setName("Train"); this.setCost(47.27); this.setPurchaseType(true);
        this.setAverageSpeed(300); this.setNumOfPassengers(200); this.setDeparture("9AM"); this.setWheels(0);
        this.setColor("White"); this.setInfrastructure("Rail"); this.setSteer("Brake Lever");
        this.style = "Bullet"; this.steam = false;
    }

    // Accessor Methods
    public String getStyle() {return style;}
    public boolean getSteam() {return steam;}


    // Mutator Methods
    public void setStyle(String style) {this.style = style;}
    public void setSteam(boolean steam) {this.steam = steam;}

    /**
     * display ALL information about the selected mode using an
     * overridden toString method
     * @return a string
     */
    @Override
    public String toString() {
        return super.toString() + String.format("%21s: %s\n%21s: %s\n",
                "Style", getStyle(),
                "Steam or Electric", getSteam() ? "Steam" : "Electric");
    }

    /**
     * display travel instructions
     * @return a string
     */
    public String travelInstructions() {
        return "Departure Time: " + getDeparture() + "\n" +
                "1. Arrive at station 30 minutes before departure time\n" +
                "2. Present ticket or QR Code to front gate\n" +
                "3. Locate the " + super.getColor() + " " + getStyle() + " train\n" +
                "4. Locate your seat and enjoy the ride\n";
    }
}
