package responsability;

public class HandlerEnvasado extends Handler {
    public HandlerEnvasado() {
        super(null);
    }

    @Override
    public void analyzeProduct(Articulo articulo) {
        if (articulo.getEnvase().equalsIgnoreCase("sano") || articulo.getEnvase().equalsIgnoreCase("casi sano")) {
            System.out.println("El articulo " + articulo.getNombre() + " fue aceptado");
        } else {
            System.out.println("El articulo " + articulo.getNombre() + " no cumple el envasado requerido");
        }
    }
}
