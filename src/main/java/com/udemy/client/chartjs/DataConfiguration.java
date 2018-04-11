package com.udemy.client.chartjs;


import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name="Object", namespace = JsPackage.GLOBAL)
public class DataConfiguration {

    public String[] labels;
    public DataSetConfiguration[] datasets;
}
