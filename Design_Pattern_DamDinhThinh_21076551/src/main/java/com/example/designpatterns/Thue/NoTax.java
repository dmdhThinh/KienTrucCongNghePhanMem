package com.example.designpatterns.Thue;

public class NoTax implements TaxStrategy {
    @Override
    public double calculateTax(double price) {
        return 0; // Không thuế
    }
}
