package lesson03;

public class IE extends Web {
    protected double version = 199.231;

    protected void callPrint() {
        System.out.println("Version:" + version);
        details();
    }
}
