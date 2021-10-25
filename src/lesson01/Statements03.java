package lesson01;

public class Statements03 {
    public static void main(String[] args) {
        System.out.println("For Loop Print(from 1 to 10):");
        for (int i = 1; i < 11; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\nWhile Loop Print(from 1 to 10):");
        int k = 1;
        while (k < 11) {
            System.out.print(k + " ");
            k++;
        }
        System.out.println("\nFor Loop Even numbers(from 30 to 50):");
        for (int i = 30; i < 51; i++) {
            if (i % 2 == 0)
                System.out.print(i + " ");

        }
        System.out.println("\nFor Loop Non Even numbers(from 20 to 40):");
        for (int i = 20; i < 41; i++) {
            if (i % 2 != 0)
                System.out.print(i + " ");

        }


    }
}
