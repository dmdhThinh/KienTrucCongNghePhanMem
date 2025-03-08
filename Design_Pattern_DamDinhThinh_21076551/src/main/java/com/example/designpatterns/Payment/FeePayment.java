package com.example.designpatterns.Payment;

public class FeePayment extends PaymentDecorator {
    public FeePayment(Payment decoratedPayment) {
        super(decoratedPayment);
    }

    @Override
    public void pay(double amount) {
        double feeAmount = amount + 5.0; // Phí xử lý cố định $5
        System.out.println("Áp dụng phí xử lý $5.");
        super.pay(feeAmount);
    }
}
