package day43_OOP_Encapsulation;

public class RectangleObject {

    public static void main(String[] args) {

        Rectangle r1 = new Rectangle(-1, -3);


        //   System.out.println(r1);

        r1.setLength(5);
        r1.setWidth(6);

        System.out.println(r1);//Rectangle{length=5.0, width=6.0}

        Rectangle r2 = new Rectangle(6, 5);
        System.out.println(r2); //Rectangle{length=6.0, width=5.0}

        System.out.println(r1.equals(r2)); //true


    }


}