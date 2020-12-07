package discounts;

import com.hz.Customer;

public class NoSales implements Discount {
    private Customer customer;

    public NoSales(Customer customer) {
        this.customer = customer;
    }

    public double getDiscount() {
        if (this.customer.isRegular()) {
            return 0.15;
        }
        return 0;
    }
}
