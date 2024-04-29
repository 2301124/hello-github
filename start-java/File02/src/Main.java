import java.io.File;
public class Main {
    public static void main(String[] args) {
        String dir = "c:/";
        File file = new File(dir);

        System.out.println("Directory Name :"+ dir);
        System.out.println("last Modifed : " + file.lastModified());
        System.out.println(" Cad Read ? "+ file.canRead());
        System.out.println(" Cad Write ? "+ file.canWrite());
        System.out.println(" Is File ? "+ file.isFile());
        System.out.println(" is directory ? "+ file.isDirectory());
        String[] list = file.list();
        for (int i = 0; i < list.length; i++) {
            File newFile = new File(dir, list[i]);
            if (newFile.isDirectory()){
                System.out.println(list[i] + "는 디렉토리");
            } else {
                System.out.print(list[i] + "는 파일");
                System.out.printf(", Size = %,d Bytes\n", newFile.length());
            }
        }
    }
}