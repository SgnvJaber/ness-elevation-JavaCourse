package lesson01;

public class Statements04 {
    public static void main(String[] args) {
        String[] countries = {"Austria", "Germany", "Canada", "Peru", "Israel"};
        System.out.println("List of Countries:");
        for (String country : countries) {
            System.out.print(country + " ");
        }
        //print only Israel
        System.out.println();
        for (String country : countries) {
            if (country.equals("Israel"))
                System.out.print(country + " ");
        }
        //Check if third value is China
        System.out.println();
        if (countries[2].equals("China"))
            System.out.println("Yes,it is there");
        else
            System.out.println("No,Sorry...");
        //Print the length of the first value
        System.out.println("Length:" + countries[0].length());

    }
}
