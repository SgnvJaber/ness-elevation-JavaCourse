package lesson02;

public class Shapes {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.pi = 3.14;
        circle.radius = 5;
        System.out.println("Circle Area:" + circle.calculateArea());

        Triangle triangle = new Triangle();
        triangle.height = 15;
        triangle.width = 6;
        System.out.println("Triangle Area:" + triangle.calculateArea());

        Rectangle rectangle = new Rectangle();
        rectangle.height = 20;
        rectangle.width = 14;
        System.out.println("Rectangle Area:" + rectangle.calculateArea());


    }
}
