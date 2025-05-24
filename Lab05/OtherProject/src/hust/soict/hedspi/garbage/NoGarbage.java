public class NoGarbage {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            sb.append(i); // Duy nhất 1 object StringBuilder
        }

        String result = sb.toString();

        long end = System.currentTimeMillis();
        System.out.println("Time: " + (end - start) + " ms");
    }
}
