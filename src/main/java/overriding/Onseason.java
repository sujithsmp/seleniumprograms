package overriding;

public class Onseason extends Season {
    public double discount(double price) {
        // Calculate discount for on-season clothing (40% discount)
        double discountRate = 0.40;
        return price * (1 - discountRate);
    }
}