package day38_CustomClass.CarpetTask;

import java.util.ArrayList;
import java.util.Arrays;

public class carpetObjects {
    public static void main(String[] args) {
        Carpet[] carpets= {new Carpet(),new Carpet(),new Carpet(),new Carpet(),new Carpet()};

        carpets[0].customOrder(2.6,3,10,true);
        carpets[1].customOrder(3.4,5,12,false);
        carpets[2].customOrder(1.3,3,8,true);
        carpets[3].customOrder(4.1,4,16,false);
        carpets[4].customOrder(1.2,1,10,true);

/*
        ArrayList<Carpet> carpetsList = new ArrayList<>(Arrays.asList(carpets));

        ArrayList<Carpet> persianCarpets = new ArrayList<>(carpetsList);
        persianCarpets.removeIf(carpet -> !carpet.isPersian);
        System.out.println(persianCarpets);
        for (Carpet persianCarpet : persianCarpets) {
            System.out.println(persianCarpet);
        }
        ArrayList<Carpet> regularCarpets = new ArrayList<>(carpetsList);
        regularCarpets.removeIf(carpet -> carpet.isPersian);
        System.out.println(regularCarpets);

 */
        ArrayList<Carpet> persianCarpets = new ArrayList<>();
        ArrayList<Carpet> regularCarpets = new ArrayList<>();

        for(Carpet each : carpets ){
            if(each.isPersian){
                persianCarpets.add(each);
            }else{
                regularCarpets.add(each);
            }
        }
        System.out.println("Total number of persian carpets: "+ persianCarpets.size());
        System.out.println("Total number of regular carpets: "+ regularCarpets.size());

        for (Carpet persianCarpet : persianCarpets) {
            System.out.println(persianCarpet);
        }

    }
}
