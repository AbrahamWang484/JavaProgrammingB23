package day45_Inheritance.Email;

public class Email {
    final String address;
    public int numberOfEmail;
    public String domain = "generic";

    public Email(String address, int numberOfEmail) {
        this.address = address;
        this.numberOfEmail = numberOfEmail;
    }


    public String toString() {
        return "Email{" +
                "address='" + address + '\'' +
                ", numberOfEmail=" + numberOfEmail +
                ", domain='" + domain + '\'' +
                '}';
    }







}
