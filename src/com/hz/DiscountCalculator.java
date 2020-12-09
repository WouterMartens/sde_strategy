package com.hz;

import products.Product;
import discounts.*;

import java.util.ArrayList;

public class DiscountCalculator {

    private Customer customer;

    private Discount discount;

    public DiscountCalculator(Customer customer) {
        this.customer = customer;
    }

    public double getDiscount(Product product, int index, ArrayList<Product> items) {
        return 1 - this.discount.getDiscount(product, index, items);
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }
}
