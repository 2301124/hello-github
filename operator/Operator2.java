package operator;

// <문자열 더하기> 섹션3 강의 2
// 자바는 특별하게 문자열에도 + 연산자를 사용할 수 있다. 문자열에 + 연산자를 사용하면 두 문자를 연결할 수 있다.
// 문자열을 더해서 더 큰 문자열을 만들어준다.
// 문자열을 더해서 두개를 연결한다.

// 문자열과 숫자 더하기1
// 문자열에다가 어떻게 숫자를 더하지?
// 문자열과 숫자를 더할 수 없다.
// 문자열과 숫자를 더하면 숫자를 문자로 바꿔준다.

// 자바는 문자열인 String 타입에 다른 타입을 더하는 경우 대상 타입을 문자열로 변경한다.
// 문자열에 더하는 것은 다 문자열이 된다.



public class Operator2 {
    public static void main(String[] args) {
        // 문자열과 문자열 더하기
        String result1 = "hello " + "world";
        System.out.println(result1);

        String s1 = "string1";
        String s2 = "string2";
        String result2 = s1 + s2;
        System.out.println(result2);

//        문자열과 숫자 더하기
        String result3 = "a + b = " + 10;
        System.out.println(result3);

        int num = 20;
        String str = "a + b = ";
        String result4 = str + num;
        System.out.println(result4);

    }
}
