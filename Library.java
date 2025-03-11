public class Library {
    String title;
    String author;
    double price;
    boolean availabilty;

    public Library(String title, String author, double price, boolean availabilty) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.availabilty = availabilty;
    }

    public void borrowBook() {
        if(this.availabilty) {
            System.out.println("Borrowing Booking for " + this.title + " from library " + " at " + this.price);
        }
        else {
            System.out.println("This booking is not available ");
        }
    }

    public static void main(String[] args) {
        Library library = new Library("Panchtantra", "Vishnu Sharma", 1000, true);
        library.borrowBook();
    }
}
//Borrowing Booking for Panchtantra from library  at 1000.0
