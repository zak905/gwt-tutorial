package com.udemy.client;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public class JSON {

    public native static String stringify(Object object);

    public native static Object parse(String json);
}
