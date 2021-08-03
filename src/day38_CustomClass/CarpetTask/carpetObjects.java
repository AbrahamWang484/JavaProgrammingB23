package day38_CustomClass.CarpetTask;

import java.util.ArrayList;
import java.util.Arrays;

public class carpetObjects {
    public static void main(String[] args) {
        Carpet carpet1 = new Carpet();
        carpet1.customOrder(2,3,10,true);
        Carpet carpet2 = new Carpet();
        carpet2.customOrder(3,5,12,false);
        Carpet carpet3 = new Carpet();
        carpet3.customOrder(1,3,8,true);
        Carpet carpet4 = new Carpet();
        carpet4.customOrder(4,4,16,false);
        Carpet carpet5 = new Carpet();
        carpet5.customOrder(1,1,10,true);

        Carpet[] arr= {carpet1,carpet2,carpet3,carpet4,carpet5};
        ArrayList<Carpet> carpets = new ArrayList<>(Arrays.asList(arr));

        ArrayList<Carpet> persianCarpets = new ArrayList<>(carpets);
        persianCarpets.removeIf(carpet -> !carpet.isPersian);
        System.out.println(persianCarpets);
        for (Carpet persianCarpet : persianCarpets) {
            System.out.println(persianCarpet);
        }
        ArrayList<Carpet> regularCarpets = new ArrayList<>(carpets);
        regularCarpets.removeIf(carpet -> carpet.isPersian);
        System.out.println(regularCarpets);
    }
}
