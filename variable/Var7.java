package variable;

// <변수 타입1> 섹션2 강의4
// 변수는 데이터를 다루는 종류에 따라서 다양한 형식이 존재한다
// int a = 100; 정수
// double b = 10.5; 실수
// boolean c = true 불리언 true,false만 입력 가능 컴퓨터0과1로 이루어져 있다.
// char d = 'A' 문자 하나만 입력 가능
// String e = "Hello Java" 문자열을 다루기 위한 특별한 타입
// 한줄 바로 복사 ctrl + d

// 설명
// 변수는 데이터를 다루는 종류에 따라서 다양한 형식이 존재한다
// 이러한 형식을 영어로는 타입(type)이라하고,우리말로는 형식 또는 형이라 한다.
// 예 int 타입, int 형식, int형 등으로 부른다.
// 특별히 구분하지 않고, 섞어서 부르기 때문에 모두 같은 말로 이해하면 된다.
// boolean:불리언 타입이라 한다. true,false 값만 사용할 수 있다. 주로 참과 거짓을 판단하는 곳에서 사용한다.
// char: 작은 따옴표(')를 사용해서 감싸야 한다.
// String: 큰 따옴표(") 사용해야 한다.
// String은 첫글자가 대문자로 시작하는 특별한 타입이다.
// 이부분은 뒤에 클래스를 배워야 자세히 이해 할 수 있다.
// 자신의 타입에 맞는 데이터 사용
// 각 변수는 지정한 타입에 맞는 값을 사용해야 한다.
// 예를 들어서 다음의 앞의 코드는 컴파일 오류가 발생한다.
// int a = "백원" 정수 타입에 문자열
// int a = "100" 정수 타입에 문자열
// 프로그래밍 언어에서 리터럴이라는 단어가 있다.
//리터럴 이라는 단어의 어원 자체가 문자 또는 글자를 뜻한다.
// 코드에서 직접 적은 100,10.5,true, A, Hello Java
// 직접 적는 값들 리터럴이라고 한다.
// 고정된 값을 프로그래밍 용어로 리터럴(literal)이라 한다.
// 변수의 값은 변경될 수 있지만 리터럴은 개발자가 직접 입력한 고정된 값이다. 따라서 리터럴 자체는 변하지 않는다.




public class Var7 {
    public static void main(String[] args) {
        int a = 100;
        double b = 10.5;
        boolean c = true;
        char d = 'A';
        String e = "Hello Java";

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);



    }

}
