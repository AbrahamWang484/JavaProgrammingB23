package day40_CustomClass_Statics.Address;

public class Address {
    public String buildingNumber, street, city, state;
    public int zipCode;
    public static String country ="USA";//static only accepts static members(class cannot share the object's perporty

    public void setInfo(String buildingNumber,String street, String city, String state, int zipCode) { // object can share the class memebers
        this.buildingNumber= buildingNumber;
        this.street = street;//
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }


    public String toString() {
        return buildingNumber+" "+ street +  "\n" + city + " " + state + ", "+ zipCode;
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