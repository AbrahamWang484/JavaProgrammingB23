package day49_Exceptions;

public class Circle {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius<0){
            throw new RuntimeException("Radius of the circle cannot be negative");// throw to exception
        }
        this.radius = radius;
    }

    public Circle(double radius) {
        setRadius(radius);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}

