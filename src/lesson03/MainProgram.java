package lesson03;

public class MainProgram {
    public static void main(String[] args) {
        Israel israel = new Israel();
        USA usa = new USA();
        China china = new China();
        System.out.println("Israel Tradition-> Food:"
                + israel.myTraditionalFood()
                + " Vacation:" + israel.myTraditionalVacation()
                + " Language:" + israel.myTraditionalLanguage());
        System.out.println("USA Tradition-> Food:"
                + usa.myTraditionalFood()
                + " Vacation:" + usa.myTraditionalVacation()
                + " Language:" + usa.myTraditionalLanguage());
        System.out.println("China Tradition-> Food:"
                + china.myTraditionalFood() +
                " Vacation:" + china.myTraditionalVacation() +
                " Language:" + china.myTraditionalLanguage());

    }
}
