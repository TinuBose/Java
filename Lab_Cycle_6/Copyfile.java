package Lab_Cycle_6;
import java.io.*;
public class Copyfile {
    public static void main(String[] args) {
        String sourceFilePath = "C:\\Users\\HP\\Desktop\\source.txt"; // Replace with your source file path
        String destinationFilePath = "destination.txt"; // Replace with your destination file path
        
        try (FileInputStream sourceFileInputStream = new FileInputStream(sourceFilePath);
             FileOutputStream destinationFileOutputStream = new FileOutputStream(destinationFilePath)) {
            
            byte[] buffer = new byte[1024];
            int bytesRead;
            
            while ((bytesRead = sourceFileInputStream.read(buffer)) != -1) {
                destinationFileOutputStream.write(buffer, 0, bytesRead);
            }
            
            System.out.println("File copied successfully.");
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
