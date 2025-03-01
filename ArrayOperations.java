import java.util.Arrays;
import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhập số lượng phần tử trong mảng: ");
        int n = scanner.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }
        
        // Sắp xếp mảng
        Arrays.sort(arr);
        System.out.println("Mảng sau khi sắp xếp: " + Arrays.toString(arr));
        
        // Tính tổng và trung bình cộng
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        double average = (double) sum / n;
        
        System.out.println("Tổng của các phần tử trong mảng: " + sum);
        System.out.println("Giá trị trung bình của mảng: " + average);
        
        scanner.close();
    }
}
