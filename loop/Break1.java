package loop;


// <break,continue> 섹션5 강의5
// break,continue는 반복문에서 사용할 수 있는 키워드다
// break 는 반복문을 즉시 종료하고 나간다
// continue 는 반복문의 나머지 부분을 건너뛰고 다음 반복(조건식)으로 진행하는데 사용된다
// break,continue 는 참고로 while,do-while,for와 같은 모든 반복문에서 사용할 수 있다
// while(조건식){코드1; break; 코드2;}
// break를 만나면 코드2가 실행되지 않고 while문이 종료된다
// while(조건식){코드1; continue; 코드2;}
// continue를 만나면 코드2가 실행되지 않고 다시 조건식으로 이동한다
// 조건식이 참이면 while문을 실행한다

// 예제를 통해서 알아보자
// 문제1:1부터 시작해서 숫자를 계속 누적해서 더하다가 합계가 10보다 처음으로 큰 값은 얼마인가?

// 조건식을 보면 true라고 되어있다
// 조건이 항상 참이기 때문에
// 이렇게 두면 while문은 무한 반복됩니다
// break문이 있기 때문에 중간에 빠져나올 수 있다
// 만약 sum>10 조건을 만족하면 결과를 출력하고 break를 사용해서 while문을 빠져나간다



public class Break1 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        while (true) {
            sum += i;
            if(sum>10){
                System.out.println("합이 10보다 크면 종료: i = " + i + " sum = " +sum);
                break;
            }
            i++;
        }
    }


}
