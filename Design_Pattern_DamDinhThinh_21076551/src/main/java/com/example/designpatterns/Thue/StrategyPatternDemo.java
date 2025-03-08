package com.example.designpatterns.Thue;
import java.util.Scanner;

public class StrategyPatternDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập tên sản phẩm: ");
        String name = scanner.nextLine();

        System.out.print("Nhập giá sản phẩm: ");
        double price = scanner.nextDouble();

        System.out.println("Chọn loại thuế:");
        System.out.println("1 - VAT (10%)");
        System.out.println("2 - Luxury Tax (20%)");
        System.out.println("3 - No Tax (0%)");
        int choice = scanner.nextInt();

        TaxStrategy taxStrategy;
        switch (choice) {
            case 1: taxStrategy = new VATTax(); break;
            case 2: taxStrategy = new LuxuryTax(); break;
            case 3: taxStrategy = new NoTax(); break;
            default:
                System.out.println("Lựa chọn không hợp lệ! Áp dụng No Tax.");
                taxStrategy = new NoTax();
        }

        Product product = new Product(name, price, taxStrategy);
        product.displayPrice();

        scanner.close();
    }
}
