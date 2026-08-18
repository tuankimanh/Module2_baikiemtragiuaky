public class BaiTap5 {

    public static void main(String[] args) {
        int[] arr = {1, 4, 7, 9, 12,15,20,6};
        int x = 12;

        int left = 0;
        int right = arr.length - 1;
        int viTri = -1; // -1 nghĩa là chưa tìm thấy

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == x) {
                viTri = mid + 1; // +1 để tính vị trí bắt đầu từ 1
                break;
            }

            if (arr[mid] < x) {
                left = mid + 1; // Tìm ở nửa bên phải
            } else {
                right = mid - 1; // Tìm ở nửa bên trái
            }
        }

        if (viTri != -1) {
            System.out.println("Vi tri " + viTri);
        } else {
            System.out.println("Khong tim thay");
        }
    }
}