package day42_CustomClass_Constructors;

public class Dog {
    public String breed, size, color;
    public char gender;
    public int age;

    static {
        int numberOfLegs = 4,
                numberOfEyes = 2,
                numberOfWings = 0;
    }

    public Dog(String breed, String size, String color, char gender, int age) {
        this.breed = breed;
        this.size = size;
        this.color = color;
        this.gender = gender;
        this.age = age;

    }

    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", gender=" + gender +
                ", age=" + age +
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