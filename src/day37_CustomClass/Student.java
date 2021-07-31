package day37_CustomClass;

public class Student {
    public String name;
    public String gender;
    public int age;
    public String ID;

    public void eat(String food){
        System.out.println(name + " is eating "+food );
    }

    public void sleep(){
        System.out.println( name +" is sleeping now");
    }

    public void drink (String beverage){
        System.out.println(name +" is drinking "+ beverage);
    }

    public void coding(String language){
        System.out.println(name +" is now studying "+language);
    }

    public void setInfo(String studentName, String studentGender, String studentID,int studentAge){
        name=studentName;
        gender=studentGender;
        ID=studentID;
        age= studentAge;
    }
    public void getInfo(){
        System.out.println("name = " + name);
        System.out.println("gender = " + gender);
        System.out.println("age = " + age);
        System.out.println("ID = " + ID);
    }
}
