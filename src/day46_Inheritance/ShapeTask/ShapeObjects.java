package day46_Inheritance.ShapeTask;

public class ShapeObjects {
    public static void main(String[] args) {

        Circle circle= new Circle(5);
        circle.calcPerimeter();
        circle.calcPerimeter();
        System.out.println(circle);

        Rectangle rectangle= new Rectangle(10,5);
        rectangle.calcArea();
        rectangle.calcPerimeter();
        System.out.println(rectangle);

        Square square= new Square(5);
        square.calcArea();
        square.calcPerimeter();
        System.out.println(square);
    }
}
