package report02;

public class Main {

    Scanner keyboard = new Scanner(System.in);
System.out.print("자연수 입력 : ");
    int number = keyboard.nextInt();
    Divisor divisor = new Divisor(number);
System.out.println(divisor);

}
