package Practice_07_28_2021;

import java.util.ArrayList;
import java.util.Arrays;

public class Task1FourOrLess {
    public static void main(String[] args) {
        ArrayList<String> list  = new ArrayList<>(Arrays.asList("apples", "tree", "loop", "cat", "animal", "shortcut"));
        list.removeIf(n -> n.length() > 4);//boolean
        System.out.println(list);

    }
}
/*
Given an ArrayList of Strings, go through and read only Strings that are 4 characters or less.

					Take those Strings and put them into a different ArrayList

					Ex:

					Input:
					“apples”, “tree”, “loop, “cat”, “animal”, “shortcut”

					Output:
					[ tree, loop, cat ]
 */