import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int month = 0, year = 0;
        boolean validInput = false;
        
        while (!validInput) {
            System.out.print("Nhập tháng (1-12): ");
            if (scanner.hasNextInt()) {
                month = scanner.nextInt();
                if (month >= 1 && month <= 12) {
                    validInput = true;
                } else {
                    System.out.println("Tháng không hợp lệ, vui lòng nhập lại.");
                }
            } else {
                System.out.println("Vui lòng nhập số nguyên từ 1 đến 12.");
                scanner.next();
            }
        }
        
        validInput = false;
        while (!validInput) {
            System.out.print("Nhập năm: ");
            if (scanner.hasNextInt()) {
                year = scanner.nextInt();
                if (year >= 0) {
                    validInput = true;
                } else {
                    System.out.println("Năm không hợp lệ, vui lòng nhập lại.");
                }
            } else {
                System.out.println("Vui lòng nhập số nguyên không âm.");
                scanner.next();
            }
        }
        
        int days;
        switch (month) {
            case 4: case 6: case 9: case 11:
                days = 30;
                break;
            case 2:
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    days = 29;
                } else {
                    days = 28;
                }
                break;
            default:
                days = 31;
        }
        
        System.out.println("Tháng " + month + " năm " + year + " có " + days + " ngày.");
        scanner.close();
    }
}