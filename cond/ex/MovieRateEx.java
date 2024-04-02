package cond.ex;

// 문제와 풀이2 문제1번
// 평점에 따른 영화 추천하기
//요청한 평점 이상의 영화를 찾아서 추천하는 프로그램을 작성하자
//어바웃타임- 평점9 토이스토리- 평점8 고질라-평점7
//평점 변수double rating을 사용하세요
//if문을 활용해서 문제를 풀자




public class MovieRateEx {
    public static void main(String[] args) {
       /* double rating = 7;
        if(rating > 6.9){
            System.out.println("'어바웃타임'을 추천합니다.");
            System.out.println("'토이스토리'을 추천합니다.");
            System.out.println("'고질라'을 추천합니다.");
        }else if(rating >= 7.1 && rating <=8.9 ){
            System.out.println("'어바웃타임'을 추천합니다.");
            System.out.println("'토이스토리'을 추천합니다.");

        } else{
            System.out.println("'어바웃타임'을 추천합니다.");
        }*/
//        내가 짠 코드 강의 2회독 소수점이라 어렵다 근데 실행을 해보니 풀렸다.
//        실행을 해보니, 어바웃타임이 2번 출력이 되어서
//        rating<=9가 실행되는 걸 잊고 있었다
//        코드가 무슨 의미인지 확인하면서 작성해보자


        double rating = 7.1;
        if(rating <= 9){
            System.out.println("어바웃타임을 추천합니다.");
        } if (rating <= 8) {
            System.out.println("토이스토리를 추천합니다.");
        }
        if (rating <=7)
        {
            System.out.println("고질라를 추천합니다.");
        }
//정답지
        /*double rating = 9;
        if (rating <= 9) {
            System.out.println("'어바웃타임'을 추천합니다.");
        }
        if (rating <= 8) {
            System.out.println("'토이 스토리'을 추천합니다.");
        }if (rating <= 7) {
            System.out.println("'고질라'을 추천합니다.");
        }

         */


    }
}
