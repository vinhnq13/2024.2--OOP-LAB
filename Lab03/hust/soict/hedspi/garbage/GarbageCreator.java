package hust.soict.hedspi.garbage;

import java.io.BufferedReader;
import java.io.FileReader;

public class GarbageCreator {
    public static void main(String[] args) throws Exception {
        String filename = "test.txt"; // Đảm bảo bạn có file dài tên là test.txt

        BufferedReader reader = new BufferedReader(new FileReader(filename));
        String line = null;
        String text = "";

        long start = System.currentTimeMillis();

        while ((line = reader.readLine()) != null) {
            text += line; // tạo rất nhiều đối tượng rác
        }

        reader.close();

        long end = System.currentTimeMillis();
        System.out.println("Time using + operator: " + (end - start) + "ms");
    }
}
