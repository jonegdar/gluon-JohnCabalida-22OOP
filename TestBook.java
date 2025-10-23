// The Book class is a public class (the namesake of Book.java) and serves as a template for objects
// The Book objects (book1 and book2) are "instances", which are like variables that follow a template (their class).

public class TestBook {
    public static void main(String[] args) {
        // An instance for a physics book
        Book book1 = new Book("UNIVERSITY PHYSICS with MODERN PHYSICS", 
                            "Sears & Zemansky", 
                            "education", 2999.99, false, false);

        // Another intance, but for a Greek mythology book
        Book book2 = new Book("MYTHOLOGY", 
                            "Edith Hamilton", 
                            "fiction", 439.99, true, true);

        System.out.println("<<<<<-----Welcome to the OneAndOnly Bookstore!---->>>>>");
        System.out.println("       Here are 2 popular books that we recommend\n");

        book1.bookDetailCheck();
        book1.bookAvailable();
        book1.priceCheck();
        System.out.println("");
        book2.bookDetailCheck();
        book2.bookAvailable();
        book2.priceCheck();
    }
}