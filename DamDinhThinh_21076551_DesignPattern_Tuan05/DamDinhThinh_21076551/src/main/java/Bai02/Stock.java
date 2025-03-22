package Bai02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Subject: Cổ phiếu
public class Stock {
    private String name;
    private double price;
    private List<Investor> investors = new ArrayList<>();

    public Stock(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Thêm nhà đầu tư
    public void addInvestor(Investor investor) {
        investors.add(investor);
    }

    // Xóa nhà đầu tư
    public void removeInvestor(Investor investor) {
        investors.remove(investor);
    }

    // Cập nhật giá cổ phiếu và thông báo cho các nhà đầu tư
    public void setPrice(double price) {
        this.price = price;
        notifyInvestors();
    }

    public double getPrice() {
        return price;
    }

    private void notifyInvestors() {
        for (Investor investor : investors) {
            investor.update(this);
        }
    }
}
