package shapes;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;
import enums.Color;

public class Square extends Shape {
    
    private double length;

    public Square() {

    }

    public Square(double length, Color color) {
        super(color);
        this.length = length;
    }

    public static Square of(double length) {
        return new Square(length, Color.WHITE);
    }

    public static Square of (Color color) {
        return new Square(1.0d, color);
    }

    public static Square of() {
        return new Square(1.0d, Color.WHITE);
    }

    public static Square of(double length, Color color) {
        return new Square(length, color);
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return this.length;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.length,this.length);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Square))
            return false;
        Square square = (Square) obj;
        //return Objects.equals(this.length,square.length);
        return Objects.equals(this.length,square.length) && Objects.equals(this.getColor(),square.getColor());
    }


    @Override
    public String toString() {
        return "Square(length=" + this.length +  ", Shape(color=" + super.getColor() + "))";
    }

    public double area(RoundingMode mode, int dp) {
        return BigDecimal.valueOf(this.length).multiply(BigDecimal.valueOf(this.length)).setScale(dp,mode).doubleValue();
    }

    public static void main(String[] args) {

        Square square = new Square(4.6989d, Color.WHITE);
        System.out.println(square.toString());
        System.out.println(square.area(RoundingMode.HALF_UP,2));

    }

}
