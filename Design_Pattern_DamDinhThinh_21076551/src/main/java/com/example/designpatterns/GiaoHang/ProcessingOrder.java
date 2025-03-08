package com.example.designpatterns.GiaoHang;

public class ProcessingOrder implements OrderState {
    @Override
    public void handleRequest(OrderContext context) {
        System.out.println("Đơn hàng đang chuyển sang trạng thái: Đã giao.");
        context.setState(new ShippedOrder());
    }
}
