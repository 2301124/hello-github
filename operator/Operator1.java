package operator;

// <산술 연산자> 섹션 3 강의1
// 연산자는 더하고 빼고 곱하고 나누고 하는 것들을 연산자.
// 산술 연산자
// 연산자 시작
// + - * /와 같이 계산을 수행하는 기호를 연산자라 한다.
//자바에는 다양한 연산자가 있다.
// 실무에서 주로 다루는 연산자 위주로 설명

// 연산자와 피연산자
// 3 + 4
// a + b
// 연산자(operator): 연산기호 - 예) +,-
// 피연산자(operand): 연산 대상 - 예) 3,4,a,b

// 산술 연산자
// 산술 연산자는 주로 숫자를 계산하는데 사용. 수학 연산을 수행한다.
// +(더하기) -(빼기) *(곱하기) /(나누기) %(나머지)

// 변수 초기화
// int a = 5
// int b = 2

// 덧셈
// int sum = a + b
// System.out.println("a + b = " + sum) -> 출력 a + b = 7

//뺄셈
// int diff = a - b
//System.out.println(" a - b = " + diff)

//곱셈
// int multi = a * b
// System.out.println("a * b = " + multi)

//나눗셈
// 인트형끼리 계산을 하면 인트형이 나온다.

// int sum = a + b 계산 과정
// int sum = a + b 1. 변수값 읽기
// int sum = 5 + 2 2. 변수값 계산
// int sum = 7 3. 3.계산결과를 sum에 대입
// sum = 7 최종 결과

// 5/2의결과는 2.5가 되어야 하지만 결과는 소수점이 제거된 2가 나왔다
// 자바에서 int형끼리 계산하면 계산결과도 같은 int형을 사용한다.
// int형은 정수이기 때문에 소수점 이하를 포함할 수 없다.
// 나머지 연산자는 실무와 알고리즘 모두 종종 사용되므로 잘 기억

// 주의 0으로 나누기
//숫자는 0으로 나눌 수 없다.(수학에서 허용하지 않음)
// 숫자를 0으로 나누면 프로그램에 오류가 발생한다.

// 문제가 발생하면 밖으로 나가고 프로그램 종료 문제 발생뒤부터 프로그램이 안 나온다.






public class Operator1 {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;
//        b에다가 0대입
        // 덧셈
        int sum = a + b;
        System.out.println("a + b =" + sum);
        // 뺄셈
        int diff = a - b;
        System.out.println("a - b = " + diff);

        //곱셈
        int multi = a * b;
        System.out.println("a * b = " + multi);

        //나눗셈
        int div = a / b;
        System.out.println("a / b = " + div);

        //나머지
        int mod = a % b;
        System.out.println("a % b= " + mod);

//        int z = 10 / 0;
    }
}
