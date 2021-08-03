package day38_CustomClass.OfferTask;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {
    public static void main(String[] args) {
        Offer offer1 = new Offer();
        offer1.setInfo("CA","L.A", true, true,80_000, false, "QA",true);
        Offer offer2 = new Offer();
        offer2.setInfo("CA","Bay Area", true,false, 85_000, true, "SM",false);
        Offer offer3 = new Offer();
        offer3.setInfo("CA","San Diego", false,true, 180_000, false, "PO",true);
        Offer offer4 = new Offer();
        offer4.setInfo("TX","Dallas", false,false, 171_000, true, "SDET",false);
        Offer offer5 = new Offer();
        offer5.setInfo("NY","New York", false,true, 162_000, true, "PM",true);
        Offer offer6 = new Offer();
        offer6.setInfo("AZ","Las Vegas", false,false, 14_000, false, "CEO",true);
        Offer offer7 = new Offer();
        offer7.setInfo("HO","Hawaii", true,false, 75_000,true, "BA",false);

        Offer[] arr = {offer1, offer2, offer3, offer4, offer5, offer6, offer7};
        ArrayList<Offer> offers = new ArrayList<>(Arrays.asList(arr));
        ArrayList<Offer> offers1 = new ArrayList<>(Arrays.asList(arr));
        offers1.removeIf(offer -> !offer.jobTitle.equals("SDET") && !offer.jobTitle.equals("QA"));
        System.out.println(offers1.size());
        System.out.println(offers1);
//        for (Offer each : offers1) {
//            System.out.println(each);
//        }
        System.out.println("------------------");
        //only keep fulltime offers
        ArrayList<Offer> fullTimeOffers = new ArrayList<>(Arrays.asList(arr));
        fullTimeOffers.removeIf(offer -> offer.isFullTime==false    );
        System.out.println(fullTimeOffers.size());
        System.out.println(fullTimeOffers);
        System.out.println("------------------");
        //only keep the offers that are WFH && hasPTO
        ArrayList<Offer> WFHOffers = new ArrayList<>(Arrays.asList(arr));
        for (Offer offer : arr) {
            if (offer.isWFH && offer.hasPTO){
                WFHOffers.add(offer);
            }
        }
        System.out.println(WFHOffers.size());
        System.out.println(WFHOffers);
        System.out.println("------------------");
        System.out.println("highSalary");
        ArrayList<Offer> highSalaryOffers = new ArrayList<>(Arrays.asList(arr));
        highSalaryOffers.removeIf(offer -> offer.salary<125000);
        System.out.println(highSalaryOffers.size());
        System.out.println(highSalaryOffers);


        System.out.println("------------------");
        ArrayList<Offer> offers2 = new ArrayList<>(Arrays.asList(arr));
        offers2.removeIf(offer -> offer.isWFH == false);
        for (Offer each : offers2) {
            System.out.println(each);
        }
        System.out.println("------------------");
        ArrayList<Offer> offers3 = new ArrayList<>(Arrays.asList(arr));
        offers3.removeIf(offer -> offer.haBenifit = true);
        for (Offer each : offers2) {
            System.out.println(each);
        }


    }
}
