package Bai01;

public class TapTin extends ThanhPhanHeThong {
    private String noiDung;

    public TapTin(String ten, String noiDung) {
        super(ten);
        this.noiDung = noiDung;
    }

    @Override
    public void hienThiThongTin() {
        System.out.println("Tập tin: " + ten + ", Nội dung: " + noiDung);
    }
}
