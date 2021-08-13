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

}
