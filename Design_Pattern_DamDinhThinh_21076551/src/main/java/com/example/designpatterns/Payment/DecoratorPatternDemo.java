package com.example.designpatterns.Payment;
import java.util.Scanner;

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Chọn phương thức thanh toán:");
        System.out.println("1 - Thẻ tín dụng");
        System.out.println("2 - PayPal");
        int choice = scanner.nextInt();

        Payment payment;
        if (choice == 1) {
            payment = new CreditCardPayment();
        } else {
            payment = new PayPalPayment();
        }

        System.out.println("Nhập số tiền cần thanh toán:");
        double amount = scanner.nextDouble();

        System.out.println("Có áp dụng giảm giá không? (y/n)");
        if (scanner.next().equalsIgnoreCase("y")) {
            payment = new DiscountPayment(payment);
        }

        System.out.println("Có áp dụng phí xử lý không? (y/n)");
        if (scanner.next().equalsIgnoreCase("y")) {
            payment = new FeePayment(payment);
        }

        payment.pay(amount);
        scanner.close();
    }
}
