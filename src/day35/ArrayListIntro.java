package day35;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListIntro {


    //create your method below
        public static ArrayList<Integer> timesTwo(ArrayList<Integer> nums) {
            int[] array = new int[nums.size()];
            for (int i = 0; i < nums.size(); i++) {
                array[i] = nums.get(i).intValue() * 2;
            }
            ArrayList<Integer> list = new ArrayList<Integer>(array.length);
            for (int i = 0; i < array.length; i++)
                list.add(Integer.valueOf(array[i]));
            return list;
        }

        // Do not touch below

        public static void main (String[]args){
            Scanner in = new Scanner(System.in);
            int size = in.nextInt();
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                list.add(in.nextInt());
            }

            System.out.println(timesTwo(list));

        }

    }

