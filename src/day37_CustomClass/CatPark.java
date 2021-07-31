package day37_CustomClass;

public class CatPark {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.setInfo("Mimi","white","male","Persian",1);
        cat1.getInfo();

        System.out.println("------------------");
        Cat cat2 = new Cat();
        cat2.setInfo("beibei","black","female","abyssinian",1);
        cat2.getInfo();

        System.out.println("------------------");
        Cat cat3 = new Cat();
        cat3.setInfo("vivi","brown","female","ragdoll",1);
        cat3.getInfo();

        System.out.println("------------------");
        cat1.scratch();
        cat2.breakThings();
        cat3.jump();
        cat1.eat("fish");
        cat2.drink("milk");
        cat3.meow();
    }
}
