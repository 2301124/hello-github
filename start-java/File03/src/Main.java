import java.io.File;
public class Main {
    public static void main(String[] args) {
      String dir = "c:\\sample1\\test";

        File file = new File(dir);
        if (file.exists()) {
            System.out.println(dir + "이미 존재 합니다");
            if (file.renameTo(new File(des))) {
                System.out.println(dir + "이 삭제 되었습니다");
            } else {
                System.out.println(dir + "이 삭제 되지 않았습니다");
            }
        }else{
            if (file.mkdirs()){
                System.out.println(dir + "이 생성 성공");
            }else{
                System.out.println(dir + "이 생성 실패");
            }

        }
    }
}