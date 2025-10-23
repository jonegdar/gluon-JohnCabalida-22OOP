public class Book {
    // In my book store, the following are book details you can view:
    private String title;
    private String author;
    private String genre;
    private double price;
    private boolean onSale;
    private boolean available;

    // Formalizes the details for a specific book
    public Book(String title, String author, String genre, double price, boolean onSale, boolean available) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.price = price;
        this.onSale = onSale;
        this.available = available;
    }

    // Dispays title, author/s, year of publishment, and genre of book
    public void bookDetailCheck() {
        System.out.println("<<<<<----------------BOOK DETAILS----------------->>>>>");
        System.out.println("Title: " + this.title);
        System.out.println("Author/s: " + this.author);
        System.out.println("Genre: " + this.genre);
    }

    // Availability (in store) checker
    public void bookAvailable() {
        if (this.available == true) {
            System.out.println("Available: Yes");
        } else {
            System.out.println("Available: No");
        }
    }

    // Price & discount checker (30% discount if on sale)
    public void priceCheck() {
        if (this.onSale == true) {
            System.out.println("<------DISCOUNT ALERT!! This book is now on sale------>");
            System.out.printf("            Your book is now just P%.2f\n", (this.price - (this.price * 0.30)));
            System.out.println("<-----------------with a 30% discount!---------------->");
        } else {
            System.out.printf("<<<------Your book is currently worth P%.2f------>>>\n", this.price);
        }
    }
}