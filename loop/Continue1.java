package loop;

//<break,continue> 섹션5 강의5
// 문제1부터 5까지 숫자를 출력하는데, 숫자가 3일 때 출력을 건너뛰어야 한다.
//내 풀이 while(true){if()}



public class Continue1 {
    public static void main(String[] args) {
        int i =1;
        while (i<=5) {
            if(i==3) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;

        }
    }
}
