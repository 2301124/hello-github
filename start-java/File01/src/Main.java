import javax.swing.filechooser.FileSystemView;

public class Main {
    public static void main(String[] args) {
        FileSystemView fileSystemView = FileSystemView.getFileSystemView();
        File[] failes = file.listRoots();
        if (files != null && files.length > 0){
            for (int i = 0; i < files.length; i++){
                System.out.println("Drive Letter :" + files[i]);
                System.outprintln("\tType :" +
                        fileSystemView.getSystemTypeDescription(files[i]));
                System.out.println("\tTotal Space : " + files[i].getTotalSpace());
                System.out.println("\tFree Space: %,d Bytes\n", files[i].getFreeSpace[]);
            }
        }
    System.out.println("Hello world!");
    }
}