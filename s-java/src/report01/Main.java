package report01;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        public static void main(String[] args) {
            Scanner keyboard = new Scanner(System.in);
            System.out.print("자연수 입력 : ");
            int number = keyboard.nextInt();
            Prime prime = new Prime(number);
            prime.check();
            System.out.println(prime);
        }
    }
}