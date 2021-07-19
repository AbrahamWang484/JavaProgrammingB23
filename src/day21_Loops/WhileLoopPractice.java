package day21_Loops;

public class WhileLoopPractice {
    public static void main(String[] args) {


        String sentence = "Java java JaVa JAVA jaVA";
        int containsJava = 0;
        while(sentence.toLowerCase().contains("java")){
            containsJava++;
            sentence=sentence.toLowerCase().replaceFirst("java","");
        }

        System.out.println("containsJava = " + containsJava);

    }
}
