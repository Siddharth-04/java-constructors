public class Book {
    public String isbn;
    protected String title;
    private String author;

    public Book(String isbn, String title) {
        this.isbn = isbn;
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public String getAuthor() {
        return this.author;
    }
}
class Ebook extends Book {
    public Ebook(String isbn, String title) {
        super(isbn, title);
    }

    public static void main(String[] args) {
        //Book book = new Book("32456782","Panchtantra");
        Ebook book1 = new Ebook("8765432","Panchtantra");
        book1.setAuthor("New Author");
        System.out.println(book1.getAuthor());
        System.out.println(book1.isbn);
        System.out.println(book1.title);
    }
}

//New Author
//8765432
//Panchtantra
