package com.example.designpatterns.Payment;

public class DiscountPayment extends PaymentDecorator {
    public DiscountPayment(Payment decoratedPayment) {
        super(decoratedPayment);
    }

    @Override
    public void pay(double amount) {
        double discountedAmount = amount * 0.9; // Giảm 10%
        System.out.println("Áp dụng giảm giá 10%.");
        super.pay(discountedAmount);
    }
}
