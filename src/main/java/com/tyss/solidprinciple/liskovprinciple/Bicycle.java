package com.tyss.solidprinciple.liskovprinciple;

public class Bicycle extends DeviceWithoutEngine {
    @Override
    public void startMoving() {
        System.out.println("Bicycle start moving");
    }
}

class Car extends DeviceWithEngine {
    @Override
    public void startEngine() {
        System.out.println("Car start speeding");
    }
}
