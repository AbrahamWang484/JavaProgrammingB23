package day38_CustomClass.CircleTask;

public class Circle {
    public double radius, diameter;


    public void setInfo(double radius) {
        this.radius = radius;
        diameter = 2 * radius;
    }

    public double area() {
        return radius * radius * Math.PI;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                ", Area=" + area() +
                ", Perimeter=" + perimeter() +
                '}';
    }
}
/*
CircleTask
		1. create a class named Student that has the followings features
            Attributes:
                    radius, diameter
                methods:
                    caculateArea(): returs the area of the circle
                    calculatePerimeter(): returns the perimeter of the circle
                    setInfo(): initializes all the instance of the Circle
                    toString(): displays the radius, diameter, perimeter and area of the circle object
 */
