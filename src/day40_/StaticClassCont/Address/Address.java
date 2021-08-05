package day40_.StaticClassCont.Address;

public class Address {
    public String street, city, state;
    public int zipCode;
    public static String country;

    public void setInfo(String street, String city, String state, int zipCode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }


    public String toString() {
        return "Address{" +
                street +  "\n" + city + ", " + state + " "+
                zipCode + '}';
    }
}
/*
1. Create a class named Address
    Attributes:
        instance:  street, city, state, zipCode;
        static: country
    Actions
            setInfo: sets all the instances
            toString: returns the address
                        EX:
                            7925 Jones Branch Dr
                            McLean Va, 22012


 */