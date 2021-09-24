package Exercises1.Ex12;

public class TestCircleTwo {
  public static void main(String[] args) {
    // Test Constructors and toString()
    CircleTwo c1 = new CircleTwo(1.1);
    System.out.println(c1);   // toString()
    CircleTwo c2 = new CircleTwo(); // default constructor
    System.out.println(c2);

    // Test setter and getter
    c1.setRadius(2.2);
    System.out.println(c1);      // toString()
    System.out.println("radius is: " + c1.getRadius());

    // Test getArea() and getCircumference()
    System.out.printf("area is: %.2f%n", c1.getArea());
    System.out.printf("circumference is: %.2f%n", c1.getCircumference());
  }
}
