package Exercises1.Ex12;

public class CircleTwo {
  private double radius;

  public CircleTwo() {
    radius = 1.0;
  }

  public CircleTwo(double radius) {
    this.radius = radius;
  }

  public double getRadius() {
    return radius;
  }

  public double getArea() {
    return (radius * radius * Math.PI);
  }

  public void setRadius(double newRadius) {
    this.radius = newRadius;
  }

  public double getCircumference() {
    return (2*Math.PI*radius);
  }

  public String toString() {
    return "Exercises1.Ex11.Circle [radius=" + radius + "]";
  }
}
