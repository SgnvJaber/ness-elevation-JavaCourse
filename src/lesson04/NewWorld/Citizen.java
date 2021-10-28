package lesson04.NewWorld;

public class Citizen {
    String name;
    String id;
    int age;
    int salary;

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        if (id.length() != 9) {
            System.out.println("Warning! ID length must be 9");
        }
        if (id.length() % 2 == 0) {
            System.out.println("Warning! ID length must not be dividable by two");
        }
        this.id = id;
    }

    public void setAge(int age) {
        if (age < 0 || age > 120) {
            System.out.println("Warning! invalid  age for a Citizen ...");
        }
        this.age = age;
    }

    public void setSalary(int salary) {
        if (salary < 0) {
            System.out.println("Warning! invalid salary...");
        }
        this.salary = salary;
    }

    public Citizen(String name, String id, int age, int salary) {
        setName(name);
        setAge(age);
        setId(id);
        setSalary(salary);
    }

    public void printDetails() {
        System.out.println("Name: " + this.name + " ID: " + this.id + " Age:" + this.age+" Salary:"+this.salary);
    }
}
