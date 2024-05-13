package responsability;

public class HandlerLote extends Handler {
    public HandlerLote(Handler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void analyzeProduct(Articulo articulo) {
        if (articulo.getLote() >= 1000 & articulo.getLote() <= 2000) {
            nextHandler.analyzeProduct(articulo);
        } else {
            System.out.println("El articulo " + articulo.getNombre() + " no cumple el lote requerido");
        }
    }
}
