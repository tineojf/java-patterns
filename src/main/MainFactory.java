package main;

import factory.Factory;
import factory.Product;

public class MainFactory {
    public static void main(String[] args) {
        Product iphone = Factory.getProduct("Iphone", "11");
        Product mac = Factory.getProduct("macboOK", "M3");
        Product notfound = Factory.getProduct("mac", "Studio");

        System.out.println(iphone);
        System.out.println(mac);
        System.out.println(notfound);
    }
}
