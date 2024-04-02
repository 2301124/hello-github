package variable;
// <변수 선언과 초기화> 섹션2 강의3
// 변수를 선언한다 -> int a;
// 변수 선언, 초기화 각각 따로
// a = 1; ->초기화 했다.
// System.out.println(a); -> 출력
// 한번에 할 수 있다.
// int b=2;  -> // 변수 선언과 초기화를 한번에
// int c=3, d= 4 -> 여러 변수 선언과 초기화를 동시에
// 실행 단축키 -> ctrl shift f10

//정리
//변수의 선언과 초기화를 각각 따로 할 수 있다.
// 변수 선언하면서 동시에 초기화를 할 수 있다.
// 여러 변수를 선언하면서 초기화도 동시에 할 수 있다.


public class Var5 {
    public static void main(String[] args) {

        int a;
        a = 1;
        System.out.println(a);

        int b = 2;
        System.out.println(b);

        int c = 3, d = 4;
        System.out.println(c);
        System.out.println(d);

    }
}
