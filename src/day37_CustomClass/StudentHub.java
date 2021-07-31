package day37_CustomClass;

public class StudentHub {
    public static void main(String[] args) {
        Student student1= new Student();
        student1.setInfo("Wang","male","001",24);

        Student student2= new Student();
        student2.setInfo("Ibrahim","male","002",26);

        Student student3= new Student();
        student3.setInfo("Adam","male","003",21);

        student1.eat("Hotdog");
        student2.sleep();
        student3.coding("C");
        student1.drink("coke");

        System.out.println("--------------");
        student1.getInfo();
        System.out.println("--------------");
        student2.getInfo();
        System.out.println("--------------");
        student3.getInfo();
    }

}
