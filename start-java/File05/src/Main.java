import java.io.File;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        String source = ".\\data\\test.txt";
            int hangul = 0;
        File file = new file(source);
        if (file.exists()) {
            FileReader streamReader = new FileReader(file);
            BufferReader bufferREader = new BufferReader(fileReader);
            String line;
            while ((line = bufferREader.readLine()) != null) {
                System.out.println(line);
                for (int i = 0; i < line.length(); i++)
                    if (Character.getType(line.charAt(i)) == 5){
                        hangul++;
                }
            }
            bufferREader.close();
            fileReader.close();
            System.out.println("한글의 수 :" + hangul);
        } else {
            System.out.println(file+ "이 존재하지 않는다");
        }
    }
}