package Exercises2.Ex23;

public class BookThree {
  private String isbn;
  private String name;
  private AuthorThree author;
  private double price;
  private int qty = 0;

  public BookThree(String isbn, String name, AuthorThree author, double price) {
    this.isbn = isbn;
    this.name = name;
    this.author = author;
    this.price = price;
  }
  public BookThree(String isbn, String name, AuthorThree author, double price, int qty) {
    this.isbn = isbn;
    this.name = name;
    this.author = author;
    this.price = price;
    this.qty = qty;
  }

  public String getISBN() {
    return isbn;
  }
  public String getName() {
    return name;
  }
  public AuthorThree getAuthor() {
    return author;
  }
  public double getPrice() {
    return price;
  }
  public int getQty() {
    return qty;
  }
  public String getAuthorName() {
    return author.getName();
  }

  public void setPrice(double price) {
    this.price = price;
  }
  public void setQty(int qty) {
    this.qty = qty;
  }

  public String toString() {
    return "Book [Isbn = " + isbn + ", Name = " + name + ", Author = " + author + ", Price = " + price + ", Qty = " + qty + "]";

  }
}
