package cau3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReplaceTextInFile {
    public static void main(String[] args) {
        String inputFilePath = "input.txt";
        String outputFilePath = "output.txt";

        try {
            String content = new String(Files.readAllBytes(Paths.get(inputFilePath)));

            String updatedContent = content.replaceAll("Nha Trang", "Vũng Tàu");

            FileWriter writer = new FileWriter(new File(outputFilePath));
            writer.write(updatedContent);
            writer.close();

            System.out.println("Đã thay thế và ghi vào file output.txt thành công.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
