package main;

import responsability.Handler1;
import responsability.Handler2;
import responsability.Handler3;

public class MainResponsability {
    public static void main(String[] args) {
        Handler3 director = new Handler3();
        Handler2 gerente = new Handler2(director);
        Handler1 ejecutivo = new Handler1(gerente);

        ejecutivo.processRequest(60001);

        director.processRequest(60001);

        gerente.processRequest(60001);
    }
}
