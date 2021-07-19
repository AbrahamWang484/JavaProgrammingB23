package day25_ForEachLoop;

public class exeWarmUp1 {
    public static void main(String[] args) {
        String[] array = {"Java", "Python", "C#"};
        for (String s : array) {//get the each element String s
            System.out.println(s);
            String temp = "";
            for (int i = s.length() - 1; i >= 0; i--) {
                temp+=s.charAt(i);
            }System.out.println(temp);
        }
    }


}
/*
	1. write a program that can  reverse each elements in an array of string
		Ex:
		    array = {"Java", "Python", "C#"};

	    	output:
	    		["avaJ", "nohtyP", "#C"]
 */