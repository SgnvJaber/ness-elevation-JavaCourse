package lesson03;

import com.sun.org.apache.xpath.internal.operations.And;

public class ClientClassMain {
    public static void main(String[] args) {
        System.out.println("=============Desktop==============");
        Desktop desktop = new Desktop();
        desktop.details();
        System.out.println("=============WEB==============");
        IE ie = new IE();
        Chrome chrome = new Chrome();
        ie.callPrint();
        chrome.callPrint();
        System.out.println("=============MOBILE==============");
        Android android = new Android();
        IOS ios = new IOS();
        android.callPrint();
        ios.callPrint();
    }
}
