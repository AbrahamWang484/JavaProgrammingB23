package day37_CustomClass;

public class Rectangle {
    public double length, width;

    public void setInfo(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }

    public double calculatePerimeter() {
        return (length + width) * 2;
    }

    public void getInfo() {
        System.out.println("length = " + length);
        System.out.println("width = " + width);
        System.out.println("area = " + calculateArea());
        System.out.println("perimeter = " + calculatePerimeter());
    }

    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", area=" + calculateArea() +
                ", perimeter=" + calculatePerimeter()+
        '}';
    }
}
