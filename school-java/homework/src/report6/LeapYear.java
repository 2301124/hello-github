package report6;

public class LeapYear {
    private int year;

    public LeapYear(int year) {
        this.year = year;
    }

    public boolean leapyear() {
        boolean result;
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
            result = true;
        else
            result = false;
        return result;
    }

    @Override
    public String toString() {
        return String.format("%d년은 %s.\n", year,
                leapyear() ? "윤년 입니다" : "평년 입니다");
    }
}
