package Replit.OOP.Dog;

import java.util.Objects;

/*
Write an abstract class Animal that contains 2 instance variables: `name` and `age`.
- Provide getters and setters for these variables. Add an abstract method `getAgeInHumanYears()` that returns int.
- Define 2 args constructor that initializes instance variables.
 */
public abstract class Animal {
    private String name;
    private int age;
    public Animal(String name, int age) {
        setName(name);
        setAge(age);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public abstract int getAgeInHumanYears();

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        return false;
    }

}