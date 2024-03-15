package cond;

public class If5 {
    public static void main(String[] args) {
//       내가 짠 코드
        /* int itemPrice = 100000;
        int age = 9;
        int discount = 0;

        if(itemPrice >= 10000 ){
            System.out.println(discount + 1000);
        } else if(age < 10 ){
            System.out.println(discount + 2000);}*/

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
