package Behavioral.Command;

public class AdjustVolume implements Command {
    TV tv;

    AdjustVolume(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        this.tv.adjustVolume();
    }
}