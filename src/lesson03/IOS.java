package lesson03;

public class IOS extends Mobile {
    protected double osVersion=15.3;
    protected int price=4200;
    protected void callPrint()
    {
        System.out.println("osVersion:"+osVersion);
        System.out.println("price:"+price);
        details();
    }
}
