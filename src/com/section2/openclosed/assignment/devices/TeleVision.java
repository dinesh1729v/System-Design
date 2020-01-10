package com.section2.openclosed.assignment.devices;

public class TeleVision extends Device {


    @Override
    public void turnOn() {
        System.out.println("Turningon the Television");
    }

    @Override
    public void turnOff() {
        System.out.println("Turningoff the television");
    }
}
