package factory;

public class Factory {
    public static Product getProduct(String product, String number) {

        return switch (product.toLowerCase()) {
            case "iphone" -> new ProductIphone(number);
            case "macbook" -> new ProductMacbook(number);
            default -> null;
        };
    }
}
