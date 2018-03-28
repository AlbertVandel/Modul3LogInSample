/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FunctionLayer.entity;

/**
 *
 * @author alber
 */
public class Order {
    private int orderId;
    private int length;
    private int width;
    private int height;
    private int userId;

    public Order(int orderId, int length, int width, int height, int userId) {
        this.orderId = orderId;
        this.length = length;
        this.width = width;
        this.height = height;
        this.userId = userId;
    }
    
    public Order(int length, int width, int height, int userId) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.userId = userId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Order{" + "orderId=" + orderId + ", length=" + length + ", width=" + width + ", height=" + height + ", userId=" + userId + '}';
    }
    
    
}
