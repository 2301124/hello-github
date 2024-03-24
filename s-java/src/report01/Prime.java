package report01;

public class Prime {

    private int number;
    public Prime(int number) {
        this.number = number;
    }
    private boolean check() {
        int count = 0;
        for(int i = 2; i <= this.number; ++i) {
            if (this.number % i == 0) {
                ++count;
            }
        }
        if (count == 1) {
            return true;
        } else {
            return false;
        }

    }
}
public String toString() {
    return this.number + (this.check() ? "는 소수(Prime Number) 입니다." :
            "는 합성수(Composite number) 입니다.");
}
}
