package lesson01;

public class Statements10 {
    public static void main(String[] args) {
        String[] array = {"o", "l", "l", "e", "H"};
        int i = array.length - 1;
        do {
            System.out.print(array[i]);
            i--;
        }
        while (i >= 0);
    }
}
