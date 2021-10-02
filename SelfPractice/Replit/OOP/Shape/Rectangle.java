package Replit.OOP.Shape;
/*
Rectangle class
Inherits and implements the Shape class

Instance variables: (private):

double: width, length
Create a constructor to set the values for the variables

Implement methods

  area: w*l
  perimeter: 2*w*l
 */

class Rectangle extends Shape{
private double width, length;

    public Rectangle(double width, double length) {
        setWidth(width);
        setLength(length);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double area() {
        return getLength()*getWidth();
    }

    @Override
    public double perimeter() {
        return 2*getWidth()+2*getLength();
    }
}