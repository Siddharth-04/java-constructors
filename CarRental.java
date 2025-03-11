public class CarRental {
    String customerName;
    String carModel;
    int rentalDays;

    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    public double totalCost(){
        return (double) this.rentalDays * 500.50;
    }

    public static void main(String[] args) {
        CarRental car1 = new CarRental("Siddharth", "BMW", 5);
        System.out.println("Total cost for renting for 5 days is : " + car1.totalCost());
    }
}

//Total cost for renting for 5 days is : 2502.5
