package variable;
// 변수 타입2
public class Var8 {
    public static void main(String[] args){
        byte b = 127; // -128 ~ 127
        short s = 32767; // -32,768 ~ 32,767
        int i = 2147483647; // -2,147,483,648 ~ 2,147,483,647 (약 20억)

//  9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807
        long l = 9223372036854775807L;

//      숫자가 클수록 메모리를 많이 차지한다

        float f = 10.0f;
        double d = 10.0; //double  더 큰 실수의 범위를 사용 float 보다

    }
}
