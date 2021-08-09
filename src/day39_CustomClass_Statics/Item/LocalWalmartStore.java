package day39_CustomClass_Statics.Item;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class LocalWalmartStore {
    public static void main(String[] args) {
        WalmartStore walmartStore = new WalmartStore();
        Item[] items ={new Item(),new Item(),new Item(),new Item(),new Item(),new Item(),new Item(),new Item(),new Item(),new Item()};
        items[0].setInfo("water",1,100);
        items[1].setInfo("Noodle",2,100);
        items[2].setInfo("Banana",3,100);
        items[3].setInfo("Apple",4,100);
        items[4].setInfo("Pizza",1,100);
        items[5].setInfo("Hotdog",2,100);
        items[6].setInfo("ice cream",3,100);
        items[7].setInfo("mobile",4,100);
        items[8].setInfo("TV",5,100);
        items[9].setInfo("iPad",1,100);

        ArrayList<Item> itemsList= new ArrayList<>();
        itemsList.addAll(Arrays.asList(items));

        System.out.println(itemsList);


    }


}
