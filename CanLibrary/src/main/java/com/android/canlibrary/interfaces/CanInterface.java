package com.android.canlibrary.interfaces;

public class CanInterface {
    static {
        System.loadLibrary("can_interface"); // 加载本地库
    }

    // 本地方法声明：打开CAN1接口
    public native boolean openCan1Interface(String deviceName);
    // 本地方法声明：发送CAN1数据
    public native boolean sendCan1Message(int canId, byte[] data);
    // 本地方法声明：接收CAN1数据
    public native byte[] receiveCan1Message();
    // 本地方法声明：关闭CAN1接口
    public native void closeCan1Interface();
}
