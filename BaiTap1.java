public class BaiTap1 {
    public static void main(String[] args) {
        int[] sales = {3, 1, 3, 2, 1, 3,3,2,5,1,5,6,7,8,3};

        // Tìm món có số thứ tự lớn nhất để tạo mảng đếm đủ rộng
        int maxMon = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > maxMon) {
                maxMon = sales[i];
            }
        }

        // Bước 1: Tạo mảng đếm và cộng dồn số lần bán
        int[] dem = new int[maxMon + 1];
        for (int i = 0; i < sales.length; i++) {
            int mon = sales[i];
            dem[mon] = dem[mon] + 1; // Thấy món nào thì cộng 1 cho vị trí món đó
        }

        // Bước 2: Tìm số lần bán lớn nhất
        int maxLan = 0;
        for (int i = 0; i < dem.length; i++) {
            if (dem[i] > maxLan) {
                maxLan = dem[i];
            }
        }

        // Bước 3: In ra món bán chạy nhất
        System.out.println("Ket qua:");
        for (int i = 0; i < dem.length; i++) {
            if (dem[i] == maxLan) {
                System.out.println("Mon " + i + " ban chay nhat (" + maxLan + " lan)");
            }
        }
    }
}