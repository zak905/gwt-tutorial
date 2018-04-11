package com.udemy.client.chartjs;

import elemental2.dom.HTMLCanvasElement;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public class Chart {

    public Chart(HTMLCanvasElement canvasElement, ChartConfiguration configuration) {
    }
}
