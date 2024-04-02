package cond.ex;

// <문제와 풀이1>
// 문제1번: 학점 계산하기
// 학생의 점수를 기반으로 학점을 출력하는 자바 프로그램을 작성하자
// 다음과 같은 기준을 따른다
// 90점 이상: "A" 80점이상 90점 미만: "B" 70점이상 80점 미만: C 60점 이상 70점 미만: D 60점 미만: F
// 점수는 변수 int score 로 지정하고, 해당 변수를 기반으로 학점을 출력하자
// 출력 예시
// score: 95
// 출력: 학점은 A입니다.
// score: 85
// 출력: 학점은 B입니다.
//score: 75
// 출력: 학점은 C입니다.
// score: 65
// 출력: 학점은 D입니다.
// score: 55
//출력: 학점은 F입니다.



public class ScoreEx {
    public static void main(String[] args) {
        /* 내가 짠 코드
         int score = 95;


        if(score >= 90) {
            System.out.println("score = " + score + "학점은 A입니다.");
        } else if(80 <= score){
            System.out.println("score = " + score + "학점은 B입니다.");

        }else if(70 <= score){
            System.out.println("score = " + score + "학점은 C입니다.");

        }else if(60<= score){
            System.out.println("score = " + score + "학점은 D입니다.");

        } else {
            System.out.println("score = " + score+ "학점은 F입니다.");
        } */
//        내가 짠 코드 강의 2회독

        int score = 95;
        if(score>=90){
            System.out.println("학점은 A입니다.");
        } else if (score >= 80) {
            System.out.println("학점은 B입니다.");

        } else if (score >= 70) {
            System.out.println("학점은 C입니다.");

        }else if(score >= 60){
            System.out.println("학점은 D입니다.");

        }else{
            System.out.println("학점은 F입니다.");
        }


        /*int score = 59;

        if (score >= 90) {
            System.out.println("학점은 A입니다.");
        } else if (score >= 80) {
            System.out.println("학점은 B입니다.");
        } else if (score >= 70) {
            System.out.println("학점은 C입니다.");
        } else if (score >= 60) {
            System.out.println("학점은 D입니다.");
        } else{
            System.out.println("학점은 F입니다.");
        }*/

    }
}
