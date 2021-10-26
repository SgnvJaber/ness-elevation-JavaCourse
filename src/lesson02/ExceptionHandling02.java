package lesson02;

public class ExceptionHandling02 {
    public static void main(String[] args) {
        try {
            badMethod();
            System.out.println("A");
        } catch (RuntimeException ex) {
            System.out.print("B");
        } catch (Exception ex1) {
            System.out.println("B");
        } finally {
            System.out.print("D");
        }
    }

    public static void badMethod() {
        throw new RuntimeException();
    }
}
