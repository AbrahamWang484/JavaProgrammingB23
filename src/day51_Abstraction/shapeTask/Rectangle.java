package day51_Abstraction.shapeTask;

public final class Rectangle extends Shape{

    private double l, w;

    public double getL() {
        return l;
    }

    public void setL(double l) {
        if(l <= 0){
            throw new RuntimeException("Invalid Length: "+l);
        }
        this.l = l;
    }

    public double getW() {
        return w;
    }

    public void setW(double w) {
        if(w <= 0){
            throw new RuntimeException("Invalid Width: "+w);
        }
        this.w = w;
    }

    public Rectangle(double l, double w) {
        super("Rectangle");
        setL(l);
        setW(w);
    }


    @Override
    public double area() {
        return l * w;
    }

    @Override
    public double perimeter() {
        return (l+w)*2;
    }




}