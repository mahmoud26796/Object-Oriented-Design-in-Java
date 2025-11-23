package Behavioral.Command;

public class Conditioner implements Device {
    @Override
    public void turnOff() {
        System.out.println("Air Conditioer is On");

    }

    @Override
    public void turnOn() {
        System.out.println("Air Conditioer is Off");
    }

    public void adjustDgree() {
        System.out.println("Dgree adjusted");
    }
}