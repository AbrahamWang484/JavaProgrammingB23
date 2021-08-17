package day45_Inheritance.Email;

public class Gmail extends Email {
    public Gmail(String address, int numberOfEmail) {
        super(address, numberOfEmail);
        domain = "gmail";
    }
}