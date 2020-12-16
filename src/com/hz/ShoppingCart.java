package com.hz;
import discounts.Discount;
import products.Product;

import java.util.ArrayList;

public class ShoppingCart extends ArrayList<Product> {

    public double getTotalPrice(Discount discount) {

        double totalPrice = 0.0;

        for(Product product : this) {

            int index = this.indexOf(product);

            double multiplier = 1 - discount.getDiscount(product, index, this);
            double price = product.getPrice() * multiplier;

            totalPrice += price;
        }

        return totalPrice;
    }
}