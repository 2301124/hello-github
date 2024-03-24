package report04;

public class LCM {
    private int number1;
    private int number2;
    private GCD gcd;
    public LCM(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
        gcd = new GCD(number1, number2);
    }
    private int lcm() {
        return (number1 * number2) / gcd.gcd(number1, number2);
    }
    @Override
    public String toString() {
        return gcd.toString() +"\n" +
                number1 + ", " + number2 +
                "의 LCM(최소공배수)는 " + lcm();
    }
}
