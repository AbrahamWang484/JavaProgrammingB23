package day38_CustomClass.CircleTask;

public class Circle {
    public double radius;

    public void setInfo(double radius) {
        this.radius = radius;
    }

    public double calculateArea(){
        return radius*radius*3.14;
    }

    public double calculatePerimeter(){
        return 2*3.14*radius;
    }

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", diameter=" + 2*radius +
                ", Area=" + calculateArea() +
                ", Perimeter=" + calculatePerimeter() +
                '}';
    }
}
