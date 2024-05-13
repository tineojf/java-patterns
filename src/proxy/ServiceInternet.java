package proxy;

public class ServiceInternet implements Service {
    public ServiceInternet() {
    }

    @Override
    public void conectar(String url) {
        System.out.println("Redirigiendo a " + url);
    }
}
