package day38_CustomClass.CarpetTask;

public class Carpet {
    public double width, length,uniPrice;
    public boolean isPersian;

    public void customOrder(double width, double length, double uniPrice, boolean isPersian) {
        this.width = width;
        this.length = length;
        this.uniPrice = uniPrice;
        this.isPersian = isPersian;
    }

    public double calcCost(){
        double total=0;
        total =width *length* uniPrice;
        if (isPersian){
            total+=200;
        }
        return total;
    }

    public String toString() {
        return "Carpet{" + "width=" + width + ", length=" + length + ", uniPrice=" + uniPrice + ", isPersian=" + isPersian+", total cost=" + calcCost() + '}';
    }

}
