package lesson04.NewWorld;

public class Officer extends Soldier {
    int bonus;
    String type;

    public void setBonus(String type) {
        if (type.equals("8200") || type.equals("3036") || type.equals("Yahlom")) {
            this.bonus = 2000;
        } else if (type.equals("Golani") || type.equals("NAHAL") || type.equals("Kivatai")) {
            this.bonus = 5000;

        } else if (type.equals("669") || type.equals("Matcal") || type.equals("Hovlem")) {
            this.bonus = 8000;

        } else {
            this.bonus = 0;
        }

    }

    @Override
    public void setAge(int age) {

        if (age < 21 || age > 57) {
            System.out.println("Error! Officer Age must be between 21 and 57");
            throw new RuntimeException();
        }
        super.setAge(age);
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Type: "+this.type+" Bonous: "+this.bonus);
    }


    public Officer(String name, String id, int age, int salary, String weapon, String teudatHoger, String type) {
        super(name, id, age, salary, weapon, teudatHoger);
        setType(type);
        setBonus(type);
    }
}
