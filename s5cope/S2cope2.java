package s5cope;

//<스코프1-지역변수와 스코프> 섹션6 강의1
// 생존 범위가 있는 이유를 알려준다
//다음시간에

public class S2cope2 {
    public static void main(String[] args) {
        int m =10;
        for (int i = 0; i < 2; i++) { // 블록 내부,for문 내
            System.out.println("for m= " + m); //for문 블록 내부에서 외부접근 가능
            System.out.println("for i= " + i);
        } // i 생존 종료

//        System.out.println("main i "+ i);
        System.out.println("main m "+ m);

    }
}
