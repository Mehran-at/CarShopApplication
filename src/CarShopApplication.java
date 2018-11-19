public class CarShopApplication {
    public static void main(String[] args) {
        Seller seller = new Seller();
        Car carBrandZero = new Car("BMW");
        Car carBrandOne = new Car("AUDI");
        Car carBrandTwo = new Car("BENZ");
        Seller.describe(carBrandZero);
        Seller.describe(carBrandOne);
        Seller.describe(carBrandTwo);
    }
}
