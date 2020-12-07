package discounts;

import com.hz.ShoppingCart;

public class BlackFriday implements Discount {
    private int index;

    public BlackFriday(int index) {
        this.index = index;
    }

    public double getDiscount() {
        if (index > 80) {
            return 80;
        }
        return index + 1;
    }
}
