package day31_Recap;

public class frequencyOfWord {
    public static void main(String[] args) {
        String str="Java java java python python",
              word="java";
        System.out.println(frequencyOfWord(str, word));
    }
    public static int frequencyOfWord(String str,String word){
        String[] strArray=str.split(" ");
        int frequencyOfWord=0;
        for (String s : strArray) {
            if (s.equals(word))
            frequencyOfWord++;
        }
        return frequencyOfWord;
    }
//    public static int frequencyOfWord(String sentence, String word){
//        int count = 0;
//        sentence=sentence.toLowerCase();
//        word=word.toLowerCase();
//        while (sentence.contains(word)) {
//            sentence = sentence.replaceFirst(word, "");
//            count++;
//        }
//        return count;
//    }
}
/*
write a return method named frequencyOfWord that accepts two parameters: string str and String word, then returns the frequency of word
                Ex:
                    str = "Java java java python python"
                    word = "java";
                    frequencyOfWord(str, word) ==>  3
 */