package discounts;

import products.Product;

import java.util.ArrayList;

public interface Discount {
    double getDiscount(Product product, int index, ArrayList<Product> items);
}
