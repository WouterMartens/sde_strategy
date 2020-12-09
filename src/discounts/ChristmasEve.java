package discounts;

import products.Product;

import java.util.ArrayList;

public class ChristmasEve implements Discount {
    public double getDiscount(Product product, int index, ArrayList<Product> items) {
        boolean isFirstProduct = index == 0;

        if (isFirstProduct) {
            return .2;
        }
        return .125;
    }
}
