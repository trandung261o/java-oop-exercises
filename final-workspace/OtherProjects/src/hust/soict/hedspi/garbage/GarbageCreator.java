package hust.soict.hedspi.garbage;

import java.nio.file.Files;
import java.nio.file.Paths;

public class GarbageCreator {

    public static void main(String[] args) {
        String filename = "C:\\Users\\LENOVO\\Desktop\\test.txt"; // test.exe is the name or path to an executable file
        byte[] inputBytes = {0};
        long startTime, endTime;
        
        try {
        inputBytes = Files.readAllBytes(Paths.get(filename));
        startTime = System.currentTimeMillis();

//        String outputString = "";
//        for (byte b : inputBytes) {
//            outputString += (char) b;
//        }

        StringBuilder outputStringBuilder = new StringBuilder();
        for (byte b : inputBytes) {
        	outputStringBuilder.append((char)b);
        }
        
        endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
        } catch (Exception e) {
        	System.out.println("Loi");
        }
    }
}