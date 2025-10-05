import java.io.*;
import java.util.Date;

public class FileStatistics {
    public static void main(String[] args) {
        File file = new File("src/Quote.txt"); // relative path goes here and this if the file object
        File file2 = new File("src/TestFile.txt");
        if (file.exists() && file2.exists() ){
            System.out.println("File name: " + file.getName() + " " + file2.getName());
            System.out.println("File name: " + file.length() + " " + file2.getName());
            System.out.println("Last modified: " + new Date(file.lastModified()));
            System.out.println("Last modified: " + new Date((file2.lastModified())));
        } else {
            System.out.println("File not found");
            System.out.println("Looking for: " + file.getAbsolutePath());
            System.out.println("Looking for: " + file2.getAbsolutePath());
        }
    }
}
