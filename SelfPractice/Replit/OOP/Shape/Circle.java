package Replit.OOP.Shape;
/*
Circle class
Inherits and implements the Shape class

Create a constructor to set the values for the variables

Instance variables: (private):

double: radius
Implement methods

  area: π*r^2
  perimeter: 2*π*r
 */
class Circle extends Shape{
private double radius;

    public Circle(double radius) {
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return 3.14*getRadius()*getRadius();
    }

    @Override
    public double perimeter() {
        return 3.14*getRadius()*2;
    }
}