package Behavioral.Command;

class TurnOffCommand implements Command {
    private Device device;

    TurnOffCommand(Device device) {
        this.device = device;
    }

    @Override
    public void execute() {
        this.device.turnOff();
    }
}

public class TurnOnCommand implements Command {
    private Device device;

    TurnOnCommand(Device device) {
        this.device = device;
    }

    @Override
    public void execute() {
        this.device.turnOn();

    }
}

class AdjustDegreeCommand implements Command {
    Conditioner conditioner;

    AdjustDegreeCommand(Conditioner conditioner) {
        this.conditioner = conditioner;
    }

    @Override
    public void execute() {
        this.conditioner.adjustDgree();
    }
}