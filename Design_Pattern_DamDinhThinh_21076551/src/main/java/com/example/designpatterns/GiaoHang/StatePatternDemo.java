package com.example.designpatterns.GiaoHang;

import java.util.Scanner;

public class StatePatternDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OrderContext order = new OrderContext();
        boolean running = true;

        while (running) {
            System.out.println("\n--- QUẢN LÝ ĐƠN HÀNG ---");
            order.displayStatus();
            System.out.println("Chọn hành động:");
            System.out.println("1 - Chuyển trạng thái tiếp theo");
            System.out.println("2 - Hủy đơn hàng");
            System.out.println("3 - Thoát chương trình");
            System.out.print("Nhập lựa chọn: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    order.processOrder();
                    break;
                case 2:
                    order.cancelOrder();
                    break;
                case 3:
                    System.out.println("Thoát chương trình.");
                    running = false;
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ! Vui lòng nhập lại.");
            }
        }

        scanner.close();
    }
}
