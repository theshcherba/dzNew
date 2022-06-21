package lab2_CommandInterpreter.lab2_5and6.lab2_4;

public class RepeatCommand implements Command{
    private ConsoleManager console;
    private String arg;

    public RepeatCommand(ConsoleManager console, String arg) {
        this.console = console;
        this.arg = arg;
    }

    public void execute() {

    }

    public void execute(String arg) {
        console.printRepeat(arg);
    }
}
