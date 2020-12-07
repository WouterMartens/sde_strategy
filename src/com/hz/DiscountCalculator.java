package com.hz;

import products.Product;
import discounts.*;

public class DiscountCalculator {

    private Customer customer;

    private Discount discount;

    public void setChristmasEve(boolean christmasEve) {
        isChristmasEve = christmasEve;
    }
    private boolean isChristmasEve;

    public void setBlackFriday(boolean blackFriday) { isBlackFriday = blackFriday; }
    private boolean isBlackFriday;

    public DiscountCalculator(Customer customer) {
        this.customer = customer;
    }

    public double getDiscount(Product product, int index) {
        boolean isFirstProduct = index == 0;

        if(isChristmasEve) {
            this.discount = new ChristmasEve(isFirstProduct);
        } else if (isBlackFriday) {
            this.discount = new BlackFriday(index);
        } else {
            this.discount = new NoSales(this.customer);
        }

        return 1 - this.discount.getDiscount();
    }

//    public void setDiscount(Discount discount) {
//        this.discount = discount;
//    }
//
//    public double calculateDiscount() {
//        return this.discount.getDiscount();
//    }
}
