package lesson02;

public class DebugExample {
    public static void main(String[] args) {
        String[] names = {"Rami", "Diana", "Jondi", "Yonatan", "Roland", "Eldar"};
        String maxName = names[0];
        //Using for each
        /*
        for (String name : names) {
            if (name.length() > maxName.length()) {
                maxName = name;
            }
        }
         */
        //Using for loop
        for (int i = 0; i < names.length; i++) {
            if (names[i].length() > maxName.length()) {
                maxName = names[i];
            }

        }
        System.out.println("The Name is: " + maxName);
        System.out.println("The Length is: " + maxName.length());

    }
}
