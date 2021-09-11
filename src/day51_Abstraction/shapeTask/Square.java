package day51_Abstraction.shapeTask;

public final class Square extends Shape{

    private double s;

    public double getS() {
        return s;
    }
    public void setS(double s) {
        if(s <= 0){
            throw new RuntimeException("Invalid Side: "+s);
        }
        this.s = s;
    }

    public Square( double s) {
        super("Square");
        setS(s);
    }

    @Override
    public double area() {
        return s*s;
    }

    @Override
    public double perimeter() {
        return s*4;
    }



}