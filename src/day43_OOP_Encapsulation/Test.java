package day43_OOP_Encapsulation;

import static day43_OOP_Encapsulation.AccessModifiers.publicVariable;

public class Test {

    public static void main(String[] args) {
        //you also can import the static
        System.out.println( publicVariable ); //public access modifier is reachable within the same package
        System.out.println(AccessModifiers.defaultVariable); //default access modifier is reachable within the same package
        //     System.out.println(AccessModifiers.privateVariable); //private access modifier is not reachable within the same package
        System.out.println("------------------------------------------");

        EncapsulationIntro obj = new EncapsulationIntro();

        /*
        System.out.println(obj.username);
        System.out.println(obj.password);
        obj.username = "H";
        obj.password = "123";
        System.out.println(obj.username);
        System.out.println(obj.password);
         */

        System.out.println(obj.getUsername() );
        System.out.println(obj.getPassword());

        obj.setUsername("H");
        obj.setPassword("123");

        System.out.println(obj.getUsername() );
        System.out.println(obj.getPassword());







    }

}