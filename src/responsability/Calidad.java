package responsability;

public class Calidad {

    public static void analizar(Articulo articulo) {
        HandlerEnvasado envasado = new HandlerEnvasado();
        HandlerPeso peso = new HandlerPeso(envasado);
        HandlerLote lote = new HandlerLote(peso);

        lote.analyzeProduct(articulo);
    }
}
