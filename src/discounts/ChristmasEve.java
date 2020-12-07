package discounts;

public class ChristmasEve implements Discount {
    private boolean isFirstProduct;

    public ChristmasEve(boolean isFirstProduct) {
        this.isFirstProduct = isFirstProduct;
    }

    public double getDiscount() {
        if (isFirstProduct) {
            return .2;
        }
        return .125;
    }
}
