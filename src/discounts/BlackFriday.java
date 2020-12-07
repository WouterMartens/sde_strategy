package discounts;

import com.hz.ShoppingCart;

public class BlackFriday implements Discount {
    private int index;

    public BlackFriday(int index) {
        this.index = index;
    }

    public double getDiscount() {
        if (index >= 79) {
            System.out.print(index);
            return 0.8;
        }
        return (double) index / 10.0; // 1% per product sucks, so I made it 10%
    }
}
