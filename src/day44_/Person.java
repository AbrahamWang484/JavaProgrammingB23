package day44_;

import java.time.LocalDate;

public class Person {
    private String name;
    private final char gender;
    private int age;
    private final LocalDate dateOfBirth;
    private final String countryOfBirth;
    private final String language;
    private final static boolean isHuman;
    private final static boolean planet;
    static {
        isHuman=true;
        planet =true;
    }
    public Person(String name, char gender, int age, LocalDate dateOfBirth, String countryOfBirth, String language) {
        setName(name);
        this.gender = gender;
        setAge(age);
        this.dateOfBirth = dateOfBirth;
        this.countryOfBirth = countryOfBirth;
        this.language = language;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getCountryOfBirth() {
        return countryOfBirth;
    }

    public String getLanguage() {
        return language;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void eat(String food){
        System.out.println(name +" is eating "+food);
    }
    public void sleep(){
        System.out.println(name +" is sleeping now");
    }
    public void drink(String beverage){
        System.out.println(name+" is drinking "+beverage);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", dateOfBirth=" + dateOfBirth +
                ", countryOfBirth='" + countryOfBirth + '\'' +
                ", language='" + language + '\'' +
                ", isHuman=" + isHuman +
                ", planet=" + planet +
                '}';
    }

    public static void main(String[] args) {
        Person person = new Person("Ahmed",'M',32,LocalDate.of(1989,03,01),"China","Chinese,");
        System.out.println(person);
        person.drink("coke");
        person.eat("Kabab");
        person.sleep();

    }
}
