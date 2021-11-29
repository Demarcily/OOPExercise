package Exercises2.Ex22;

public class TestAuthorTwo {
  public static void main(String [] args) {
    AuthorTwo ahTeck = new AuthorTwo("Tan Ah Teck", "ahteck@nowhere.com", 'm');
    System.out.println(ahTeck);
    ahTeck.setEmail("paulTan@nowhere.com");
    System.out.println("name is: " + ahTeck.getName());
    System.out.println("eamil is: " + ahTeck.getEmail());
    System.out.println("gender is: " + ahTeck.getGender());
  }
}
