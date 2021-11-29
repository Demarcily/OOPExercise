package Exercises2.Ex22;

public class BookTwo {
  private String name;
  private AuthorTwo[] author;
  private double price;
  private int qty = 0;

  public BookTwo(String name, AuthorTwo[] author, double price) {
    this.name = name;
    this.author = author;
    this.price = price;

  }

  public BookTwo(String name, AuthorTwo[] author, double price, int qty) {
    this.name = name;
    this.author = author;
    this.price = price;
    this.qty = qty;
  }

  public String getName() {
    return name;
  }
  public AuthorTwo[] getAuthor() {
    return author;
  }
  public double getPrice() {
    return price;
  }
  public int getQty() {
    return qty;
  }

  public void setPrice(double price) {
    this.price = price;
  }
  public void setQty(int qty) {
    this.qty = qty;
  }

  public String toString() {
    return "Book[name=" + name + ", Author=" + author[0] + ", " + author[1] + ", price=" + price + ", qty=" + qty + "]";
  }
}
