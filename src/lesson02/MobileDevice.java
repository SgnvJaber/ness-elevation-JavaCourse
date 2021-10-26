package lesson02;

public class MobileDevice {
    String model;
    char os;
    double version;
    boolean hasFlash;
    int price;
    int screenWidth;
    int screenHeight;

    void printParameters() {
        System.out.println(model + " " + os + " " + " " + version + " " + hasFlash + " " + price + " ");
    }

    int calculateArea() {
        return screenHeight * screenWidth;
    }

    void pictureQuality() {
        if (hasFlash) {
            System.out.println("Good Quality");
        } else {
            System.out.println("Bad Quality");
        }
    }


}
