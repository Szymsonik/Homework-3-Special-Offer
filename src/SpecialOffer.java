public class SpecialOffer {
    Product product;
    String description;
    String startOffer;
    String endOffer;
    double discount;

    SpecialOffer(Product prod, String des, String start, String end, double dis) {
        product = prod;
        description = des;
        startOffer = start;
        endOffer = end;
        discount = dis;
    }

    void showOffer() {
        double priceAfterDiscount = product.price - product.price * discount;
        System.out.println("Special offer on: " + product.name);
        System.out.println(description);
        System.out.println("Start offer: " + startOffer);
        System.out.println("End offer: " + endOffer);
        System.out.println("Discount: " + discount * 100 + "%");
        System.out.println("Price after discount: " + priceAfterDiscount + "zł");
    }

}
