package superMarket;


//git repository : https://github.com/emilybache/
//추가 https://github.com/emilybache/GildedRose-Refactoring-Kata/tree/main/Java-Approvals
public class Discount {

    private final String description;
    private final double discountAmount;
    private final Product product;

    public Discount(Product product, String description, double discountAmount) {
        this.product = product;
        this.description = description;
        this.discountAmount = discountAmount;
    }

    public String getDescription() {
        return description;
    }

    public double getDiscountAmount() {
        return discountAmount;
    }

    public Product getProduct() {
        return product;
    }
}
