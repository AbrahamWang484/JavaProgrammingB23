package day37_CustomClass;

public class Cat {
    public String name;
    public String color;
    public String gender;
    public int age;
    public String breed;

    public void scratch() {
        System.out.println(name + " is scratch");
    }

    public void breakThings() {
        System.out.println(name + " is break things");
    }

    public void jump() {
        System.out.println(name + " is jumpping");
    }

    public void eat(String food) {
        System.out.println(name + " is eating " + food);
    }

    public void drink(String beverage) {
        System.out.println(name + " is drinking "+beverage);
    }

    public void meow() {
        System.out.println(name + " is meowing");
    }

    public void setInfo(String catName, String catColor, String catGender, String catBreed, int catAge) {
        name = catName;
        color = catColor;
        gender = catGender;
        breed = catBreed;
        age = catAge;
    }

    public void getInfo() {
        System.out.println("name = " + name);
        System.out.println("breed = " + breed);
        System.out.println("age = " + age);
        System.out.println("color = " + color);
        System.out.println("gender = " + gender);
    }
}



