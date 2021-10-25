package lesson01;

public class Statements05 {
    public static void main(String[] args) {
        int age = 100;
        if(age > 0 && age <= 6)
            System.out.println("Go to Kindergarten");
        else if (7 <= age && age <= 18)
            System.out.println("Go to School");
        else if (19 <= age && age <= 67)
            System.out.println("Go to Work");
        else if (68 <= age && age <= 120)
            System.out.println("Collecting Pension");
    }
}
