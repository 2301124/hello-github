package loop;

// <while문1> 섹션 5 강의2
//while문은 게임할 때 계속 돌아간다.
//게임이 계속 뭔가 돌아간다. 종료 누를때까지 계속 돌아간다.(내상각엔 레벨업도 while문인 것 같다.)

// 설명
// while문을 처음 실행할 때는 0이었다
//1. while(count 0<3) -> 참이다
//2. count++ -> count값을 하나 증가하고
// 3. 그때 이 카운트를 출력하면 1이 들어있다

//1. 두번째 while문이 실행된다 while(1<3)
//2. count++ count값을 하나 증가시켜서 count가 2가 되고
//3. 2가 출력된다

// 1. 세번째 while문에 들어갔더니 count가 2이다
// count값을 하나 중가하고
// 3이 출력이 된다

// 그 다음에 while문을 갔는데 count가 3이다 while(3<3) -> 거짓이다
// while문이 종료가 된다

//정리
//while(count<3)에서 코드블럭을 반복 실행한다
//여기서 count값이 1,2,3으로 점점 커지다가 결국
// count<3이 거짓이 되면서 while문을 빠져나간다
//while(count<3)에 있는 숫자를 while(count<100)으로 변경하면 while문의 코드 블럭을 100번 반복한다




public class While1_2 {
    public static void main(String[] args) {
        int count = 1;
        while (count <= 3) {
            ++count;
            System.out.println("현재 숫자는: " + count);

        }
    }
}
