public class RewardValue {
    double cash;
    int miles;

    public RewardValue(double cashValue) {
        this.cash = cashValue;
        this.miles = (int) (this.cash / 0.0035);
    }

    public RewardValue(int milesValue) {
        this.miles = milesValue;
        this.cash = this.miles * 0.0035;
    }

    public double getCashValue() {
        return cash;
    }

    public double getMilesValue() {
        return miles;
    }
}
