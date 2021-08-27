package day50_Exceptions;

public class RectangleObjects {

    public void method() throws Throwable {

        this.finalize(); // clean up
    }

    public final static void main(String[] args) {

        Rectangle r1 = new Rectangle(5, 4);

        System.out.println(r1);

        String str = "Java";
        str = "Python";

        System.out.println(str);


    }





}