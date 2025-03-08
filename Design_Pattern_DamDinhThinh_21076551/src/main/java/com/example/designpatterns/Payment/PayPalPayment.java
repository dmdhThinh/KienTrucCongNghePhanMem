package com.example.designpatterns.Payment;

public class PayPalPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Thanh toán " + amount + " qua PayPal.");
    }
}
