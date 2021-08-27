package day49_Exceptions;

public class CircleObjects {
    public static void main(String[] args) {
        Circle circle= null;
        try {
            circle = new Circle(-1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(circle);
    }
}
