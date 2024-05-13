package flyweight;

public class FlyweightArbol {
    private String tipo;
    private double alto;
    private double ancho;
    private String color;

    public FlyweightArbol(String tipo, double alto, double ancho, String color) {
        this.tipo = tipo;
        this.alto = alto;
        this.ancho = ancho;
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
