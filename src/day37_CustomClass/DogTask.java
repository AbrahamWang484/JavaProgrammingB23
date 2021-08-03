package day37_CustomClass;

 public class DogTask {
    String name;
    String breed;
    int age;
    String size;
    String color;
    String gender;
    boolean isHusky;

    public void setInfo(String dogName, String dogBreed, String dogGender, String dogColor, String dogSize, int dogAge, boolean dogIsHusky) {
        name = dogName;
        breed = dogBreed;
        gender = dogGender;
        age = dogAge;
        size = dogSize;
        color = dogColor;
        isHusky = dogIsHusky;
    }

    public void getInfo() {
        System.out.println("name = " + name);
        System.out.println("breed = " + breed);
        System.out.println("age = " + age);
        System.out.println("size = " + size);
        System.out.println("color = " + color);
        System.out.println("gender = " + gender);
    }
    public void display(){
        System.out.println(name+", "+breed+", "+age+", "+size+", "+color+", "+gender+", Is Hunsky?"+isHusky);
    }
}

class Custom {
    public static void main(String[] args) {

        DogTask dog1 = new DogTask();
        dog1.setInfo("Ami", "Retriever", "male", "white", "large", 2, true);
        DogTask dog2 = new DogTask();
        dog2.setInfo("Wowo", "German Shepherd", "female", "black", "small", 1, false);
        DogTask dog3 = new DogTask();
        dog3.setInfo("WangWang","Bulldog","male","brown","large",1,true);
        DogTask dog4 = new DogTask();
        dog4.setInfo("AHuang","Beagle","male","white","small",2,false);
        DogTask dog5 = new DogTask();
        dog5.setInfo("Joy","Pointer","male","black","medium",3,false);
        DogTask dog6 = new DogTask();
        dog6.setInfo("Happy","Dachshund","male","black","large",2,true);
        DogTask dog7 = new DogTask();
        dog7.setInfo("JJ","Great Danes","male","brown","small",1,false);
        DogTask dog8 = new DogTask();
        dog8.setInfo("Monday","Boxer","male","white","large",1,false);
        DogTask dog9 = new DogTask();
        dog9.setInfo("Dabai","Siberian Huskie","male","black","large",1,false);
        DogTask dog10 = new DogTask();
        dog10.setInfo("XiaoHei","Boston Terrier","male","brown","small",3,false);

        DogTask[] dogs = {dog1,dog2,dog3,dog4,dog5,dog6,dog7,dog8,dog9,dog10};

        for (DogTask dog : dogs) {
            dog.getInfo();
            System.out.println("------------");
        }

    }
}

