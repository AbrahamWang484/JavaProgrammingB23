package day45_Inheritance.animalTask;

public class Zoo {
    public static void main(String[] args) {
        Dog dog = new Dog("Lucy", "Husky", 'M', "Small", 2, "white");
        dog.bark();
        dog.eat("meat");
        dog.drink("water");
        dog.sleep();
        System.out.println(dog);

        System.out.println("-------------------");
        Cat cat = new Cat("Fate","Van",'M',"Small",4,"black");
        cat.meow();
        cat.eat("food");
        cat.drink("water");
        cat.sleep();
        System.out.println(cat);
        System.out.println("-------------------");
        Tiger tiger= new Tiger("Leo","Bengal",'M',"small",6,"white");
        tiger.roar();
        tiger.eat("meat");
        tiger.drink("water");
        tiger.sleep();
        System.out.println(tiger);
    }
}


