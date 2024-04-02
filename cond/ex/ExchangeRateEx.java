package cond.ex;


// <문제와풀이1>
// 문제3번 : 환율 계산기
// 특정 금액을 미국 달러에서 한국 원으로 변환하는 프로그램을 작성하자
//환율은 1달러당 1300원이라고 가정합니다
// 다음과 같은 기준을 따른다
// 달러가 0미만이면: 잘못된 금액입니다
// 달러가 0일 때: 환전할 금액이 없습니다
// 달러가 0초과일 때: 환전금액은 (계산된 원화 금액)원입니다
//금액은 변수(int dollar)로 지정하고, 해당 변수를 기반으로 한국 원으로의 환전 금액을 출력하자
//출력 예시
//dollar:-5
//출력 잘못된 금액입니다.
//dollar:0
// 출력: 환전할 금액이 없습니다.
//dollar:10
// 출력: 환전할 금액은 13000원입니다.


public class ExchangeRateEx {
    public static void main(String[] args) {
        /*int dollar = 10;

        if (dollar < 0) {
            System.out.println("잘못된 금액입니다.");
        }else if(dollar == 0){
            System.out.println("환전할 금액이 없습니다.");
        } else{
            System.out.println(dollar * 1300);
        }*/
//        내가 짠 코드 2회독 느낀점 (출력문에는 변수 1개만 넣자 -> if문에서 변수 선언한 걸 ->) dollar 선언을 2번 했다
//        -> 원을 선언 했으면 더 남이 봤을 때 이해하기 쉬웠을 것 같다


        /*int dollar = 10;
        if(dollar < 0){
            System.out.println("잘못된 금액입니다.");
        } else if(dollar == 0){
            System.out.println("환전할 금액이 없습니다.");
        } else{
            System.out.println("환전할 금액은 "+ dollar* 1300 + "원입니다.");
        }*/

        /* 영하쌤 풀이
        if (dollar < 0) {
            System.out.println("잘못된 금액입니다.");
        } else if (dollar == 0) {
            System.out.println("환전할 금액이 없습니다.");
        } else{
         int won = dollar * 1300;
            System.out.println("환전할 금액은 " + won + "원입니다.");
        }*/
//      영하쌤 말씀
//        너무 생각하는 문제보다는 코드를 지금 단계에서는 자바를 처음 했다고 가정하기 때문에
//        if문을 이렇게 작성하고 이런거에 익숙해지는게 훨씬 중요하다
//
    }
}
