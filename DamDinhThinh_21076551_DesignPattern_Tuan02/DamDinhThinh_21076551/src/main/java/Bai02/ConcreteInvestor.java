package Bai02;
public class ConcreteInvestor implements Investor {
    private String name;

    public ConcreteInvestor(String name) {
        this.name = name;
    }

    @Override
    public void update(Stock stock) {
        System.out.println("Nhà đầu tư " + name + " nhận thông báo: Cổ phiếu " + stock.getPrice());
    }
}

