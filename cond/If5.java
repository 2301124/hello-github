package cond;

//<if문3 -if문과 else if문> 섹션 4 강의3
//if문에 else if를 함께 사용할 때가 있고, if를 따로 사용해야 될 때가 있다.
// if랑 else if를 묶어서 이 둘중 하나만 수행이 되라 할때는 if와 else if를 묶는다.
// 각각 따로 수행이 돼야 해 그럴때 if문을 사용한다.

//if문에 여러 조건이 있다고 항상 if-else로 묶어서 사용할 수 있는 것은 아니다.
// 조건이 서로 영향을 주지 않고 각각 수행해야 하는 경우에는 else if문을 사용하면 안되고,
// 대신에 여러 if문을 분리해서 사용해야 한다.
// 서로 관계가 없는게 독립적인 조건,
// 독립적인 조건일 때 연관되지 않게 각각의 조건에 대해서 별도로 실행을 해봐야 한다.
// 예제를 통해서 보자

//문제
// 온라인 쇼핑몰의 할인 시스템을 개발해야 한다.
//한 사용자가 어떤 상품을 구매할 때, 다양한 할인 조건에 따라 총 할인 금액이 달라질 수 있다.
//각각의 할인 조건은 다음과 같다.
//아이템가격이 10000원 이상일때 1000원 할인
// 나이가 10살 이하일 때, 1000원 할인
// 이 할인 시스템의 핵심은 한 사용자가 동시에 여러 할인을 받을 수 있다는 점이다.
// 예를 들어, 10000원짜리 아이템을 구매할 때 1000원 할인을 받고, 동시에 나이가 10살이하면 추가로 1000원 더 할인 받는다
// 그래서 2000원 까지 할인을 받을 수 있다.

// 온라인 쇼핑몰 할인 시스템에서 각각 독립된 if문이 있다.
//따라서 해당하는 모든 할인을 적용한다.
// 만약 else if를 쓰면, 첫 번째로 충족하는 조건만 할인이 적용되고, 나머지는 무시된다.
// 따라서 사용자는 나머지 할인을 놓칠 수 있다.









public class If5 {
    public static void main(String[] args) {
//       내가 짠 코드
        /* int itemPrice = 100000;
        int age = 9;
        int discount = 0;

        if(itemPrice >= 10000 ){
            System.out.println(discount + 1000);
        } else if(age < 10 ){
            System.out.println(discount + 2000);}

        내가 짠 코드 강의 2회독 느낀점 변수가 안 보였다
        int price= 20000;
        int age = 9;
        if(price>= 10000){
            System.out.println("10000원 이상 구매, "+ 1000+ "원 할인");
        } if(age <=10) {
            System.out.println("어린이 " + 1000 + "원 할인");
            System.out.println("총 할인 금액" + 2000 + "원");
        } */

        int price = 10000;
        int age = 10;
        int discount = 0;
        if(price >= 10000){
            discount = discount + 1000;
            System.out.println("10000만원 이상 구매, 1000원 할인");
        }
        if(age <=10){
            discount = discount + 1000;
            System.out.println("어린이 1000원 할인");
        }
        System.out.println("총 할인 금액: " + discount + "원");
    }
}
