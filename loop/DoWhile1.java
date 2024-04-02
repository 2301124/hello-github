package loop;

// <do-while문> 섹션5 강의4
// do-while문은 while문과 비슷하지만, 조건에 상관없이 무조건 한 번은 코드를 실행한다.
// 형태
//    do {코드} while(조건식)
//    언제 사용하냐?
//    먼제 조건에 만족하지 않아도 한 번은 현재 값을 출력하고 싶다고 하자
// 먼저 while문을 사용한 예제를 보자

public class DoWhile1 {
    public static void main(String[] args) {
        int i = 10;
        while(i < 3){
            System.out.println("현재 숫자는 + " + i);
            i++;
        }
    }
}
