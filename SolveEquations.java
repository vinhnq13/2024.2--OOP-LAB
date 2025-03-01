import java.util.Scanner;

public class SolveEquations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Giải phương trình bậc nhất ax + b = 0
        System.out.println("Giải phương trình bậc nhất ax + b = 0");
        System.out.print("Nhập a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập b: ");
        double b = scanner.nextDouble();
        
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình có vô số nghiệm.");
            } else {
                System.out.println("Phương trình vô nghiệm.");
            }
        } else {
            double x = -b / a;
            System.out.println("Nghiệm của phương trình là x = " + x);
        }
        
        // Giải hệ phương trình bậc nhất hai ẩn
        System.out.println("\nGiải hệ phương trình bậc nhất hai ẩn:");
        System.out.println("a11 * x1 + a12 * x2 = b1");
        System.out.println("a21 * x1 + a22 * x2 = b2");
        
        System.out.print("Nhập a11: ");
        double a11 = scanner.nextDouble();
        System.out.print("Nhập a12: ");
        double a12 = scanner.nextDouble();
        System.out.print("Nhập b1: ");
        double b1 = scanner.nextDouble();
        System.out.print("Nhập a21: ");
        double a21 = scanner.nextDouble();
        System.out.print("Nhập a22: ");
        double a22 = scanner.nextDouble();
        System.out.print("Nhập b2: ");
        double b2 = scanner.nextDouble();
        
        double D = a11 * a22 - a21 * a12;
        double D1 = b1 * a22 - b2 * a12;
        double D2 = a11 * b2 - a21 * b1;
        
        if (D == 0) {
            if (D1 == 0 && D2 == 0) {
                System.out.println("Hệ phương trình có vô số nghiệm.");
            } else {
                System.out.println("Hệ phương trình vô nghiệm.");
            }
        } else {
            double x1 = D1 / D;
            double x2 = D2 / D;
            System.out.println("Nghiệm của hệ là: x1 = " + x1 + ", x2 = " + x2);
        }
        
        // Giải phương trình bậc hai ax^2 + bx + c = 0
        System.out.println("\nGiải phương trình bậc hai ax^2 + bx + c = 0");
        System.out.print("Nhập a: ");
        double a2 = scanner.nextDouble();
        System.out.print("Nhập b: ");
        double b2q = scanner.nextDouble();
        System.out.print("Nhập c: ");
        double c = scanner.nextDouble();
        
        if (a2 == 0) {
            System.out.println("Đây không phải là phương trình bậc hai.");
        } else {
            double delta = b2q * b2q - 4 * a2 * c;
            if (delta < 0) {
                System.out.println("Phương trình vô nghiệm.");
            } else if (delta == 0) {
                double x = -b2q / (2 * a2);
                System.out.println("Phương trình có nghiệm kép x = " + x);
            } else {
                double x1 = (-b2q + Math.sqrt(delta)) / (2 * a2);
                double x2 = (-b2q - Math.sqrt(delta)) / (2 * a2);
                System.out.println("Nghiệm của phương trình là x1 = " + x1 + ", x2 = " + x2);
            }
        }
        
        scanner.close();
    }
}
