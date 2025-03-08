package com.example.designpatterns.GiaoHang;

public class ShippedOrder implements OrderState {
    @Override
    public void handleRequest(OrderContext context) {
        System.out.println("Đơn hàng đã được giao thành công. Không thể thay đổi trạng thái nữa.");
    }
}
