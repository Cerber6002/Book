public class Main {
    public static void main(String[] args) {
        // Creating books using the default constructor
        Book book1 = new Book();
        System.out.println("Book 1 (Default Constructor):");
        book1.displayInfo();
        System.out.println();

        // Creating books using the parameterized constructor
        Book book2 = new Book("War and Peace",
                "Leo Tolstoy", "9780140447934", 19.99);
        System.out.println("Book 2:");
        book2.displayInfo();
        System.out.println();

        Book book3 = new Book("Crime and Punishment",
                "Fyodor Dostoevsky", "9780140449136", 14.99);
        System.out.println("Book 3:");
        book3.displayInfo();
        System.out.println();

    }
}
