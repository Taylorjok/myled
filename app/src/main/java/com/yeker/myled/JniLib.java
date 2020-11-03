package com.yeker.myled;

public class JniLib {
    static {
        System.loadLibrary("MyLed");
    }
    public native int led_open();
    public native int led_close();
    public native int ledIoctl(int num);

}
