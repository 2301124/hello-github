package report2;

public class Main {
    public static void main(String[] args) {
        Circle cir1 = new Circle(3);
        Circle cir2 = new Circle(3);
        System.out.printf("cir1의 반지름 : %d\n", cir1.getRadius());
        System.out.printf("cir2의 반지름 : %d\n", cir2.getRadius());
        if (cir1.equals(cir2))
            System.out.println("같은 원입니다.");
        else
            System.out.println("다른 원입니다.");
    }
}
