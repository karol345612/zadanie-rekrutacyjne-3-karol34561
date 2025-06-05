import java.util.List;

public class DiscountService {

    public double calculateDiscount(String customerType, List<Double> prices) {
        double total = prices.stream().mapToDouble(Double::doubleValue).sum();

        if ("REGULAR".equalsIgnoreCase(customerType)) {
            return total * 0.95; // 5% discount
        } else if ("PREMIUM".equalsIgnoreCase(customerType)) {
            return total * 0.9;  // 10% discount
        } else if ("VIP".equalsIgnoreCase(customerType)) {
            if (total > 1000) {
                return total * 0.8;  // 20% discount
            } else {
                return total * 0.85; // 15% discount
            }
        }

        return total; // no discount
    }
}