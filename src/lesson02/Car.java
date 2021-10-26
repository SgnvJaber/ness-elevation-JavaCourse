package lesson02;

public class Car {
    //Properties
    String manufacturer, model;
    int year;
    double price;
    boolean hasAbs;

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
