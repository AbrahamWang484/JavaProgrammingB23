package day31_Recap;

public class WarmUpTask2 {
    public static void main(String[] args) {
        String sentence = "Java java JaVA";
        String word = "java";

        int count = 0;
        sentence=sentence.toLowerCase();
        word=word.toLowerCase();
        while (sentence.contains(word)) {
            sentence = sentence.replaceFirst(word, "");
            count++;
        }
        System.out.println(count);

        System.out.println("---------------");

        String sentence1 = "Java java JaVA";
        String word1 = "java";
        int n2=frequencyOfWord(sentence1,word1);
        System.out.println(n2);
    }

    public static int frequencyOfWord(String sentence, String word){
        int count = 0;
        sentence=sentence.toLowerCase();
        word=word.toLowerCase();
        while (sentence.contains(word)) {
            sentence = sentence.replaceFirst(word, "");
            count++;
        }
        return count;
    }
}
/*
2.  write a return method named frequencyOfWord that accepts two parameters: string str and String word, then returns the frequency of word
                Ex:
                    str = "Java java java python python"
                    word = "java";
                    frequencyOfWord(str, word) ==>  3
 */