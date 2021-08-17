package day46_Inheritance.ShapeTask;

public class Circle extends Shape {


    public Circle(double radiumSide) {
        super("Circle", radiumSide);
    }

    @Override
    public double calcArea() {
        return 3.14 * radium * radium;
    }

    @Override
    public double calcPerimeter() {
        return  3.14 * 2 * radium;
    }

    @Override
    public String toString() {
        return  shape+", radium=" + radium + ", Area: " +calcArea()
                +", Peremeter: "+calcPerimeter();
    }
}
