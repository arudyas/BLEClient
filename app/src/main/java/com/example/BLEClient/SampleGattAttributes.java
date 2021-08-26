package com.example.BLEClient;

import java.util.HashMap;

public class SampleGattAttributes {
    private static HashMap<String, String> attributes = new HashMap();
    public static String HEART_RATE_MEASUREMENT = "6E400003-B5A3-F393-E0A9-E50E24DCCA9E";
    public static String CLIENT_CHARACTERISTIC_CONFIG = "00002902-0000-1000-8000-00805f9b34fb";

    static {
        // Sample Services.
        attributes.put("6E400001-B5A3-F393-E0A9-E50E24DCCA9E", "Heart Rate service");
        // Sample Characteristics.
        attributes.put(HEART_RATE_MEASUREMENT, "Heart Rate characteristic");
    }

    public static boolean contains(String uuid) {
        return attributes.containsKey(uuid);
    }

    public static String lookup(String uuid, String defaultName) {
        String name = attributes.get(uuid);
        return name == null ? defaultName : name;
    }
}