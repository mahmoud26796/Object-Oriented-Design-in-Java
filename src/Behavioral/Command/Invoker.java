package Behavioral.Command;

public class Invoker {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void Button() {
        this.command.execute();
    }
}
