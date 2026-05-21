public class Bottle {
    private double capacity;
    private double currentAmount;

    public Bottle(double c) {
        capacity = c;
        currentAmount = c;
    }

    public double updateAmount(double amount) {
        currentAmount -= amount;
        if (currentAmount < 0.25*capacity) {
            currentAmount = capacity;
        }
        return currentAmount;
    }
}
