package loop;
// <while문2> 섹션5 강의3

// 다음과 같이 요구사항이 변경되었다.
// 문제: 10부터 하나씩 증가하는 수를 3번 더해라.
// 문제2: 변수를 사용해서 더 변경하기 쉬운 코드로 만들어보자. 변경되는 부분을 변수 i로 바꾸어 보자. sum 뒤에 있는 걸 변수를 만들어보자
// 변수 i를 사용한 덕분에 i의 값만 변경하면 나머지 코드를 전혀 변경하지 않아도 된다
// 직접 한 땀 한 땀 짜는 걸 프로그래밍이라고 부르기에 애매하다
// 좋은 코드인지 아닌지는 변경 사항이 발생했을 때 알 수 있다
// 변경사항이 발생했을 때 변경해야 하는 부분이 적을수록 좋은 코드같다

public class While2_2 {
    public static void main(String[] args) {

       /* 내 풀이 while2_2부분

       int sum=0; 힌트
        int i = 1; 힌트
        sum = sum +i; 힌트
        System.out.println(sum2);
        sum = sum +i;
        System.out.println(sum2);
        i = i + 3;
        System.out.println(sum2);*/


        int sum = 0;
        int i = 1;
        sum = sum + i;
        System.out.println("i="+ i + " sum = " + sum);
        i++;

        sum = sum + i;
        System.out.println("i=" + i+ " sum = " + sum);
        i++;
        sum = sum + i;
        System.out.println("i=" + i + " sum = " + sum);

    }
}
