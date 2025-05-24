public class GarbageCreator {
    public static void main(String[] args) {
        for (int i = 0; i < 100000; i++) {
            String s = new String("garbage"); // Luôn tạo object mới trên heap
        }

        System.out.println("Created many String objects.");
    }
}
