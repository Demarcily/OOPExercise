package Exercises2.Ex22;

public class TestBookTwo {
  public static void main(String [] args) {
    AuthorTwo[] authors = new AuthorTwo[2];
    authors[0] = new AuthorTwo("Tan Ah Teck", "ahteck@nowhere.com", 'm');
    authors[1] = new AuthorTwo("Paul Tan", "paul@somewhere.com", 'm');

    BookTwo dummyBook = new BookTwo("Java for dummy", authors, 19.95, 99);
    System.out.println(dummyBook);
    System.out.println(dummyBook.getAuthor()[0].getName());
  }
}
