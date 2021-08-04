package Practice_08_04_2021.BMW;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class BMWObjects {
    public static void main(String[] args) {
        BMW[] bmws ={new BMW(),new BMW(),new BMW(),new BMW(),new BMW(),new BMW(),new BMW(),};

        bmws[0].setInfo("BMW","x5","white",20000,10000,2015, LocalDate.of(2015,5,20));

        bmws[1].setInfo("BMW","3 Series","black",40750,15000,2020, LocalDate.of(2020,1,10));

        bmws[2].setInfo("BMW","x3","grey",31950,20000,2019, LocalDate.of(2019,2,8));

        bmws[3].setInfo("BMW","x6","red",25000,22000,2016, LocalDate.of(2016,3,3));

        bmws[4].setInfo("BMW","i8","silver",31000,40000,2015, LocalDate.of(2015,4,14));

        bmws[5].setInfo("BMW","x4","white",38000,30210,2018, LocalDate.of(2018,6,26));

        bmws[6].setInfo("BMW","i8","black",45000,5000,2021, LocalDate.of(2021,7,30));



        ArrayList<BMW> bmwList = new ArrayList<>(Arrays.asList(bmws));

        //	- Create an Arraylist to recall ALL BMW that were build before 2017
        ArrayList<BMW> before2017 = new ArrayList<>(bmwList);
        before2017.removeIf(bmw -> bmw.year>2017);
        System.out.println(before2017);

        //Create an Arraylist to recall ALL BMW i8 that were build before 2016
        ArrayList<BMW> i8and2016 = new ArrayList<>(bmwList);
        i8and2016.removeIf(bmw -> (!bmw.model.equals("i8")) || (bmw.year>=2016));
        System.out.println(i8and2016);





    }
}
