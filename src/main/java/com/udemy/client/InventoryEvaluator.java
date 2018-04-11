package com.udemy.client;


import jsinterop.annotations.JsFunction;

import java.util.List;

@JsFunction
public interface InventoryEvaluator {

    void evaluate(List<InventoryItem> items);
}
