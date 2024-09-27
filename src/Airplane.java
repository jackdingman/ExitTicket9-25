public class Airplane extends Vehicle {
    private String airplaneName;
    private String constructionMaterial;
    private int staffQuantity;
    public Airplane(double cost, String manufacturer, int numberOfSeats, String airplaneName, String constructionMaterial, int staffQuantity) {
        super(cost, manufacturer, numberOfSeats);
        this.airplaneName = airplaneName;
        this.constructionMaterial = constructionMaterial;
        this.staffQuantity = staffQuantity;

    }
    public String getAirplaneName() {
        return airplaneName;
    }
    public void setAirplaneName(String airplaneName) {
        this.airplaneName = airplaneName;
    }
    public String getConstructionMaterial() {
        return constructionMaterial;
    }
    public void setConstructionMaterial(String constructionMaterial) {
        this.constructionMaterial = constructionMaterial;
    }
    public int getStaffQuantity() {
        return staffQuantity;
    }
    public void setStaffQuantity(int staffQuantity) {
        this.staffQuantity = staffQuantity;
    }
    @Override
    public String toString() {
        return "Manafacturer: " + getManufacturer() +"\n"+"Airplane Name: " + getAirplaneName() +"\n"+"Cost: " + getCost()+"\n"+"Construction Material: " + getConstructionMaterial()+"\n"+"Number of seats: "+getNumberOfSeats()+"\n"+"Staff quantity: "+getStaffQuantity()+"\n\n";
    }

}
