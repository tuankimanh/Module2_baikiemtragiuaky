public class BaiTap3 {
    public static void main(String[] args) {
        String cau = "hoc lap trinh tai CodeGym de di phongvan that tot";

        // Tách câu thành mảng các từ dựa vào dấu cách
        String[] dsTu = cau.split(" ");
        int soTu = dsTu.length;

        // Tìm từ dài nhất đầu tiên
        String tuDaiNhat = dsTu[0];
        for (int i = 1; i < soTu; i++) {
            if (dsTu[i].length() > tuDaiNhat.length()) {
                tuDaiNhat = dsTu[i];
            }
        }

        System.out.println(soTu + " tu, tu dai nhat: \"" + tuDaiNhat + "\"");
    }
}