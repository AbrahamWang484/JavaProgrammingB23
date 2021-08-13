package day43_OOP_Encapsulation;

public class Circle {
    //               5     20
    private double radius, diameter;

    private static double PI = 3.14;

    public double getRadius(){
        return radius;
    }

    public double getDiameter(){
        return  diameter;
    }

    public void setRadius(double radius){
        if(radius < 0){
            System.out.println("Radius can not be negative");
            return;
        }
        this.radius  =radius; // r= 3
        diameter = radius * 2;
    }

    public void setDiameter(double diameter){
        if(diameter < 0){
            System.out.println("Diameter of the circle cannot be negative");
            return;
        }
        this.diameter = diameter;
        radius = diameter/2;
    }

    //constructor
    public Circle(double radius) {
        setRadius(radius);
    }

    public double area(){
        return radius * radius * PI;
    }

    public double perimeter(){
        return diameter * PI;
    }

    public boolean equals(Circle circle){
        return radius == circle.radius;
    }


    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                '}';
    }
}

/*
1. Create a class named Circle
			Private variables:
				radius, diameter, PI
			generate getter & setter for all private fileds
					Make sure that radius & diameter of circle can never be set to negative
			add a constructor that can set all the fields
			Extra methods:
				equal(): accepts a Circle Object and returns true if the given circle is equal to the current circle
				calcArea(): returns the area
				calcPerimeter(): returns the perimeter
				toString()
 */