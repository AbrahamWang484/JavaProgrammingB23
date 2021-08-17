package day46_Inheritance.ShapeTask;

public class Rectangle extends Shape{
    public Rectangle( double length, double width) {
        super("Rectangle", length, width);
    }

    @Override
    public double calcArea() {
        return length*width;
    }

    @Override
    public double calcPerimeter() {
        return (length+width)*2;
    }

    @Override
    public String toString() {
        return shape+", length: "+length+", width: "+width+ ", Area: " +calcArea()
                +", Peremeter: "+calcPerimeter();
    }
}
