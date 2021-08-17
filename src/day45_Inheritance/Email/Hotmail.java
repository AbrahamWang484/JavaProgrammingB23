package day45_Inheritance.Email;

public class Hotmail extends Email{

    public Hotmail(String address, int numberOfEmail) {
        super(address, numberOfEmail);
        domain ="hotmail";
    }
}