package loop;
// i =1, endNum = 3
// endNum을 쓸 수가 없다.
// endNum가 10이라면 10번 더해야 한다. -> 코드를 총 10번 반복
// i=1,endNum = 3에서 i=1,endNum=10와 같이 변경하면 코드를 10번 반복해야 한다. 그래서 같은 코드를 더 많이 추가한다.
// 코드가 실행되는 횟수를 유연하게 바꿔야 한다.
//이 때 while문을 사용
//while문을 사용하면 원하는 횟수 만큼 같은 코드를 반복 실행.
public class While2_3 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        int endNum = 3;

        while(i <= endNum){
            sum = sum + i;
            System.out.println("i="+ i + " sum3 = " + sum);
            i++;
        }
    }
}
