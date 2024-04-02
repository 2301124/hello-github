package cond;

// <switch> 섹션4 강의4
// break문이 없으면
// grade가 2이면 case 2로 가서 case3은 건너뛰고 coupon = 3000이 실행된다.

// 설명
//예를 들어 grade가 2등급이면  먼저 case 2가 실행된다
//그런데 case2에는 break 문이 없다. 그러면 중단하지 않고 바로 다음에 있는 case 3의 코드를 실행한다.
//여기서 coupon = 3000;을 수행하고 break문을 만나서 switch문을 빠져나온다.
// 발급받은 쿠폰 3000이 출력된다.

// if문과 switch문 비교
//스위치문의 조건식을 넣는 부분을 보면 x>10 과 같은 참거짓 결과가 나오는 조건이 아니라,
//단순히 값만 넣을 수 있다
//switch문은 조건식이 특정 case와 같은지만 체크할 수 있다
//요약 값이 같은지 확인 하는 연산만 가능하다(문자도 가능)
//반면 if문은 참,거짓의 결과가 나오는 조건식을 자유롭게 적을 수 있다
//정리하자면 스위치문 없이 if문만 사용해도 된다. if문안에 스위치가 있다
// 하지만 특정 값에 따라 코드를 실행할 때는 스위치문을 사용하면  if문보다 간결한 코드를 작성할 수 있다



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

