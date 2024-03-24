package report02;

public class Divisor {
    private int number;
    public Divisor(int number) {
        this.number = number;
    }
    private String divisor() {
        String result = "";
        for(int i = 1; i <= number; i++) {
            if ((number % i) == 0) {
                if (i == 1)
                    result += "" + i;
                else
                    result += ", " + i;
            }
        }
        return result;
    }
    private int sum() {
        String[] numberList = divisor().split(",");
        int total = 0;
        for (int i = 0; i < numberList.length; i++) {
            total += Integer.parseInt(numberList[i].trim());
        }
        return total;
    }
    @Override
    public String toString() {
        return number + "의 약수는 " + divisor() + " 입니다" +
                "\n 약수의 합은 " + sum() + " 입니다";
    }
}

}
