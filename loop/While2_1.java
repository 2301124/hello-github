package loop;
// <while문2> 섹션5 강의3
// 문제1: 1부터 하나씩 증가하는 수를 3번 더해라
// 이 문제는 1부터 하나씩 증가하는 수이기 때문에 1+2+3을 더해야 한다
// 우선 while문을 사용하지 않고 단순 무식하게 풀어보자
// 정답은 맞는데, 개선할 점이 많다. 변경에 유연하지 않다.






public class While2_1 {
    public static void main(String[] args) {

         /* 내 풀이*/
        int sum = 0; // 힌트
        sum = sum +1;
        System.out.println("i = " + 1 +"sum = " + sum); // i를 추가
        sum +=2;
        System.out.println("i = " + 2 +"sum = " +  sum);
        sum +=3;
        System.out.println("i = " + 3 +"sum = " +  sum);

//        정답
        /*int sum = 0;
        sum = sum+1;
        System.out.println("i="+ 1 + " sum = " + sum);
        sum = sum + 2;
        System.out.println("i=" + 2+ " sum = " + sum);
        sum = sum + 3;
        System.out.println("i=" + 3 + " sum = " + sum);*/

    }
}
