public class BaiTap4 {
    public static void main(String[] args) {
        int a = 50;
        int b = 80;

        // 1. Tìm ước chung lớn nhất (UCLN) của a và b bằng thuật toán Euclid
        int x = Math.abs(a);
        int y = Math.abs(b);
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        int ucln = x;

        // 2. Chia cả tử và mẫu cho UCLN để rút gọn
        int tuSoToiGian = a / ucln;
        int mauSoToiGian = b / ucln;

        System.out.println("Phan so toi gian: " + tuSoToiGian + "/" + mauSoToiGian);
    }
}