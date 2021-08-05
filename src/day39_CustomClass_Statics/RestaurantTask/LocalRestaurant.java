package day39_CustomClass_Statics.RestaurantTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class LocalRestaurant {
    public static void main(String[] args) {
        Restaurant restaurant= new Restaurant();

        Server[] servers= {new Server(), new Server(),new Server(),new Server()};
        servers[0].setInfo("Ibrahim",1001,14.5,true);
        servers[1].setInfo("Wang",1002,14.5,false);
        servers[2].setInfo("Hamad",1003,15,true);
        servers[3].setInfo("Ahmed",1004,17,false);
        ArrayList<Server> serverList= new ArrayList<>();
        Collections.addAll(serverList,servers);

        Chef[] chefs= {new Chef(),new Chef(),new Chef(),new Chef(),new Chef()};
        chefs[0].setInfo("Jason",2001,14.5,true);
        chefs[1].setInfo("Jesus",2002,14.5,false);
        chefs[2].setInfo("Noman",2003,15,true);
        chefs[3].setInfo("Abraham",2004,17,false);
        chefs[4].setInfo("Adam",2005,16,true);
        ArrayList<Chef> chefList= new ArrayList<>();
        Collections.addAll(chefList,chefs);

        restaurant.setInfo("Wei","Los Angeles",4,serverList,chefList);
        System.out.println(restaurant);

        int totalCost =0;
        for (Server server : serverList) {
            totalCost+=server.hourlyRate;
        }
        for (Chef chef : chefList) {
            totalCost+=chef.hourlyRate;
        }
        System.out.println(totalCost);

        ArrayList<String> fullTimeEmployeeList= new ArrayList<>();
        ArrayList<String> partTimeEmployeeList= new ArrayList<>();

        for (Server server : serverList) {
            if (server.fullTime){
                fullTimeEmployeeList.add(server.name);
            }
            else{
                partTimeEmployeeList.add(server.name);
            }
        }
        for (Chef chef : chefList) {
            if (chef.fullTime){
                fullTimeEmployeeList.add(chef.name);
            }else {
                partTimeEmployeeList.add(chef.name);
            }
        }

        boolean is5Stars = chefList.size()>=6 && serverList.size()>=10;
        boolean is4Stars = chefList.size()>=3 && serverList.size()>=7;
        boolean is3Stars = chefList.size()>=1 && serverList.size()>=4;

        if (restaurant.numberOfStars==5){
            if (is5Stars){
                System.out.println("Up to standard");
            }else{
                System.out.println("Need to hire "+(6-chefList.size())+ " chefs, "+(10-serverList.size()) +" servers.");
            }
        }else if (restaurant.numberOfStars==4) {
            if (is4Stars) {
                System.out.println("Up to standard");
            } else {
                System.out.println("Need to hire " + (3 - chefList.size()) + " chefs, " + (7 - serverList.size()) + " servers.");
            }
        }else if (restaurant.numberOfStars==3){
            if (is3Stars){
                System.out.println("Up to standard");
            }else{
                System.out.println("Need to hire "+(1-chefList.size())+ " chefs, "+(4-serverList.size()) +" servers.");
            }
        }







    }
}
