public class RewardValue {

    private double cashValue;
    private int milesValue;
    public static final double CONVERSION_RATE = 0.0035;

    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        cashValue = convertMilesToCash();
    }

    public RewardValue (double cashValue) {
        this.cashValue = cashValue;
        milesValue = convertCashToMiles();
    }
    private double convertMilesToCash(){
        return milesValue * CONVERSION_RATE;
    }
    private int convertCashToMiles(){
        return (int) (cashValue / CONVERSION_RATE);
    }
    public double getCashValue () {
        return cashValue;
    }

    public int getMilesValue () {
        return milesValue;
    }
}
