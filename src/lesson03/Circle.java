package lesson03;

public class Circle extends Shape {

    double pi = 3.14;

    public double getArea(double radius) {
        return pi * radius * radius;
    }

    public double getPerimeter(double radius) {
        return 2 * pi * radius;
    }
}
