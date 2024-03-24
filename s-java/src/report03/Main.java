package report03;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("자연수 2개 입력 : ");
        int number1 = keyboard.nextInt();
        int number2 = keyboard.nextInt();
        GCD gcd = new GCD(number1, number2);
        System.out.println(gcd);



}


