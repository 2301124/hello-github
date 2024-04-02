package c5a1sting;

// <형변환1 -자동형변환> 섹션6 강의3
// 작은 범위에서 큰 범위로는 당연히 값을 넣을 수 있다
// 예 int -> long -> double
// 큰 범위에서 작은 범위로는 값을 넣으면 문제가 발생한다
// 소수점 버림
// 오버플로우: 큰 숫자를 작은 그릇에 넣으면 나머지 값들이 잘리게 되는 문제

// 작은 범위에서 큰 범위로 대입은 허용한다

// 작은 범위에서 큰 범위에 값을 대입하는 다음 코드를 실행하면 특별한 문제없이 잘 수행된다

// 자바는 기본적으로 같은 타입에 값을 대입할 수 있다
// 그런데 다른 타입에 값을 대입하면 어떻게 될까?
// 작은 범위에서 큰 범위로의 대입은 허용한다

//자동 형변환
// 하지만 결국 대입하는 형(타입)을 맞추어야 하기 때문에 개념적으로는 다음과 같이 동작한다

// int -> double 으로 넣으면 데이터 타입이 바뀐다
// 작은 범위에서 큰 범위로 넣더라도 자바는 같은 타입에 값을 대입할 수 있다
// 작은 범위에서 큰 범위로 넣으면 자바가 예외적으로 자동형변환을 내부적으로 수행한다
// int -> double 으로 넣으면 int를 강제로 double로 바꾼다
// int의 값을 꺼내서 만약 10이면 double로 바꾼다
// 묵시적 형 변환이라고도 한다



public class C1asting1 {
    public static void main(String[] args) {
        int intvalue = 10;
        long longvalue;
        double doublevalue;

        longvalue = intvalue; // int -> long
        System.out.println("longvalue = " + longvalue);

        doublevalue = intvalue; // int -> double
        System.out.println("doublevalue = " + doublevalue);

        doublevalue = 20L; // long -> double
        System.out.println("doublevalue2 = " + doublevalue);
    }
}
