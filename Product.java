class Product {
    String productName;
    double price;
    static int totalProducts;

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }

    public void display() {
        System.out.println("Product Name: " + this.productName);
        System.out.println("Product Price: " + this.price);
    }

    static void totalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }

    public static void main(String[] args) {
        Product p1 = new Product("Apple", 10.0);
        p1.display(); //instance method called by instance
        Product.totalProducts(); //class method called by classname
    }
}

//Product Name: Apple
//Product Price: 10.0
//Total Products: 1
