package com.udemy.client;


import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "localStorage", namespace = JsPackage.GLOBAL)
public class LocalStorage {

    public native static void setItem(String key, String value);

    public native static String getItem(String key);

    public native static void removeItem(String key);

    @JsOverlay
    public final static boolean isPresent(String itemKey) {
        if(getItem(itemKey) == null)
            return false;

        return true;
    }

}
