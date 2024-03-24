package report2;

public class Circle {

    private int radius;
    public Circle(int radius) {
        this.radius = radius;
    }
    // 생성자
    public int getRadius() {
        return radius;
    }
    public boolean equals(Circle circle) {
        if (this.radius == circle.getRadius())
            return true;
        else
            return false;
    }
}

