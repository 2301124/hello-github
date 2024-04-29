import java.io.File;
import java.io.FileInputStream;



public class Main {
    public static void main(String[] args) {
        String source = " .//Data//Test.txt";
        File file = new File(source);
        if (file.exists()) {
            System.out.printf("File Size : %,d Byte\n", file.length());

            FileInputStream inputStream = new FileInputStream(file);
            byte[] bytes = new byte[3000];
            int count = 0;
            int tot = 0;
            while(count =inputStream.read(bytes)) != EDF);
                tot += count;
            inputStream.close();

        }else{
            System.out.println(file + "이 존재하지 않는다");
        }

    }
}