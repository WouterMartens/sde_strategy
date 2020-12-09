package com.hz;

import discounts.BlackFriday;
import discounts.ChristmasEve;
import discounts.NoSale;
import discounts.Regular;

public class Checkout {

    private SalesAction salesAction;

    public Checkout(SalesAction action) {
        this.salesAction = action;
    }

    public void nextInLine(Customer customer) {

        // init checkout
        DiscountCalculator discountCalculator = new DiscountCalculator(customer);

        if (salesAction == SalesAction.ChristmasEve) {
            discountCalculator.setDiscount(new ChristmasEve());
        } else if (salesAction == SalesAction.BlackFriday) {
            discountCalculator.setDiscount(new BlackFriday());
        } else if(customer.isRegular()) {
            discountCalculator.setDiscount(new Regular());
        } else {
            discountCalculator.setDiscount(new NoSale());
        }

        // Welcome customer
        String welcome = String.format("Hello %s, would you pass me your shopping cart?",
                customer.getName());
        Console.write(welcome);

        // perform checkout
        ShoppingCart cart = customer.getCart();

        double amountToPay = cart.getTotalPrice(discountCalculator);
        String payinfo = String.format("Let's see, that will be.. %.02f. Cash or card?", amountToPay);
        Console.write(payinfo);
    }
}
