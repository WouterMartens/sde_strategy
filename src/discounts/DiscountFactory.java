package discounts;

import com.hz.SalesAction;

public class DiscountFactory {

    public static Discount getDefaultDiscount() {

        return new NoSale();
    }

    public static Discount getDiscountBySalesAction(SalesAction action) {

        if (action == SalesAction.NoSale) return new NoSale();

        if (action == SalesAction.BlackFriday) return new BlackFriday();

        if (action == SalesAction.ChristmasEve) return new ChristmasEve();

        throw new IllegalArgumentException("Enum value: " + action + " is not supported.");
    }
}
