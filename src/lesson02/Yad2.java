package lesson02;

public class Yad2 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.manufacturer = "Toyota";
        car1.model = "Corolla";
        car1.year = 2019;
        car1.price = 60000.66;
        car1.hasAbs = true;
        car1.print();

        Car car2 = new Car();
        car2.manufacturer = "Subaru";
        car2.model = "DL";
        car2.year = 1985;
        car2.price = 8000.99;
        car2.hasAbs = false;
        car2.print();


    }

}
