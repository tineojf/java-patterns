package factory;

public abstract class Product {
    private String model;
    private String number;

    public Product(String model, String number) {
        this.model = model;
        this.number = number;
    }

    protected String getModel() {
        return model;
    }

    protected void setModel(String model) {
        this.model = model;
    }

    protected String getNumber() {
        return number;
    }

    protected void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Product: " + model + " " + number;
    }
}
