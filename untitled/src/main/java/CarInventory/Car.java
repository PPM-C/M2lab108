package CarInventory;

public abstract class Car {
    protected String vinNumber;
    protected String make;
    protected String model;
    protected int mileage;

    //Constructor
    public Car(String vinNumber, String make, String model, int mileage) {
        this.vinNumber = vinNumber;
        this.make = make;
        this.model = model;
        this.mileage = mileage;
    }

    // Abstract
    public String getInfo(){
    return "VIN:" + vinNumber +"\n"
            + "Make:" + make + "\n"
            + "Model:" + model + "\n"
            + "Mileage:" + mileage +"KM";
    }

}
