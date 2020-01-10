package com.section2.openclosed.assignment.remotes;

import com.section2.openclosed.assignment.devices.Device;

public class RemoteControl {

    private Device device = null;

    public void connectToDevice(Device device)
    {
        this.device = device;
        System.out.println("Connected to "+device);
    }

    public void turnTheDeviceOn()
    {
        device.turnOn();
    }

    public void turnTheDeviceOff()
    {
        device.turnOff();
    }
}
