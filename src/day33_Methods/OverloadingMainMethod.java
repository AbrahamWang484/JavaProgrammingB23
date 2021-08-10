package day33_Methods;

public class OverloadingMainMethod {


    public static void main(char[] args) {

        System.out.println("char");

    }

    public static void main(String[] args) { // only run this one

        System.out.println("String");

    }

    public static void main(int[] args) {
        System.out.println("int");

    }


}