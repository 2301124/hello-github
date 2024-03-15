package cond;

public class Switch1 {
    public static void main(String[] args) {
        int grade = 2;
        int coupon = 0;
        if(grade == 1) {
            System.out.println(coupon = 1000);
        }
        else if(grade == 2){
            System.out.println(coupon = 2000);
        } else if(grade == 3){
            System.out.println(coupon = 3000);
        } else if (grade >= 4){
            System.out.println(coupon = 500);

        }
        System.out.println("발급받은 쿠폰 " + coupon );
        /*int grade = 2;
        int coupon;
        if(grade == 1){
            coupon = 1000;
        }
        else if (grade == 2){
            coupon = 2000;
        }
        else if (grade == 3){
            coupon = 3000;
        }else {
            coupon = 500;
        }
        System.out.println("발급 받은 쿠폰 " + coupon);*/
    } // if문은 비교연산자를 쓸 수 있지만 switch문은 단순히 값이 같은지만 비교
}
