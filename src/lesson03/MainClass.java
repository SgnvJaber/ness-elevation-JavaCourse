package lesson03;

public class MainClass {
    public static void main(String[] args) {
        Child1 my_name = new Child1();
        Child2 brother_name = new Child2();
        System.out.println("My Name: " + my_name.last_name + " " + my_name.first_name);
        System.out.println("Brother Name: " + brother_name.last_name + " " + brother_name.first_name);
    }
}
