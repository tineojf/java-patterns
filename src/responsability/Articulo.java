package responsability;

public class Articulo {
    private String nombre;
    private double lote;
    private double peso;
    private String envase;

    public Articulo(String nombre, double lote, double peso, String envase) {
        this.nombre = nombre;
        this.lote = lote;
        this.peso = peso;
        this.envase = envase;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getLote() {
        return lote;
    }

    public void setLote(double lote) {
        this.lote = lote;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getEnvase() {
        return envase;
    }

    public void setEnvase(String envase) {
        this.envase = envase;
    }
}
