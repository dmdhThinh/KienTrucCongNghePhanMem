package Bai02;
import java.util.Scanner;

public class DemoBai02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập thông tin cổ phiếu
        System.out.print("Nhập tên cổ phiếu: ");
        String stockName = scanner.nextLine();

        System.out.print("Nhập giá cổ phiếu ban đầu: ");
        double stockPrice = scanner.nextDouble();

        // Tạo đối tượng cổ phiếu
        Stock stock = new Stock(stockName, stockPrice);

        // Thêm nhà đầu tư
        System.out.print("Nhập tên nhà đầu tư đầu tiên: ");
        scanner.nextLine();  // Đọc ký tự \n sau khi nhập số
        String investorName1 = scanner.nextLine();
        Investor investor1 = new ConcreteInvestor(investorName1);
        stock.addInvestor(investor1);

        System.out.print("Nhập tên nhà đầu tư thứ hai: ");
        String investorName2 = scanner.nextLine();
        Investor investor2 = new ConcreteInvestor(investorName2);
        stock.addInvestor(investor2);

        // Thông báo cho nhà đầu tư khi giá thay đổi
        boolean continueChanging = true;
        while (continueChanging) {
            System.out.print("Nhập giá cổ phiếu mới (hoặc nhập -1 để thoát): ");
            double newPrice = scanner.nextDouble();

            if (newPrice == -1) {
                continueChanging = false;
            } else {
                stock.setPrice(newPrice); // Thay đổi giá và thông báo cho nhà đầu tư
            }
        }

        scanner.close();
    }
}

