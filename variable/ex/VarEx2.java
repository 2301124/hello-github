package variable.ex;

// 문제 2
// 1. 변수 num1을 선언하고, 이에 10을 할당하세요
// 2. 변수 num2을 선언하고, 이에 20을 할당하세요
// 3. 두 변수의 합을 구하고, 그결과를 새로운 변수 sum에 저장하세요
// 4. sum 변수의 값을 출력하세요.


public class VarEx2 {
    public static void main(String[] args) {
        int num1;
        int num2;
        num1 = 10;
        num2 = 20;
        System.out.println(num1 + num2);
        int sum = num1 + num2;
        System.out.println(sum);

    }
}
// num1 + num2을 읽는다 ->2. 계산 10 + 20 -> 3. 대입30
