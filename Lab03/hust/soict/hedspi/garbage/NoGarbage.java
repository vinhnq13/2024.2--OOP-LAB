package hust.soict.hedspi.garbage;

import java.io.BufferedReader;
import java.io.FileReader;

public class NoGarbage {
    public static void main(String[] args) throws Exception {
        String filename = "test.txt"; // Đảm bảo bạn có file dài tên là test.txt

        BufferedReader reader = new BufferedReader(new FileReader(filename));
        String line = null;
        StringBuffer buffer = new StringBuffer();

        long start = System.currentTimeMillis();

        while ((line = reader.readLine()) != null) {
            buffer.append(line); // dùng StringBuffer để tiết kiệm bộ nhớ
        }

        reader.close();

        long end = System.currentTimeMillis();
        System.out.println("Time using StringBuffer: " + (end - start) + "ms");
    }
}
