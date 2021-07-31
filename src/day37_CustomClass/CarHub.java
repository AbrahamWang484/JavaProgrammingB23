package day37_CustomClass;

public class CarHub {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setInfo("BMW","white","X1",35400,"2022");
        Car car2 = new Car();
        car2.setInfo("Toyota","black","Sienna",34460,"2021");
        Car car3 = new Car();
        car3.setInfo("Honda","grey","Odyssey",32290,"2022");

        car1.drive();
        car2.drive();
        car3.drive();

        System.out.println("--------------");
        car1.getInfo();
        System.out.println("--------------");
        car2.getInfo();
        System.out.println("--------------");
        car3.getInfo();
    }
}
