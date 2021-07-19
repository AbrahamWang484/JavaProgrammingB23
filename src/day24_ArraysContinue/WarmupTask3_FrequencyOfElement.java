package day24_ArraysContinue;

public class WarmupTask3_FrequencyOfElement {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 3, 4};

        //Step1 remove the duplicate.
        for (int j = 0; j < arr.length; j++) {//check all the letters
            //repeat following content to check each array use nested loop>> how to find frequency of one letter
            int element = arr[j];
            int count = 0; // to store the frequency of element

            for (int i = 0; i < arr.length; i++) {
                int each = arr[i];
                if (element==each)//if the element is occurred in the array
                    count++;
            }
//for which letter has 2 times, count==2; which letter not one time: count!=1
            if (count==1){ //to check if the element is unique
                System.out.print(element+" ");
            }
        }


//first we have to find a frequency for one then we have to apply this into loop to find all element inside the array

    }
}
/*
3. write a program that can print out the unique numbers from an array of integers
        Ex:
            int[] arr ={1,1,2,3,3,4}

            output:
                2 4
 */