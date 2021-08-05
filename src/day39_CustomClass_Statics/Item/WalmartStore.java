package day39_CustomClass_Statics.Item;

import java.util.ArrayList;
import java.util.Collection;

public class WalmartStore {
    public String location;
    public double totalWorth;
    public ArrayList<Item> inventory= new ArrayList<>();
    public static String companyName;
    public ArrayList<Item> restockInventory = new ArrayList<>();

    public void setInfo(String location) {
        this.location = location;
    }



    public void calculateWorth(){
        for (Item item : inventory) {
            totalWorth= item.price*item.quantity;
        }
    }

    public void restockInventory(Item items){
        ArrayList<Item> restockInventory =new ArrayList<>(inventory);
        restockInventory.add(items);
    }


    public String toString() {
        return "WalmartStore{" +
                "location='" + location + '\'' +
                ", totalWorth=" + totalWorth +
                ", total number of inventory=" + restockInventory.size()+
                '}';
    }

}
