package main;

import proxy.ProxyInternet;
import proxy.Service;

import java.util.ArrayList;

public class MainProxy {
    public static void main(String[] args) {
        ArrayList<String> sinAcceso = new ArrayList<>();
        sinAcceso.add("youtube");
        sinAcceso.add("facebook");

        Service internet = new ProxyInternet(sinAcceso);
        internet.conectar("google");
        internet.conectar("youtube");
    }
}
