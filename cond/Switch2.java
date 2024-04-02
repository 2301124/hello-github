package cond;

//<switch> 섹션4 강의4
//switch문은 앞서 배운 if문을 조금 더 편리하게 사용할 수 있는 기능이다
// 참고로 if문은 비교연산자를 사용할 수 있찌만, switch문은 단순히 값이 같은지만 비교할 수 있다

// switch문 형태
// switch (조건식) {case value1 : 조건식의 결과 값이 value1일 때 실행되는 코드 break; -> 조건식값= value1일때 실행된다.
// case value2: 조건식의 결과 값이 value2일 때 실행되는 코드 break;
// default: 조건식의 결과 값이 위의 어떤 값에도 해당하지 않을 때 실행되는 코드

//grade가 1이면 coupon: 1000이고, grade가 2이면 coupon: 2000이고, grade가 3이면 coupon: 3000이고, grade가 그외이면 coupon: 500이다.
// break를 만나면 스위치문을 빠져나온다.

// break문이 없다면?
// 만약 break문이 없으면 어떻게 되는지 확인하기 위해 조건을 변경해보자
//비즈니스 요구사항이 변경되었다. 2등급도 3등급과 같이 3000원 쿠폰을 준다고 해보자
//switch문 3



public class Switch2 {
    public static void main(String[] args) {
        int grade = 2;
        int coupon;
        switch(grade){
            case 1:
                coupon = 1000;
                break; //break만나면 빠져나온다
            case 2:
                coupon = 2000;
                break;
            case 3:
                coupon = 3000;
                break;
            default: //else와 비슷한 역할
                coupon = 500;
        }
        System.out.println("발급받은 쿠폰 " + coupon);
    }
}
