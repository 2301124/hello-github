package cond;

//<switch> 섹션4 강의4
// 다음 문제를 코드로 풀어보자
//당신은 회원 등급에 따라 다른 쿠폰을 발급하는 프로그램을 작성해야 한다.
// 이 프로그램은 int grade 라는 변수를 사용하며, 회원 등급(grade)에 따라 다음의 쿠폰을 발급해야 한다.
// 1등급 쿠폰: 1000 2등급 쿠폰: 2000 3등급 쿠폰: 3000 위의 등급이 아닐 경우: 500
// 각 쿠폰이 할당된 후에는 "발급받은 쿠폰" + 쿠폰값을 출력해야 한다.
// 2등급 사용자 출력 예)
//발급 받은 쿠폰 2000
// 아래의 코드를 switch문으로 바꿔보자
public class Switch1 {
    public static void main(String[] args) {
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
        // if문은 비교연산자를 쓸 수 있지만 switch문은 단순히 값이 같은지만 비교
        /*내가 짠 코드 강의 2회독 느낀점 coupon 변수를 설정을 도움을 받았다.
        int grade = 2;
        int coupon = 0;
        if(grade == 1){
            coupon+= 1000;
            System.out.println("발급받은 쿠폰" + coupon);
        }else if(grade == 2){
            coupon+=2000;
            System.out.println("발급받은 쿠폰" + coupon);
        }else if(grade ==3){
            coupon+=3000;
            System.out.println("발급받은 쿠폰" + coupon);
        } else{
            coupon += 500;
            System.out.println("발급받은 쿠폰" + coupon);
        }*/
//        영하쌤 풀이 느낀점 깔금하다.
        int grade = 2;
        int coupon;
        if(grade == 1) {
            coupon = 1000;
        }
        else if(grade == 2){
           coupon = 2000;
        } else if(grade == 3){
            coupon = 3000;
        } else{
          coupon = 500;
        }
        System.out.println("발급받은 쿠폰 " + coupon );
    }
}
