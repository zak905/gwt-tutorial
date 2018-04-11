package com.udemy.client;


import jsinterop.annotations.*;

@JsType(namespace = JsPackage.GLOBAL)
public class InventoryItem {


    public String id;

    @JsIgnore
   public  int quantity;

    public double unitPrice;


    public InventoryItem(String id, int quantity, double unitPrice) {
        this.id = id;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public String getId() {
        return id;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    @JsIgnore
    public double getTotalItemValue() {
        return unitPrice * quantity;
    }
}
