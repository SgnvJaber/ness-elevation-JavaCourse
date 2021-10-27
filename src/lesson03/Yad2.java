package lesson03;

import lesson03.Car;

public class Yad2 {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Corolla", 2019, 6000.66, true);

        car1.print();

        Car car2 = new Car("Subaru", "DL", 1985, 8000.99, false);
        car2.print();


    }

}
