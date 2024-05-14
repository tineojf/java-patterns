package facade;

public class Account {
    private String dni;
    private String pass;
    private Double mount;

    public Account(String dni, String pass) {
        this.dni = dni;
        this.pass = pass;
        this.mount = 0.0;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public Double getMount() {
        return mount;
    }

    public void setMount(Double mount) {
        this.mount = mount;
    }
}
