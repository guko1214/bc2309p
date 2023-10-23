package shape;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;

public class Square extends Shape {
    
    private double length;

    public Square() {

    }

    public Square(double length) {
        this.length = length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return this.length;
    }

    public int hashCode() {
        return Objects.hash(this.length,this.length);
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Square))
            return false;
        Square square = (Square) obj;
        return Objects.equals(this.length,square.length);            
    } 

    public String toString() {
        return "Square(length=" + this.length +  ", Shape())";
    }

    public double area(RoundingMode mode, int dp) {
        return BigDecimal.valueOf(this.length).multiply(BigDecimal.valueOf(this.length)).setScale(dp,mode).doubleValue();
    }

    public static void main(String[] args) {
        Square square = new Square(4.6989d);
        System.out.println(square.area(RoundingMode.HALF_UP,2));
    }

}
