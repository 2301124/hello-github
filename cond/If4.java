package cond;


//<if문2-else if> 섹션 4 강의2
//else if문
// else if문은 앞선 if문의 조건이 거짓일 때 다음 조건을 검사한다.
// 만약 앞선 if문이 참이라면 else if를 실행하지 않는다
// if3.java파일에서 if문은 if문이 따로 되어 있다.
// 서로 다른 if문 이다. 다른 if문 5개가 있다.
//if(condition1){조건1이 참일때 실행되는 코드}else if(condition2){조건1이 거짓이고 조건2가 참일때 실행되는 코드}
// else{모든 조건이 거짓일 때 실행되는 코드}
// 첫번째 조건이 참이면 수행하고 빠져나간다.
// 쉽게 이야기해서 전체 if문을 하나로 묶는다고 보면 된다.
// 이렇게 하면 특정 조건이 만족하면 해당 코드를 실행하고, if문 전체를 빠져나온다.
// 특정 조건을 만족하지 않으면 다음 조건을 검사한다.
// 여기서 핵심은 순서대로 맞는 조건을 찾아보고, 맞는 조건이 있으면 딱 1개만 실행되는 것이다.

// age=7인 경우
// if(age <= 7)의 조건이 참이다. 미취학을 출력하고 전체 if문 밖으로 나간다.
//age=13인경우
//if (age <= 7 )의 조건이 거짓이다. 다음조건으로 넘어간다.
// else if(age <=13)의 조건이 참이다.






public class If4 {
    public static void main(String[] args) {
        int age = 14    ;
        if(age <= 7){
            System.out.println("미취학");
        } else if (age <= 13) {
            System.out.println("초등학생");
        } else if (age <= 16){
            System.out.println("중학생");
        } else if (age <= 19){
            System.out.println("고등학생");
        }else {
            System.out.println("성인");
        }


    }
}
