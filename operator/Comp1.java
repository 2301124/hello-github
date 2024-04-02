package operator;

// <비교 연산자> 섹션3 강의 5
// 비교 연산자는 두 값을 비교하는데 사용한다.
// 주로 조건문과 함께 사용한다.
// ==: 같은가
// !=: 서로 다르다
// 비교 연산자를 사용하면 참(true)또는 거짓(false)이라는 결과가 나온다.
// 참거짓은 boolean 형을 사용한다.
// !은 반대라는 뜻이다.
// 참또는 거짓이라는 결과를 boolean 변수에 담을 수 있다.

// 문자열 비교
// 문자열이 같은지 비교할 때는 ==이 아니라 .equals() 메서드를 사용해야 한다.
// ==을 사용하면 성공할 때도 있지만,실패할 때도 있다.지금은 이해하기 어렵다.








public class Comp1 {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= b);
        System.out.println(a <= b);

        //비교연산자는 결과를 boolean 변수에 담을 수 있다

        boolean result = a == b;
        System.out.println(result);


    }
}
