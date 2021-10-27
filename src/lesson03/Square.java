package lesson03;

public class Square extends Shape {
    public double getArea(double side) {
        return side * side;
    }

    public double getPerimeter(double side) {
        return side * 4;
    }
}
