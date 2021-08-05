package day39_CustomClass_Statics.RestaurantTask;

import java.util.ArrayList;
import java.util.Collections;

public class Restaurant {
    public String owner, location;
    public int numberOfStars;
    public ArrayList<Server> serversList;
    public ArrayList<Chef> chefsList;

    public void setInfo(String owner, String location, int numberOfStars, ArrayList<Server> serversList, ArrayList<Chef> chefsList) {
        this.owner = owner;
        this.location = location;
        this.numberOfStars = numberOfStars;
        this.serversList = serversList;
        this.chefsList = chefsList;
    }

    public void hireServer(Server server){
        serversList.add(server);
    }

    public void hireServer(Server[] servers){
        Collections.addAll(serversList,servers);
    }

     public void hireServer(String name, int employeeID, double hourlyRate, boolean fullTime){
            Server server = new Server();
            server.setInfo(name,employeeID,hourlyRate,fullTime);
            serversList.add(server);

    }

    public void hireChef(Chef chef){
        chefsList.add(chef);
    }

    public void hireChef(Chef [] chefs){
        Collections.addAll(chefsList,chefs);
    }

    public void hireChef(String name, int employeeID, double hourlyRate, boolean fullTime){
        Chef chef= new Chef();
        chef.setInfo(name,employeeID,hourlyRate,fullTime);
        chefsList.add(chef);
    }


    public String toString() {
        return "Restaurant{" +
                "owner='" + owner + '\'' +
                ", location='" + location + '\'' +
                ", numberOfStars=" + numberOfStars +
                ", number Of Servers=" + serversList.size() +
                ", number Of Chefs=" + chefsList.size() +
                '}';
    }

    public void terminateEmployee(String title, int employeeID){
        if (title.equals("server")||title.equals("chef")){
            if (title.equals("server")){
                for(Server server:serversList){
                    if (server.employeeID==employeeID){
                        System.out.println(server.name+" was terminated");
                    }
                }
                serversList.removeIf(server -> server.employeeID==employeeID);
               // System.out.println( " was terminated"); how to print correct name????
            }else if (title.equals("chef")){
                for(Chef chef:chefsList){
                    if (chef.employeeID==employeeID){
                        System.out.println(chef.name+" was terminated");
                    }
                }
                chefsList.removeIf(chef -> chef.employeeID==employeeID);

            }
        }else{
            System.out.println("invalid employee type");
        }
    }
}
