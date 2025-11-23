package Behavioral.Command;

public class TV implements Device {
    @Override
    public void turnOff() {
        System.out.println("T.V is Off");

    }

    @Override
    public void turnOn() {
        System.out.println("T.V is On");

    }

    public void adjustVolume() {
        System.out.println("Volume adjusted");
    }
}