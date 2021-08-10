package day42_CustomClass_Constructors;

public class CybertekStudent {
    public String name, schoolName, fieldOfStudy, programmingLanguage;
    public char gender;
    public int age;

    public CybertekStudent(String name, String schoolName, String fieldOfStudy, String programmingLanguage, char gender, int age) {
        this.name = name;
        this.schoolName = schoolName;
        this.fieldOfStudy = fieldOfStudy;
        this.programmingLanguage = programmingLanguage;
        this.gender = gender;
        this.age = age;
    }

    @Override
    public String toString() {
        return "CybertekStudent{" +
                "name='" + name + '\'' +
                ", schoolName='" + schoolName + '\'' +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                ", programmingLanguage='" + programmingLanguage + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }

    public void  attendClass(){
        System.out.println(name +" attend the class");
    }

    public void replit(){
        System.out.println(name +" is doing replit.");
    }
}
/*
4. create a class named CybertekStudent
            Variables:
                name, gender, age, schoolName, fieldOfStudy, programmingLanguage
            Add a constructor to initialize all the fields
            Add a static block to initialize all the statics
            methods:
                attendClass(), replit(), toString()
 */