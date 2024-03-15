package cond.ex;

public class ScoreEx {
    public static void main(String[] args) {
        /* int score = 95;


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

        int score = 59;

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
        }

    }
}
