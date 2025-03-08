package com.example.designpatterns.GiaoHang;

public class OrderContext {
    private OrderState state;

    public OrderContext() {
        this.state = new NewOrder(); // Mặc định trạng thái ban đầu là "Mới tạo"
    }

    public void setState(OrderState state) {
        this.state = state;
    }

    public OrderState getState() {
        return state;
    }

    public void processOrder() {
        state.handleRequest(this);
    }

    public void cancelOrder() {
        System.out.println("Đơn hàng bị hủy.");
        setState(new CanceledOrder());
    }

    public void displayStatus() {
        System.out.println("Trạng thái hiện tại: " + state.getClass().getSimpleName());
    }
}
