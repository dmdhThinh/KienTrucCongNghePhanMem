package Bai01;

public class DemoBai01 {
    public static void main(String[] args) {
        ThanhPhanHeThong tapTin1 = new TapTin("Tập tin 1", "Dữ liệu Tập tin 1");
        ThanhPhanHeThong tapTin2 = new TapTin("Tập tin 2", "Dữ liệu Tập tin 2");

        ThuMuc thuMucCon = new ThuMuc("Thư mục con");
        ThanhPhanHeThong tapTin3 = new TapTin("Tập tin 3", "Dữ liệu Tập tin 3");

        thuMucCon.themThanhPhan(tapTin3);

        ThuMuc thuMucGoc = new ThuMuc("Thư mục gốc");
        thuMucGoc.themThanhPhan(tapTin1);
        thuMucGoc.themThanhPhan(tapTin2);
        thuMucGoc.themThanhPhan(thuMucCon);

        thuMucGoc.hienThiThongTin();
    }
}
