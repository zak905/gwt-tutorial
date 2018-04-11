package com.udemy.client.chartjs;


import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name="Object", namespace = JsPackage.GLOBAL)
public class DataSetConfiguration {

    public String label;
    public Number[] data;
    public String[] backgroundColor;
    public Number borderWidth;
}
