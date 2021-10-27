package lesson03;

public class Android extends Mobile {
    protected double osVersion=11.3;
    protected int price=400;
    protected void callPrint()
    {
        System.out.println("osVersion:"+osVersion);
        System.out.println("price:"+price);
        details();
    }
}
