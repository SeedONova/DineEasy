package com.putubgs.DineEasy.model;

public class Inventory {
    private Integer itemId;
    private Integer stockLevel;

    public Inventory(Integer itemId, Integer stockLevel){
        this.itemId = itemId;
        this.stockLevel = stockLevel;
    }

    public void setItemId(Integer itemId){
        this.itemId = itemId;
    }

    public void setStockLevel(Integer stockLevel){
        this.stockLevel = stockLevel;
    }

    public Integer getItemId(){
        return this.itemId;
    }

    public Integer getStockLevel(){
        return this.stockLevel;
    }
}
