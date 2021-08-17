package day45_Inheritance.animalTask;

public class Dog extends Animal{
    public Dog(String name, String breed, char gender, String size, int age, String color) {
        setInfo(name, breed, gender, size, age, color);
    }
    public void bark(){
        System.out.println(name+" is barking.");
    }
}
