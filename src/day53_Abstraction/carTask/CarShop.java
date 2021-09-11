package day53_Abstraction.carTask;

public class CarShop {
    public static void main(String[] args) {
        Honda honda =new Honda("Civic","dark blue",2018,19500);
        honda.drive();
        honda.start();
//        honda.selfDrive();
//        honda.autoPark();
//        honda.charging();
        
        
        
        Ford ford =new Ford("Mustang","black",2019,25800);
        ford.drive();
        ford.start();
//        ford.selfDrive();
//        ford.autoPark();
//        ford.charging();
        
        
        Porsche porsche=new Porsche("Cayman","red",2017,68000);
        porsche.drive();
        porsche.start();
//        porsche.selfDrive();
        porsche.autoPark();
//        porsche.charging();
        
        
        
        
        Audi audi =new Audi("A8","white",2020,83400);
        audi.drive();
        audi.start();
//        audi.selfDrive();
        audi.autoPark();
//        audi.charging();
        
        
        Tesla tesla =new Tesla("S","blue",2021,120000);
        tesla.drive();
        tesla.start();
        tesla.selfDrive();
        tesla.autoPark();
        tesla.charging();
        
        
        Nio nio =new Nio("ET7","white",2020,68000);
        nio.drive();
        nio.start();
        nio.selfDrive();
        nio.autoPark();
        nio.charging();
    }
}
