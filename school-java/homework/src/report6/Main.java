package report6;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        LeapYear leapYear;
        int year;
        while (true) {
            System.out.print("연도를 입력 (-1은 종료) : ");
            year = keyboard.nextInt();
            if (year == -1)
                break;
            leapYear = new LeapYear(year);
            System.out.println(leapYear);
        }
    }
}
