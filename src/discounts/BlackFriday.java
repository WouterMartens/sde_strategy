package discounts;

import com.hz.ShoppingCart;
import products.Product;

import java.util.ArrayList;

public class BlackFriday implements Discount {
    public double getDiscount(Product product, int index, ArrayList<Product> items) {
        if (items.size() > 8) {
            return 0.8;
        }
        return ((double) items.size()) / 10.0;
    }
}
