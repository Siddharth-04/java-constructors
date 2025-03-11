public class Book {
    String title;
    String author;
    double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public Book(){

    }

    public static void main(String[] args) {
        Book book = new Book("Panchtantra", "Vishnu Sharma", 300.0);
        System.out.println("Parametrized Constructor : ");
        System.out.println(book.title);
        System.out.println(book.author);
        System.out.println(book.price);

        System.out.println(" --------");

        System.out.println("Default Constructor : ");
        Book book2 = new Book();
        System.out.println(book2.title);
        System.out.println(book2.author);
        System.out.println(book2.price);
    }
}
//
//Parametrized Constructor :
//Panchtantra
//Vishnu Sharma
//300.0
// --------
//Default Constructor :
//  null
//  null
//  0.0
