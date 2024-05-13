package responsability;

public class HandlerPeso extends Handler {
    public HandlerPeso(Handler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void analyzeProduct(Articulo articulo) {
        if (articulo.getPeso() >= 1200 && articulo.getPeso() <= 1300) {
            nextHandler.analyzeProduct(articulo);
        } else {
            System.out.println("El articulo " + articulo.getNombre() + " no cumple el peso requerido");
        }
    }
}
