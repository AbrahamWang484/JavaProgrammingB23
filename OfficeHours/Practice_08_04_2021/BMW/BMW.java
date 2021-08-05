package Practice_08_04_2021.BMW;

import java.time.LocalDate;

public class BMW {
    public String brand,model,color;
    public double price,mileage;
    public int year;
    public LocalDate DOfB;

    public void setInfo(String brand, String model, String color, double price, double mileage, LocalDate DOfB) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.price = price;
        this.mileage = mileage;
        year = DOfB.getYear();
        this.DOfB = DOfB;
    }

    public String getBrandName(){
        return brand;
    }

    @Override
    public String toString() {
        return "BMW{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", mileage=" + mileage +
                ", year=" + year +
                ", DOfB=" + DOfB +
                '}';
    }



}
