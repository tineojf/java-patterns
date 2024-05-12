package observer;

public class ObserverOferente implements Observer {
    private String nombre;
    private String apellido;
    private String dni;
    private double precioMaximo;

    public ObserverOferente(String nombre, String apellido, String dni, double precioMaximo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.precioMaximo = precioMaximo;
    }

    @Override
    public String update(double precio, String nombre) {
        if (precio + 0.5 <= precioMaximo) {
            System.out.println("El oferente " + this.nombre + " ha ofertado " + (precio + 0.5) + " por el producto " + nombre);
            return "Continua";
        } else {
            System.out.println("El oferente " + this.nombre + " se retira de la subasta");
            return "Retirado";
        }
    }
}
