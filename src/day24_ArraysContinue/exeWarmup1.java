package day24_ArraysContinue;

public class exeWarmup1 {
    public static void main(String[] args) {
        String[] classMatesNames = {"wang", "zhang", "liu", "Syed", "Muhammad", "Yuliang", "Machao", "Yasin", "Yasmi", "Jamilla"};

        for (int i = 0; i < classMatesNames.length; i++) {
            System.out.println(classMatesNames[i].substring(0, 3));
        }

    }
}
/*
1. create string array, and store the names of your  class mates (10)
            print the first three characters of each name
 */