package com.section2.openclosed.assignment.user;

import com.section2.openclosed.assignment.devices.SurroundSoundSystem;
import com.section2.openclosed.assignment.devices.TeleVision;
import com.section2.openclosed.assignment.remotes.RemoteControl;

public class Person {
    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl();
        TeleVision tv= new TeleVision();
        remote.connectToDevice(tv);
        remote.turnTheDeviceOn();
        remote.turnTheDeviceOff();

        SurroundSoundSystem surroundSoundSystem = new SurroundSoundSystem();
        remote.connectToDevice(surroundSoundSystem);
        remote.turnTheDeviceOn();
        remote.turnTheDeviceOn();

    }
}
