package com.putubgs.DineEasy.model;

public class OrderDetail {
    private Integer orderDetailId;
    private Integer orderId;
    private Integer itemId;
    private Integer quantity;
    private Double price;

    public OrderDetail(Integer orderDetailId, Integer orderId, Integer itemId, Integer quantity, Double price){
        this.orderDetailId = orderDetailId;
        this.orderId = orderId;
        this.itemId = itemId;
        this.quantity = quantity;
        this.price = price;
    }

    public void setOrderDetailId(Integer orderDetailId){
        this.orderDetailId = orderDetailId;
    }

    public void setOrderId(Integer orderId){
        this.orderId = orderId;
    }

    public void setItemId(Integer itemId){
        this.itemId = itemId;
    }

    public void setQuantity(Integer quantity){
        this.quantity = quantity;
    }

    public void setPrice(Double price){
        this.price = price;
    }

    public Integer getOrderDetailId(){
        return this.orderDetailId;
    }

    public Integer getOrderId(){
        return this.orderId;
    }

    public Integer getItemId(){
        return this.itemId;
    }

    public Integer getQuantity(){
        return this.quantity;
    }

    public Double getPrice(){
        return this.price;
    }
}
