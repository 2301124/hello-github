package operator;

// <논리 연산자> 섹션3 강의 6
// 논리 연산자는 boolean형인 true,false를 비교하는데 사용한다.
// && (그리고,and): 두 피연산자가 모두 참이면 참을 반환,둘중 하나라도 거짓이면 거짓을 반환
// || (또는,or): 두 피연산자중 하나라도 참이면 참을 반환,둘 다 거짓이면 거짓을 반환
// ! (부정): 피연산자의 논리적 부정을 반환 즉, 참이면 거짓을, 거짓이면 참을 반환

// !:현재 연산의 반대가 결과로 나온다.

// Logical2 파일에서 논리연산자 활용을 해본다.



import java.sql.SQLOutput;

public class Logical1 {
    public static void main(String[] args) {
        System.out.println("&&: AND 연산자");
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && false);

        System.out.println("||: OR연산");
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || false);

        System.out.println("! 연산");
        System.out.println(!true);
        System.out.println(!false);

        System.out.println("변수 활용");
        boolean a = true;
        boolean b = false;

        System.out.println(a && b);
        System.out.println(a || b);
        System.out.println(!a);
        System.out.println(!b);

    }
}
