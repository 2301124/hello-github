package operator;

// <문자열 비교> 섹션3 강의5
// 단축키 ctrl + d 라인을 복사
// 문장 뒤에 마침을 표시하는 단축키 ctrl + shift + enter






public class Comp2 {
    public static void main(String[] args) {
        String str1 = "문자열1";
        String str2 = "문자열2";

        boolean result1 = "hello" .equals("hello"); //문자열 리터럴 비교
        boolean result2 = str1 .equals("문자열1"); //문자열 변수와 리터럴 비교
        //str1 변수에 들어가 있는게 문자열1과 같은가
        boolean result3 = str1.equals(str2); // 문자열 변수 비교

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);


    }
}
