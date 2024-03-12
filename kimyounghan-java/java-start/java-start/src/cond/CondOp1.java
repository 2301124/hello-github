package cond;

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
