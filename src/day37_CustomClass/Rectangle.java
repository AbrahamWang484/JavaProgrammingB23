package day37_CustomClass;

public class Rectangle {
    public double length;
    public double width;
    public double area;
    public double perimeter;

    public void setInfo(double rectangleLength, double rectangleWidth){
        length=rectangleLength;
        width= rectangleWidth;
    }
    public double calculateArea(){
        double area = length * width ;
        return area;
    }

    public double calculatePerimeter(){
        double perimeter = (length + width ) *2;
        return perimeter;
    }

    public void getInfo(){
        System.out.println("length = " + length);
        System.out.println("width = " + width);
        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);
    }
}
