package cond;

//<if문3 -if문과 else if문> 섹션 4 강의3
// 앞의 코드를 고쳐본다.
//elseif를 써야 하나 말아야 하나는 묶어서 하나만 실행해야 하는 경우는 else if를 써야 하고,
//각각 따로 실행해야 하면 if문을 두시면 된다.

//정리
// if문을 사용할 때 각각 쓸지, 아니면 묶어서 사용할지는 사용자의 요구사항에 따라 다르다.
//둘의 차이를 이해하고 적절하게 사용하면 된다

//참고
// 코드 블록을 지울 수 있다.단 코드가 한줄 일때(실행하는 문장)

// 프로그래밍 스타일에 따라서 다르겠지만,
//일반적으로는 if문의 명령이 한개만 있을 경우에도 다음과 같은 이유로 중괄호를 사용하는 것이 좋다.
//가독성: 중괄호를 사용하면 코드를 더 읽기 쉽게 만들어 준다.
//조건문의 범위가 명확하게 표시되므로 코드의 흐름을 더 쉽게 이해 할 수 있다.
//유지보수성:중괄호를 사용하면 나중에 코드를 수정할 때 오류를 덜 발생시킬 수 있다.
//예를 들어, if문에 또 다른 코드를 추가하려고 할 때, 중괄호가 없으면 이 코드가 if문의 일부라는 것이 명확하지 않을 수 있다.






public class If6 {
    public static void main(String[] args) {
        int price = 10000;
        int age = 10;
        int discount = 0;
        if(price >= 10000){
            discount = discount + 1000;
            System.out.println("10000만원 이상 구매, 1000원 할인");
        }else if(age <=10){
            discount = discount + 1000;
            System.out.println("어린이 1000원 할인");
        } else{
            System.out.println("할인 없음");
        }
        System.out.println("총 할인 금액: " + discount + "원");


        if(false) // 실행 하는 코드가 한줄일때 중괄호 생략 가능
            System.out.println("if문에서 실행됨");
        System.out.println("if문에서 실행안됨");// if문과 무관하게 실행된다



    }
}
