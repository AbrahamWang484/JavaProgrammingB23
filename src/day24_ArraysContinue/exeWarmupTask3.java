package day24_ArraysContinue;

public class exeWarmupTask3 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 3, 4};

        for (int j = 0; j < arr.length; j++) {
            int element =arr[j];
            int count=0;
            for (int i = 0; i < arr.length; i++) {
                if (element==arr[i]){
                    count++;
                }
            }
            if (count==1)
                System.out.println(element);
        }





    }
}
/*
3. write a program that can print out the unique numbers from an array of integers
        Ex:
            int[] arr ={1,1,2,3,3,4}

            output:
                2 4
 */
