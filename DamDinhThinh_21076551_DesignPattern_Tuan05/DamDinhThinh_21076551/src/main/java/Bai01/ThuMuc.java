package Bai01;

import java.util.ArrayList;
import java.util.List;

public class ThuMuc extends ThanhPhanHeThong {
    private List<ThanhPhanHeThong> cacThanhPhan = new ArrayList<>();

    public ThuMuc(String ten) {
        super(ten);
    }

    public void themThanhPhan(ThanhPhanHeThong thanhPhan) {
        cacThanhPhan.add(thanhPhan);
    }

    public void xoaThanhPhan(ThanhPhanHeThong thanhPhan) {
        cacThanhPhan.remove(thanhPhan);
    }

    @Override
    public void hienThiThongTin() {
        System.out.println("Thư mục: " + ten);
        for (ThanhPhanHeThong thanhPhan : cacThanhPhan) {
            thanhPhan.hienThiThongTin();
        }
    }
}
