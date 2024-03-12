package cond;

public class CondOp2 {
    public static void main(String[] args) {
//            삼항 연산자 사용
        int age = 18;
        String status = (age >= 18) ? "성인": "미성년자"; //항이 세개여서 삼항 연산자 (age>= 18): 1개 "성인" : 2개 "미성년자"3개
        System.out.println("age = " + age + ", status = " + status);

        

    }
}
