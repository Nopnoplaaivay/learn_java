package cau3;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReplaceTextInFile {
    public static void main(String[] args) {
        String inputFilePath = "src/input.txt";
        String outputFilePath = "src/output.txt";

        try {
            BufferedReader content = new BufferedReader( new FileReader(inputFilePath));

            String line;
            while ((line = content.readLine()) != null) {
                // Thay thế từ "Java" thành "Python"
                line = line.replaceAll("Nha Trang", "Vũng Tàu");
                Files.write(Paths.get(outputFilePath), line.getBytes());
            }
            String contentToWrite = "";


            System.out.println("Đã thay thế và ghi vào file output.txt thành công.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
