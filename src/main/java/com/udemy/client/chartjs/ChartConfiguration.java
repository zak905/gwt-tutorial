package com.udemy.client.chartjs;


import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name="Object", namespace = JsPackage.GLOBAL)
public class ChartConfiguration {

    public String type;

    public DataConfiguration data;

}
