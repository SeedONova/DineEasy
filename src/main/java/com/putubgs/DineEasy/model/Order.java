package com.putubgs.DineEasy.model;

public class Order {
    private Integer orderId;
    private Integer userId;
    private Integer tableNumber;
    private String status;
    private Double totalPrice;

    public Order(Integer orderId, Integer userId, Integer tableNumber, String status, Double totalPrice){
        this.orderId = orderId;
        this.userId = userId;
        this.tableNumber = tableNumber;
        this.status = status;
        this.totalPrice = totalPrice;
    }

    public void setOrderId(Integer orderId){
        this.orderId = orderId;
    }

    public void setUserId(Integer userId){
        this.userId = userId;
    }

    public void setTableNumber(Integer tableNumber){
        this.tableNumber = tableNumber;
    }

    public void setStatus(String status){
        this.status = status;
    }

    public void setTotalPrice(Double totalPrice){
        this.totalPrice = totalPrice;
    }

    public Integer getOrderId(){
        return this.orderId;
    }

    public Integer getUserId(){
        return this.userId;
    }

    public Integer getTableNumber(){
        return this.tableNumber;
    }

    public String getStatus(){
        return this.status;
    }

    public Double getTotalPrice(){
        return this.totalPrice;
    }
}
