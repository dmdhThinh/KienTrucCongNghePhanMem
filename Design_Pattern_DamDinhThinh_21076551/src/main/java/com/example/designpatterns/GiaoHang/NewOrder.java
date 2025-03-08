package com.example.designpatterns.GiaoHang;

public class NewOrder implements OrderState {
    @Override
    public void handleRequest(OrderContext context) {
        System.out.println("Đơn hàng đang chuyển sang trạng thái: Đang xử lý.");
        context.setState(new ProcessingOrder());
    }
}
