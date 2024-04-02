package cond;

// <switch> 섹션4 강의4
// 자바 14 새로운 switch문
// 스위치문은 if문 보다 조금 덜 복잡한 것 같지만,
//그래도 코드가 기대보다 깔끔하게 나오지 않는다
//이런 문제를 해결하고자 자바 14부터는 새로운 switch문이 정식 도입되었다
// switch3.java 파일의 코드를 새로운 switch 문으로 작성
// 조건식의 값이 case와 같으면 화살표로 수행을 하고 coupon 변수에 대입한다
// 새로운 switch문은 더 많은 내용을 담고 있다
//지금 이해하기 어려운 내용들이 있으므로,자세한 내용은 별도로 다룬다
//



public class Switch4 {
    public static void main(String[] args){
        int grade = 2;
        int coupon = switch (grade) {
            case 1 -> 1000;
            case 2 -> 2000;
            case 3 -> 3000;
            default -> 500;
        };
        System.out.println("발급 받은 쿠폰 " + coupon);

    }
}
