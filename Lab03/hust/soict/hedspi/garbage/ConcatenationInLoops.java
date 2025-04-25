package hust.soict.hedspi.garbage;

public class ConcatenationInLoops {
    public static void main(String[] args) {
        long start, end;

        // Using "+" operator (inefficient)
        String s = "";
        start = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            s += "a";
        }
        end = System.currentTimeMillis();
        System.out.println("Time with + operator: " + (end - start) + "ms");

        // Using StringBuffer (efficient)
        StringBuffer sb = new StringBuffer();
        start = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            sb.append("a");
        }
        end = System.currentTimeMillis();
        System.out.println("Time with StringBuffer: " + (end - start) + "ms");

        // Using StringBuilder (most efficient in single-thread)
        StringBuilder sbuilder = new StringBuilder();
        start = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            sbuilder.append("a");
        }
        end = System.currentTimeMillis();
        System.out.println("Time with StringBuilder: " + (end - start) + "ms");
    }
}
