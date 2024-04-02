package loop;

// <while문2> 섹션5 강의3
// 새로운 변경사항이 등장.
// 기존 문제: i부터 하나씩 증가하는 수를 3번까지 더해라.(i ~i+2더하기)
// 새로운 문제: i부터 하나씩 증가하는 수를 특정수(마지막 수)까지 더해라
// 예 i = 1 마지막 수가 3이라면  1부터 3까지 더해라. 총 3번 더한다.
// i = 1 특정수가 10이면 1부터 10까지 더해라 총 10번 더해라
// i가 10인데 endNum=12이라고 하면 10~12까지 총 3번 더해라


// i =1, endNum = 3
// endNum을 쓸 수가 없다.
// endNum가 10이라면 10번 더해야 한다. -> 코드를 총 10번 반복
// i=1,endNum = 3에서 i=1,endNum=10와 같이 변경하면 코드를 10번 반복해야 한다. 그래서 같은 코드를 더 많이 추가한다.
// 코드가 실행되는 횟수를 유연하게 바꿔야 한다.
//이 때 while문을 사용
//while문을 사용하면 원하는 횟수 만큼 같은 코드를 반복 실행.

// 반복 횟수를 정해야 한다
// 몇번 돌아야 하는지가 중요
// i가 endNum이 될때까지 반복해서 실행하면 된다

// 코드를 분석해보자
//처음에 i= 1이고 endNum=3일 때 (i<=endNum)
//조건을 만족해서 sum= sum(0)+i(1) -> print(i=1, sum=1) -> i++ i를 1증가한다

//i=2가 된다
// 조건을 만족해서 sum = sum(1)+i(2) -> print(i=2, sum=3) -> i++ i를 1증가한다

//i=3이 된다
// 조건을 만족해서 sum = sum(3)+i(3) -> print(i= 3, sum=6) -> i++ i를 1증가한다

// while문에 붙잡혀서 반복된다
// i=4가 된다
// 조건식을 만족하지 않는다
// while문을 종료한다



public class While2_3 {
    public static void main(String[] args) {

        int sum = 0;
       int i = 10;
       int endNum = 12;

       while(i <= endNum){
           sum = sum+ i;
           System.out.println(sum);
           i++;
       }

       /*int sum = 0;
        int i = 1;
        int endNum = 3;

        while(i <= endNum){
            sum = sum + i;
            System.out.println("i="+ i + " sum = " + sum);
            i++;
        }*/
    }
}
