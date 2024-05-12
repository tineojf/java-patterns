package main;

import singleton.SingletonRemote;

public class MainSingleton {
    public static void main(String[] args) {
        SingletonRemote control = SingletonRemote.getInstance();
        System.out.println(control);
        control.setCanal(4);
        System.out.println(control);

        System.out.println();
        SingletonRemote control2 = SingletonRemote.getInstance();
        System.out.println(control2);
        control2.setCanal(9);
        System.out.println(control2);

        System.out.println();
        System.out.println(control);
        System.out.println(control2);
    }
}
