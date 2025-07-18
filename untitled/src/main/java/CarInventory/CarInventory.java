package CarInventory;

public class CarInventory {
    public static void main (String[] args) {
        Car sedan = new Sedan("1HGBH41JXMN109186", "Toyota", "Camry", 120000);
        Car suv= new UtilityVehicle("1HGCM82633A004352", "Subaru", "Outback", 90000, true);
        Car truck = new Truck("1FTFW1ET1EKF51234", "Ford", "F-150", 75000, 5.5);

        System.out.println(sedan.getInfo());
        System.out.println(suv.getInfo());
        System.out.println(truck.getInfo());
    }
}
