import java.util.Scanner;

public class InputFromKeyboard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhập tên của bạn: ");
        String name = scanner.nextLine();
        
        System.out.print("Nhập tuổi của bạn: ");
        int age = scanner.nextInt();
        
        System.out.print("Nhập chiều cao của bạn (m): ");
        double height = scanner.nextDouble();
        
        System.out.println("\nThông tin bạn vừa nhập:");
        System.out.println("Tên: " + name);
        System.out.println("Tuổi: " + age);
        System.out.println("Chiều cao: " + height + "m");
        
        scanner.close();
    }
}
