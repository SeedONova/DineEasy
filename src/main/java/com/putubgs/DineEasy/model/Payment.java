package com.putubgs.DineEasy.model;

public class Payment {
    private Integer paymentId;
    private Integer orderId;
    private Double amount;
    private String paymentMethod;
    private String paymentStatus;

    public Payment(Integer paymentId, Integer orderId, Double amount, String paymentMethod, String paymentStatus){
        this.paymentId = paymentId;
        this.orderId = orderId;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
        this.paymentStatus = paymentStatus;
    }

    public void setPaymentId(Integer paymentId){
        this.paymentId = paymentId;
    }

    public void setOrderId(Integer orderId){
        this.orderId = orderId;
    }

    public void setAmount(Double amount){
        this.amount = amount;
    }

    public void setPaymentMethod(String paymentMethod){
        this.paymentMethod = paymentMethod;
    }

    public void setPaymentStatus(String paymentStatus){
        this.paymentStatus = paymentStatus;
    }

    public Integer getPaymentId(){
        return this.paymentId;
    }

    public Integer getOrderId(){
        return this.orderId;
    }

    public Double getAmount(){
        return this.amount;
    }

    public String getPaymentMethod(){
        return this.paymentMethod;
    }

    public String getPaymentStatus(){
        return this.paymentStatus;
    }
}
