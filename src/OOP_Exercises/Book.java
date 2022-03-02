package OOP_Exercises;

public class Book {
    private String title;
    private Author[] authors;
    private double price;
    private int qty = 0;

    public Book(String title, Author[] authors, double price) {
        this.title = title;
        this.authors = authors;
        this.price = price;
    }

    public Book(String title, Author[] authors, double price, int qty) {
        this.title = title;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getTitle() {
        return this.title;
    }

    public Author[] getAuthors() {
        return this.authors;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return this.qty;
    }

    public void setQty() {
        this.qty = qty;
    }

    public String toString() {
        return "Book[title=" + this.getTitle() +
                ", authors={Author[name=" + this.authors[0].getName() +
                ", email=" + this.authors[0].getEmail() +
                ", gender=" + this.authors[0].getGender() +
                "]}, price=" + this.getPrice() +
                ", qty=" + this.getQty();
    }
}
