package day46_Inheritance.ShapeTask;

public class Square extends Shape{
    public Square( double radiumSide) {
        super("Square", radiumSide);
    }

    @Override
    public double calcArea() {
        return radium*radium;
    }

    @Override
    public double calcPerimeter() {
        return 4*radium;
    }

    @Override
    public String toString() {
        return shape+", side=" + radium + ", Area: " +calcArea()
                +", Peremeter: "+calcPerimeter();
    }
}
