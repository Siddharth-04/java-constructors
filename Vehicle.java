public class Vehicle {
    String ownerName;
    String vehicleType;
    static double registrationFee = 500.50;

    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public void display() {
        System.out.println("Owner: " + this.ownerName);
        System.out.println("Vehicle Type: " + this.vehicleType);
    }

    static void updateRegistrationFee(double newRegistrationFee) {
        registrationFee = newRegistrationFee;
    }
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Siddharth", "SUV");
        vehicle.display();
        updateRegistrationFee(700);
        System.out.println("New registration fee after update : " + Vehicle.registrationFee);
    }
}
//Owner: Siddharth
//Vehicle Type: SUV
//New registration fee after update : 700.0
