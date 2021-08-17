package day45_Inheritance.Email;

public class Yahoo extends Email{

    public Yahoo(String address, int numberOfEmail) {
        super(address, numberOfEmail);
        domain ="yahoo";
    }
}