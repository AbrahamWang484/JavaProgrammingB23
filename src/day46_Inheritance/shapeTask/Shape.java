package day46_Inheritance.shapeTask;


public class Shape {

    private final String name;
    public final static boolean isShape, hasArea, hasPerimeter;

    static{
        isShape = true;
        hasArea = true;
        hasPerimeter = true;
    }

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double area(){
        return 0;
    }

    public double perimeter(){
        return 0;
    }



    @Override
    public String toString() {
        return ", area= " + area()  +
                ", perimeter= " + perimeter();
    }


}
/*
1. create a class called Shape
						variables: name, isShape(boolean), hasArea(boolean), hasPerimeter(boolean)
						add a constructor that can set all the fields
						methods: calcArea(), calcPerimeter(),
								 toString(): returns the name, area and perimeter that are returned by calcArea(), calcPerimeter()
 */