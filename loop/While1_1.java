package loop;
// <반복문 시작> 섹션5 강의1
// 반복문은 특정 코드를 반복해서 실행할 때 사용한다.
// 자바는 3가지 종류의 반복문을 사용한다. -> while, do-while, for
//예제를 통해서 반복문이 왜 필요한지 알아보자
//1을 한 번씩 더해서 총 3번 더하는 간단한 코드를 만들어보자.
// ctrl + d

// count 코드가 100개를 만들어야 한다면
// 코드 수정할 때 다 바꿔야 할 수 있어서 불편하다. 출력 문구를 수정할 때도 불편하다
// 같은 코드를 반복해야 하는 상황이라면 이 때 사용하는 방법이 반복문이다.

//1을 한번씩 더해서 총 100번 더하는 코드를 만들어보자
//아마도 직접 작성한다면 같은 코드가 100번 반복될 것이다
//이렇게 특정 코드를 반복해서 실행할 때 사용하는 것이
//바로 반복문이다
//반복문에는 while,for문이 있다
//먼저 while문부터 알아보자

// 반복문은 while만 있으면 된다.
// 하지만
// for문을 사용하기 편한 상황이 있다.
// <while문1> 섹션 5 강의2

// while문은 조건에 따라 코드를 반복해서 실행할 때 사용한다.
/*  while문 형태
 while(조건식) {코드}
 설명: while에 조건식이 참이면
 코드를 실행한다 코드를 실행하고 끝나면 다시 돌아와서 조건식을 체크를 한다. 참이면 또 코드를 실행한다. 거짓이면 while을 벗어난다(무한반복)
 -> 코드 블록을 실행하고 거짓이면 while문을 벗어난다 */


public class While1_1 {
    public static void main(String[] args) {
        int count = 0;

       count = count + 1;
        System.out.println(count);
        count = count + 1;
        System.out.println(count);
        count = count + 1;
        System.out.println(count);






    }
}
