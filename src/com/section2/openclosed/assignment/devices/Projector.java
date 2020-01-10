package com.section2.openclosed.assignment.devices;

public class Projector extends  Device{


    @Override
    public void turnOn() {
        System.out.println("TurningOn the Projector");
    }

    @Override
    public void turnOff() {
        System.out.println("TurningOff the Projector");
    }
}
