package lesson03;

public class MainClassShape {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Square square = new Square();
        System.out.println("Circle-:");
        System.out.println("Area: " + circle.getArea(4) + " Perimeter: " + circle.getPerimeter(4));
        System.out.println("Perimeter-:");
        System.out.println("Area: " + square.getArea(12) + " Perimeter: " + square.getPerimeter(12));
    }
}
