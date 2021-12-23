
class ManufacturingController {
    static int productCount = 0;

    public static String requestProduct(String product) {
        return ++productCount + ". Requested " + product;
    }

    public static int getNumberOfProducts() {
        return productCount;
    }
}