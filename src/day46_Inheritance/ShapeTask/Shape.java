package day46_Inheritance.ShapeTask;

public class Shape {
    public double radium, length, width,side;
    public String shape;

    public Shape(String shape, double radiumSide) {
        this.shape=shape;
        this.radium = radiumSide;
    }

    public Shape(String shape, double length, double width) {
        this.shape=shape;
        this.length = length;
        this.width = width;
    }
    public double calcArea(){
        return 0;
    }
    public double calcPerimeter(){
        return 0;
    }


    @Override
    public String toString() {
        return "Shape{" +
                "radium=" + radium +
                ", length=" + length +
                ", width=" + width +
                ", side=" + side +
                '}';
    }
}
