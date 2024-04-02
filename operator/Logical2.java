package operator;

// <논리 연산자> 섹션3 강의 6강의
// 논리 연산자 활용
// a는 10보다 크고 20보다 작다라는 조건
// boolean result = a> 10 && a<20 -> (a >10) && (a < 20)같은 뜻이다.
// 위치는 상관이 없다.
// boolen result = 10 < 10 && a < 20





public class Logical2 {
    public static void main(String[] args) {
        int a = 15;
        // a는 10보다 크고 20보다 작다
        boolean result = a > 10 && a < 20; // 연산 순서 ->(a > 10) && (a < 20) 그다음 비교 연산 수행
        System.out.println("result = " + result);


    }
}
