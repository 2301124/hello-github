package cond;

// <삼항 연산자> 섹션 4 강의 5
// 항이 3개여서 삼항연산자다.
// if문을 사용할 때 다음과 같이 단순히 참과거짓에 따라 특정 값을 구하는 경우가 있다
// 아래의 예제는 참과 거짓에 따라서 status 변수의 값이 달라진다
// 이렇게 단순히 참과 거짓에 따라 특정 값을 구하는 경우 삼항 연산자 또는 조건 연산자라고 불리는
// ?: 연산자를 사용할 수 있다
// 이 연산자를 사용하면 if문과 비교해서 코드를 단순화 할 수 있다
//





public class CondOp1 {
    public static void main(String[] args) {

        int age = 18;
        String status;
        if(age >= 18){
            status = "성인";
        }else{
            status = "미성년자";
        }
        System.out.println("age = " + age + ", status = " + status);
        // 위에 예제는 참과 거짓에 따라 status 변수값이 달라진다
        // 단순히 참과 거짓으로 (특정) 값을 구하는 걸 삼항연산자,조건 연산자라고 불리는  ?: 연산자를 사용할 수 있다


    }
}
