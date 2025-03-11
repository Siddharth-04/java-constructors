public class HotelBooking {
    String guestName;
    String roomType;
    int nights;

    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    public HotelBooking() {
        this.guestName = "Empty";
        this.roomType = "Empty";
        this.nights = 0;
    }

    public HotelBooking(HotelBooking booking1) {
        this.guestName = booking1.guestName;
        this.roomType = booking1.roomType;
        this.nights = booking1.nights;
    }

    public static void main(String[] args) {
        HotelBooking booking1 = new HotelBooking("Guest 1", "Room 1", 1);
        HotelBooking booking2 = new HotelBooking();
        HotelBooking booking3 = new HotelBooking(booking1);

        System.out.println("Parametrized constructor -> " +booking1.guestName + " " + booking1.roomType + " " + booking1.nights);
        System.out.println("Default constructor -> " +booking2.guestName + " " + booking2.roomType + " " + booking2.nights);
        System.out.println("Copy constructor -> " +booking3.guestName + " " + booking3.roomType + " " + booking3.nights);
    }
}

//Parametrized constructor -> Guest 1 Room 1 1
//Default constructor -> Empty Empty 0
//Copy constructor -> Guest 1 Room 1 1
