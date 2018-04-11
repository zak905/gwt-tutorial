package com.udemy.client;


import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

import java.util.ArrayList;
import java.util.List;

@JsType(namespace = JsPackage.GLOBAL)
public class Inventory {

    public List<InventoryItem> inventoryItems;

    public Inventory() {
        this.inventoryItems = new ArrayList<>();
    }

    public void addItem(InventoryItem item){
        inventoryItems.add(item);
    }

    public void evaluate(InventoryEvaluator evaluator) {
        evaluator.evaluate(this.inventoryItems);
    }
}
