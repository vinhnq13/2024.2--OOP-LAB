public class ConcatenationInLoops {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        String result = "";
        for (int i = 0; i < 10000; i++) {
            result += i; // Mỗi lần lặp tạo 1 đối tượng String mới
        }

        long end = System.currentTimeMillis();
        System.out.println("Time: " + (end - start) + " ms");
    }
}
