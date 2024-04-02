package cond.ex;

// 문제와 풀이2 뮨제 3번
//문제: 더 큰 숫자 찾기
// 두개의 정수 변수 a와 b를 가지고 있다
//a의 값은 10이고, b의 값은 20이다
//삼항 연산자를 사용하여 두 숫자중 더 큰 숫자를 출력하는 코드를 작성하자
// 출력 예시
// 더 큰 숫자는 20입니다.


public class CondOpEx {
    public static void main(String[] args) {

        /*int a =10;
        int b = 20;
        String comp = (a>b) ? "더 큰 숫자는" + a : "더 큰 숫자는" + b;
        System.out.println(comp);*/

//        다른 풀이
        int a = 10;
        int b = 20;
        int max = (a>b) ? a: b;
        System.out.println("더 큰 숫자는 " + max + "입니다.");

    }
}
