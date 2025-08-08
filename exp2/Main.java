package exp2;

class BookOrder {
    String customerName;
    String bookTitle;
    double price;
    static String storeName = "Readers' Haven";

    BookOrder() {
        this.customerName = "Guest";
        this.bookTitle = "Unknown Book";
        this.price = 300.0;
    }

    BookOrder(String customerName, String bookTitle, double price) {
        this.customerName = customerName;
        this.bookTitle = bookTitle;
        this.price = price;
    }

    void displayOrder() {
        System.out.println("Customer: " + this.customerName);
        System.out.println("Book Title: " + this.bookTitle);
        System.out.println("Price: ₹" + this.price);
        System.out.println("Store: " + storeName);
        System.out.println("-----------------------------");
    }

    static void changeStoreName(String newName) {
        storeName = newName;
    }
}

public class Main {
    public static void main(String[] args) {
        BookOrder order1 = new BookOrder();
        BookOrder order2 = new BookOrder("Arjun", "Effective Java", 1200.0);

        System.out.println("Initial Orders:");
        order1.displayOrder();
        order2.displayOrder();

        BookOrder.changeStoreName("Page Turners Bookstore");

        System.out.println("After Changing Store Name:");
        order1.displayOrder();
        order2.displayOrder();
    }
}
