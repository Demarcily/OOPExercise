package Exercises1.Ex11;

public class Circle {
  private double radius;
  private String color;

  public Circle() {
    radius = 1.0;
    color = "Red";
  }

  public Circle(double radius) {
    this.radius = radius;
    color = "Red";
  }

  public Circle(double radius, String color) {
    this.radius = radius;
    this.color = color;
  }

  public double getRadius() {
    return radius;
  }

  public String getColor() {
    return color;
  }

  public double getArea() {
    return (radius * radius * Math.PI);
  }

  public void setRadius(double newRadius) {
    this.radius = newRadius;
  }

  public void setColor(String newColor) {
    this.color = newColor;
  }

  public String toString() {
    return "Exercises1.Ex11.Circle [radius=" + radius + " color=" + color + "]";
  }
}