package lesson02;

public class MainProgram {
    public static void main(String[] args) {
        MobileDevice device1 = new MobileDevice();
        device1.model = "Galaxy A31";
        device1.price = 1000;
        device1.os = 'A';
        device1.hasFlash = true;
        device1.version = 11.2;
        device1.screenWidth = 73;
        device1.screenHeight = 159;
        device1.printParameters();
        System.out.println("Area:" + device1.calculateArea());
        device1.pictureQuality();

        MobileDevice device2 = new MobileDevice();
        device2.model = "iPhone 11 Pro";
        device2.price = 4000;
        device2.os = 'I';
        device2.hasFlash = true;
        device2.version = 14.2;
        device2.screenWidth = 70;
        device2.screenHeight = 143;
        device2.printParameters();
        device2.pictureQuality();
        System.out.println("Area:" + device2.calculateArea());

        MobileDevice device3 = new MobileDevice();
        device3.model = "Bad Phone";
        device3.price = 4000;
        device3.os = 'A';
        device3.hasFlash = false;
        device3.version = 0.2;
        device3.screenWidth = 10;
        device3.screenHeight = 13;
        device3.printParameters();
        device3.pictureQuality();
        System.out.println("Area:" + device3.calculateArea());

    }
}
