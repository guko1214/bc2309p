package shapes;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;


public class Triangle extends Shape {

    private double baseLength;

    private double height;

    public Triangle() {

    }

    public Triangle(double baseLength, double height) {
        this.baseLength = baseLength;
        this.height = height;
    }

    public void setBaseLength(double baseLength) {
        this.baseLength = baseLength;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBaseLength() {
        return this.baseLength;
    }

    public double getHeight() {
        return this.height;
    }

    public int hashCode() {
        return Objects.hash(this.baseLength, this.height);
    }

    public String toString() {
        return "Triangle(baseLength=" + this.baseLength + ", height=" + this.height + ", Shape())";
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Triangle))
            return false;
        Triangle triangle = (Triangle) obj;
        return (Objects.equals(this.baseLength, triangle.baseLength) && Objects.equals(this.height, triangle.height));
    }

    public double area(RoundingMode mode, int dp) {


        return BigDecimal.valueOf(this.baseLength).multiply(BigDecimal.valueOf(this.height)).divide(BigDecimal.valueOf(2)).doubleValue();
    }
    
    public static void main(String[] args) {
        Triangle triangle = new Triangle(2, 4);
        System.out.println(triangle.area(RoundingMode.HALF_UP,2));
    }


}
