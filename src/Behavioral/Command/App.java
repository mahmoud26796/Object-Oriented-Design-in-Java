package Behavioral.Command;

public class App {
    public static void main(String[] args) {
        // a new Reciver (Device)
        TV tv = new TV();

        Command TurnTvOn = new TurnOnCommand(tv);
        Command adjustVolume = new AdjustVolume(tv);
        Invoker invoker = new Invoker();
        invoker.setCommand(TurnTvOn);
        invoker.Button(); // should execute that the tv is turned on
        invoker.setCommand(adjustVolume);
        invoker.Button(); // should execute that the volume is adjusted

    }
}
