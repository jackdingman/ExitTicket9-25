public class Motorcycle extends Vehicle {

    private double mufflerDecibels; //for measuring how loud the cycle is
    private double topSpeed;

    public Motorcycle(double cost, String manufacturer, int numberOfSeats, double mufflerDecibels, double topSpeed) {
        super(cost, manufacturer, numberOfSeats);
        this.mufflerDecibels = mufflerDecibels;
        this.topSpeed = topSpeed;

    }
    public double getMufflerDecibels() {
        return mufflerDecibels;
    }
    public void setMufflerDecibels(double mufflerDecibels) {
        this.mufflerDecibels = mufflerDecibels;
    }
    public double getTopSpeed() {
        return topSpeed;
    }
    public void setTopSpeed(double topSpeed) {
        this.topSpeed = topSpeed;
    }

    @Override
    public String toString() {
        return "Manufacturer: " + getManufacturer() +"\n"+"Top Speed: " + getTopSpeed() +"\n"+"Cost: " + getCost()+"\n"+"Muffler Decibels: "+getMufflerDecibels()+"\n"+"Number of seats: " +getNumberOfSeats() +"\n\n";

    }
}
