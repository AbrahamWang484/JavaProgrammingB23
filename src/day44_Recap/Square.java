package day44_Recap;

public class Square {
    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if (side <0){
            return;
        }
        this.side = side;
    }

    public Square(double side) {
        setSide(side);
    }
    public double area(){
        return Math.pow(side,2);
    }
    public double perimeter(){
        return 4*side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                " area=" + area() +
                " perimeter=" + perimeter() +
                '}';
    }
    public boolean equals(Square square){
        return side == square.side;
    }

    public static void main(String[] args) {
        Square square = new Square(4);
        System.out.println(square);
        Square square1 = new Square(4);
        System.out.println(square.equals(square1));
    }
}
