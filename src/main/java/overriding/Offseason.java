package overriding;

public class Offseason extends Season {
    public double discount(double price) {
        // Calculate discount for off-season clothing (15% discount)
        double discountRate = 0.15;
        return price * (1 - discountRate);
    }
}