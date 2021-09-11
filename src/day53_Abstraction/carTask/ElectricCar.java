package day53_Abstraction.carTask;

class A{

    static int a;

    static{
        a=100;
    }

    int b;

    {
        b = 200;
    }


}

public interface  ElectricCar {


    boolean hasBattery = true; // public static final by default

    void charging();


    // 1 abstract method

    /*
    what we cannnot have:
    static{
    }
    {
    }
    void method1(){
    }
    public ElectricCar(){
    }
    instance variable
     */

}

