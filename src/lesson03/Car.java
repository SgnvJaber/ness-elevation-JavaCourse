package lesson03;

public class Car {
    //Properties
    String manufacturer, model;
    int year;
    double price;
    boolean hasAbs;

    //Constructor
    public Car(String manufacturer, String model, int year, double price, boolean hasAbs) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.year=year;
        this.price = price;
        this.hasAbs = hasAbs;
    }

    //Methods
    void print() {
        System.out.println(manufacturer + " " + model + " " + " " + year + " " + " " + price);
        System.out.println(printAbs());

    }

    String printAbs() {
        if (hasAbs) {
            return "Car has ABS System";
        } else {
            return "Car has NOT ABS System";
        }
    }


}
