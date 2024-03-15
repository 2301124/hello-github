package cond;

public class Switch3 {
    public static void main(String[] args) {
        int grade = 3;
        int coupon;
        switch(grade){
            case 1:
                coupon = 1000;
                break; //break만나면 빠져나온다
            case 2:
            case 3:
                coupon = 3000; //break가 없으면 다음 라인 즉 coupon = 3000이 실행된다.
                break;
            default: //else와 비슷한 역할
                coupon = 500;
                break;
        }
        System.out.println("발급받은 쿠폰 " + coupon);
    }
} //스위치문에서  조건식은 참 과 거짓이 결과가 나오는 조건이 아니라 값을 넣는다 -> 변수도 넣을 수 있는 것 같다

// 스위치문은 조건식이 특정 case와 같은지만 체크할 수 있다. -> 조건식이 case옆에 있는 숫자와 같은지 확인
// 값이 같은지만 확인하는 연산만 가능하다 문자도 가능

