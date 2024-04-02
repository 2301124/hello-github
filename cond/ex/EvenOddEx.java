package cond.ex;

// 문제와 풀이2 문제4번
// 뮨제: 홀수 짝수 찾기
// 정수 x가 주어지면 x가 짝수이면 짝수를,
// x가 홀수이면 홀수를 출력하는 프로그램을 작성하자
// 삼항 연산자를 사용해야 한다
//츨력 예시
//x:2  -> 출력: x=2, 짝수
// x=3 -> 출력: x=3, 홀수



public class EvenOddEx {
    public static void main(String[] args) {
     /* ==을 써야 했는데 생각을 못했다.
       int x = 3;
        String a = (x % 2 ) ? "짝수": "홀수";
        System.out.println("x= "+ x, + "a");*/
        int x = 3;
        String result = (x % 2==0 ) ? "짝수": "홀수";
        System.out.println("x= "+ x + ", " + result);
    }
}
