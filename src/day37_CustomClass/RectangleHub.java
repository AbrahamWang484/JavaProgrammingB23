package day37_CustomClass;

public class RectangleHub {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        rectangle1.setInfo(2,8);

        Rectangle rectangle2 = new Rectangle();
        rectangle2.setInfo(1.5, 2.5);

        System.out.println("rectangle1's Area() = " + rectangle1.calculateArea());
        System.out.println("rectangle2's Area() = " + rectangle2.calculateArea());
        System.out.println("rectangle1's Perimeter() = " + rectangle1.calculatePerimeter());
        System.out.println("rectangle2's Perimeter() = " + rectangle2.calculatePerimeter());

        System.out.println("----------");
        rectangle1.getInfo();
        System.out.println("----------");
        rectangle2.getInfo();
    }
}
