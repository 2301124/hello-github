package report03;

public class GCD {
    private int number1;
    private int number2;
    public GCD(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }
    private int gcd(int number1, int number2){
        if(number2 == 0)
            return number1;
        return gcd(number2, number1 % number2);
    }
    @Override
    public String toString() {
        return number1 + ", " + number2 +
                "의 GCD(최대공약수)는 " + gcd(number1, number2) + "입니다";
    }
}
