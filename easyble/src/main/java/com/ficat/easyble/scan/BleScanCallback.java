package com.ficat.easyble.scan;


import android.bluetooth.BluetoothDevice;

public interface BleScanCallback {
    void onLeScan(BluetoothDevice device, int rssi, byte[] scanRecord);

    void onStart(boolean startScanSuccess, String info);

    void onFinish();
}
