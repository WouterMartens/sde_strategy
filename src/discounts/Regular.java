package discounts;

import com.hz.Customer;
import products.Product;

import java.util.ArrayList;

public class Regular implements Discount {
    public double getDiscount(Product product, int index, ArrayList<Product> items) {
        return 0.15;
    }
}
