package day42_CustomClass_Constructors;

public class Dog {
    public String breed,size,  color;
    public char  gender;
    public int age,numberOfLegs, numberOfEyes, numberOfWings;
    public static String animal = "dog";

    public Dog(String breed, String size, String color, char gender, int age, int numberOfLegs, int numberOfEyes, int numberOfWings) {
        this.breed = breed;
        this.size = size;
        this.color = color;
        this.gender = gender;
        this.age = age;
        this.numberOfLegs = numberOfLegs;
        this.numberOfEyes = numberOfEyes;
        this.numberOfWings = numberOfWings;
    }

    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", numberOfLegs=" + numberOfLegs +
                ", numberOfEyes=" + numberOfEyes +
                ", numberOfWings=" + numberOfWings +
                '}';
    }


}
/*
2. Create a class called Dog
            Variables:
                breed, size, gender, age, color, numberOfLegs, numberOfEyes, numberOfWings
            Add a constructor to initialized all the fields
            Add a static block to initialize all the statics
            Methods:
                toString()
 */