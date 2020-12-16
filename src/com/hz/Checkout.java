package com.hz;

import discounts.*;

public class Checkout {

    private Discount salesAction;

    public Checkout() {
        this.salesAction = DiscountFactory.getDefaultDiscount();
    }

    public void setSalesAction(Discount salesAction) {
        this.salesAction = salesAction;
    }

    public void nextInLine(Customer customer) {
        // Welcome customer
        String welcome = String.format("Hello %s, would you pass me your shopping cart?",
                customer.getName());
        Console.write(welcome);

        // perform checkout
        ShoppingCart cart = customer.getCart();

        double amountToPay = cart.getTotalPrice(this.salesAction);
        String payinfo = String.format("Let's see, that will be.. %.02f. Cash or card?", amountToPay);
        Console.write(payinfo);
    }
}
