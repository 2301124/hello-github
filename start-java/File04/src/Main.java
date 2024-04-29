import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String source = "c:\\sample\\test\\";
        String filename = "홍길동.txt";

        File dir = new File(source);
        if (dir.exists()) {
            System.out.println(source + "소스 디렉토리가 존재합니다");
        } else {
            if (dir.mkdirs()) {
                System.out.println(source + "소스 디렉토리가 성공");
            }else{
                System.out.println(source + "소스 디렉토리가 실패");
            }
        }
        File file =new File(source+ filename);
        if (file.exists()) {
            System.out.println(file + "이 존재합니다");

        }else {
            if (file.createNewFile()) {
                System.out.println(file + "파일 생성 성공");

            }
            System.out.println(file + "파일 생성 실패");
        }



    }
}