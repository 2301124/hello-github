package loop;
// while문2
public class While2_2 {
    public static void main(String[] args) {
//        1부터 증가하는 수를 3번 더하라 (1~3)
//        while문을 사용하지 않고 사용해보자.
//
        int sum = 0;
        sum = sum+1;
        System.out.println("i="+ 1 + " sum = " + sum);
        sum = sum + 2;
        System.out.println("i=" + 2+ " sum = " + sum);
        sum = sum + 3;
        System.out.println("i=" + 3 + " sum = " + sum);
//        정답은 맞는데, 개선할 점이 많다. 변경에 유연하지 않다.
//        다음과 같이 요구사항이 변경되었다.
//        문제 10부터 하나씩 증가하는 수를 3번 더해라.
//        변수를 사용해서 더 변경하기 쉬운 코드로 만들어보자. 변경되는 부분을 변수 i로 바꾸어 보자.
       /* 내 풀이 while2_2부분
       int sum2=0; 힌트
        int i = 1; 힌트
        sum2 = sum2 +i; 힌트
        System.out.println(sum2);
        sum2 = sum +i;
        System.out.println(sum2);
        i = i + 3;
        System.out.println(sum2);*/
        int sum3 = 0;
        int i = 1;
        sum3 = sum3 + i;
        System.out.println("i="+ i + " sum3 = " + sum3);
        i++;

        sum3 = sum3 + i;
        System.out.println("i=" + i+ " sum3 = " + sum3);
        i++;
        sum3 = sum3 + i;
        System.out.println("i=" + i + " sum3 = " + sum3);
//    새로운 변경사항이 등장.
//    기존 문제: i부터 하나씩 증가하는 수를 3번까지 더해라.
//        새로운 문제: i부터 하나씩 증가하는 수를 특정수(마지막 수 = endNum)까지 더해라
//        예 마지막 수가 3이라면  1부터 3까지 더해라. 총 3번 더한다.

    }
}
