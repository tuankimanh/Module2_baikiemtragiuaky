import java.util.Scanner;

public class BaiTap6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so nguyên duong n: ");
        int n = sc.nextInt();

        int temp = n;

        // 1. Tìm lũy thừa lớn nhất của 2 <= n (Ví dụ: n = 13 thì mu2 = 8)
        int mu2 = 1;
        while (mu2 * 2 <= temp) {
            mu2 = mu2 * 2;
        }

        String nhiPhan = "";

        // 2. Xét từng lũy thừa giảm dần
        while (mu2 > 0) {
            if (temp >= mu2) {
                nhiPhan = nhiPhan + "1"; // Bật bit 1
                temp = temp - mu2;       // Trừ bớt giá trị
            } else {
                nhiPhan = nhiPhan + "0"; // Bật bit 0
            }
            mu2 = mu2 / 2;               // Giảm lũy thừa xuống một nửa
        }

        System.out.println("n = " + n + " -> " + nhiPhan);

        sc.close();
    }
}