package lesson02;

public class MainProgram {
    public static void main(String[] args) {
        MobileDevice device1 = new MobileDevice("Galaxy A31", 'A', 11.2, true, 1000, 73, 159);
        device1.printParameters();
        System.out.println("Area:" + device1.calculateArea());
        device1.pictureQuality();

        MobileDevice device2 = new MobileDevice("iPhone 11 Pro", 'I', 14.2, true, 4000, 70, 143);
        device2.printParameters();
        device2.pictureQuality();
        System.out.println("Area:" + device2.calculateArea());

        MobileDevice device3 = new MobileDevice("Bad Phone", 'A', 0.2, false, 40, 10, 13);
        device3.printParameters();
        device3.pictureQuality();
        System.out.println("Area:" + device3.calculateArea());

    }
}
