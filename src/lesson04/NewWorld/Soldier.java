package lesson04.NewWorld;

public class Soldier extends Citizen {
    String weapon;
    String teudatHoger;

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public void setTeudatHoger(String teudatHoger) {
        int countNine = 0;
        for (int i = 0; i < teudatHoger.length(); i++) {
            if (teudatHoger.charAt(i) == '9') {
                countNine++;
            }
        }
        if (countNine > 3) {
            System.out.println("Warning! Teudat Hoger Must not contain more than three Nines");
        }

        this.teudatHoger = teudatHoger;
    }

    @Override
    public void setAge(int age) {
        if (age < 18 || age > 21) {
            System.out.println("Warning! invalid age for a Soldier...");
        }
        super.setAge(age);
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Weapon: "+this.weapon+" Teudat Hoger: "+this.teudatHoger);
    }

    public Soldier(String name, String id, int age, int salary, String weapon, String teudatHoger) {
        super(name, id, age, salary);
        setWeapon(weapon);
        setTeudatHoger(teudatHoger);
    }


}
