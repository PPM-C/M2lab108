package CarInventory;

public class Truck extends Car {
    private double towingCapacity;

    public Truck (String vinNumber, String make, String model, int mileage, double towingCapacity) {
        super(vinNumber, make, model, mileage);
        this.towingCapacity = towingCapacity;
    }
    @Override
    public String getInfo() {
        return "Truck" + super.getInfo()+
                "Towing Capacity:" + towingCapacity+ "Tons";
    }
}
