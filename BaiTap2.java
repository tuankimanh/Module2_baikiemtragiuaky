import java.util.Scanner;

public class BaiTap2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap chieu cao h: ");
        int h = sc.nextInt();

        // Duyệt từng dòng từ 1 đến h
        for (int i = 1; i <= h; i++) {

            // 1. In khoảng trắng đầu dòng
            for (int j = 1; j <= h - i; j++) {
                System.out.print(" ");
            }

            // 2. In các dấu sao (*)
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            // 3. Xuống dòng sau khi in xong 1 hàng
            System.out.println();
        }

        sc.close();
    }
}
