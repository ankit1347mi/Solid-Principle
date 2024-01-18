package com.tyss.solidprinciple.liskovprinciple;

import lombok.Data;
import org.apache.catalina.Engine;

@Data
public class DeviceWithEngine extends TransportVechicle {
    private Engine engine;

    public void startEngine() {
        System.out.println("vehicle is speeding");
    }
}
