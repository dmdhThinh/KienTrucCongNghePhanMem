package com.example.designpatterns.GiaoHang;

public class CanceledOrder implements OrderState {
    @Override
    public void handleRequest(OrderContext context) {
        System.out.println("Đơn hàng đã bị hủy. Không thể thay đổi trạng thái.");
    }
}
