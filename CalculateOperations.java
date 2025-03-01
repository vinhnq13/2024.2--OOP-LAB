import java.util.Scanner;

public class CalculateOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Nhập hai số từ bàn phím
        System.out.print("Nhập số thứ nhất: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Nhập số thứ hai: ");
        double num2 = scanner.nextDouble();
        
        // Tính toán các phép toán
        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        
        // Kiểm tra nếu số chia là 0
        Double quotient = (num2 != 0) ? (num1 / num2) : null;
        
        // Hiển thị kết quả
        System.out.println("Tổng: " + sum);
        System.out.println("Hiệu: " + difference);
        System.out.println("Tích: " + product);
        
        if (quotient != null) {
            System.out.println("Thương: " + quotient);
        } else {
            System.out.println("Không thể chia cho 0.");
        }
        
        scanner.close();
    }
}
