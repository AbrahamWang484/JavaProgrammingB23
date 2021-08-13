package day43_OOP_Encapsulation;

public class Test {
    int num = 10;

    public Test() {

    }

    public static void main(String[] args) {
        Test obj1 = new Test();
        obj1.num = 20;
        Test obj2 = new Test();
        System.out.println("obj1.num = "+obj1.num); //20
        System.out.println("obj2.num = "+obj2.num); //10
    }
}
