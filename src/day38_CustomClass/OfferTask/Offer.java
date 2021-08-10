package day38_CustomClass.OfferTask;

public class Offer {
    public String state,city,jobTitle;

    public String location;
    public boolean haBenifit,isWFH,hasPTO, isFullTime;
    public  double salary;


    public void setInfo(String state, String city,  boolean haBenifit, boolean hasPTO, double salary, boolean isWFH, String jobTitle,boolean isFullTime) {
        this.state = state;
        this.city = city;
        this.jobTitle = jobTitle;
        this.haBenifit = haBenifit;
        this.hasPTO = hasPTO;
        this.salary = salary;
        this.isWFH = isWFH;
        this.isFullTime=isFullTime;
    }

    public String toString() {
        return "Offer{" +
                "state='" + state + '\'' +
                ", city='" + city + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", location='" + location + '\'' +
                ", haBenifit=" + haBenifit +
                ", isWFH=" + isWFH +
                ", hasPTO=" + hasPTO +
                ", isFullTime=" + isFullTime +
                ", salary=" + salary +
                '}';
    }
}
/*
offer:
        Attributes:
            Location, hasBenifit(boolean), salary, WFH(boolean), JobTitle

        Actions:
            SetInfo, toString

        create a class named MyOffers
            1. create 7 objects Offer Class and store them into an arraylist
            2. write a program that can only keep the offers from your local area
            3. write program that can remove all the offers that are not SDET or QA
            4. write a program that can remove all the offers that are not WFH
            5. write a program that can remove all the offers that do not have benifits
 */