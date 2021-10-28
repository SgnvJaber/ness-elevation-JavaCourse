package lesson04.NewWorld;

import java.text.CharacterIterator;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("==============CITIZENS========================");
        Citizen citizen1 = new Citizen("Mike", "208340536", 20, 25000);
        citizen1.printDetails();
        Citizen citizen2 = new Citizen("Jake", "628510531", 182, 6000);
        citizen2.printDetails();
        Citizen citizen3 = new Citizen("Nike", "542632674", 150, 3000);
        citizen3.printDetails();
        System.out.println("==============SOLDIERS========================");
        Soldier soldier1 = new Soldier("Mano", "202340832", 18, 2400, "Weapon1", "999");
        soldier1.printDetails();
        Soldier soldier2 = new Soldier("Kano", "202340832", 21, 4600, "Weapon2", "939");
        soldier2.printDetails();
        Soldier soldier3 = new Soldier("Tano", "502340832", 190, 8000, "Weapon3", "908479");
        soldier3.printDetails();
        System.out.println("==============OFFICERS========================");
        Officer officer1 = new Officer("Mano", "202340832", 21, 2400, "Weapon1", "999", "Yahlom");
        officer1.printDetails();
        //Officer officer2 = new Officer("Mano","202340832",18,2400,"Weapon1","999","Eliet");//Invalid age
        //Officer officer3 = new Officer("Mano","202340832",300,2400,"Weapon1","999","GOLNI");//Invalid age
        System.out.println("==============PROGRAM END========================");


    }
}
