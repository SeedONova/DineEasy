package com.putubgs.DineEasy.model;

public class Menu {
    private Integer itemId;
    private String name;
    private String description;
    private Double price;
    private Boolean availability;
    
    public Menu(Integer itemId, String name, String description, Double price, Boolean availability){
        this.itemId = itemId;
        this.name = name;
        this.description = description;
        this.price = price;
        this.availability = availability;
    }

    public void setItemId(Integer itemId){
        this.itemId = itemId;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public void setPrice(Double price){
        this.price = price;
    }

    public void setAvailability(Boolean availability){
        this.availability = availability;
    }

    public Integer getItemId(){
        return this.itemId;
    }

    public String getName(){
        return this.name;
    }

    public String getDescription(){
        return this.description;
    }

    public Double getPrice(){
        return this.price;
    }

    public Boolean getAvailability(){
        return this.availability;
    }
}
