package day45_Inheritance.employeeTask;

public class AmazonInc {
    public static void main(String[] args) {

        Tester tester = new Tester("Wang",'M',29,121,"Truck Driver",110000);
        tester.eat("sushi");
        tester.drink("water");

        Developer developer = new Developer("Oz",'M',24,122,"Truck Driver",140000);
        developer.eat("Noodle");
        developer.sleep();

        Driver driver = new Driver("John",'M',19,123,"Truck Driver",130000);
        driver.attendMeeting();
        driver.drive();


    }

}
