package proxy;

import java.util.ArrayList;

public class ProxyInternet implements Service {
    private final ArrayList<String> blocked;
    private final ServiceInternet service;

    public ProxyInternet(ArrayList<String> blocked) {
        this.blocked = blocked;
        this.service = new ServiceInternet();
    }

    @Override
    public void conectar(String url) {
        if (blocked.contains(url)) {
            System.out.println("Acceso denegado");
        } else {
            this.service.conectar(url);
        }
    }
}
