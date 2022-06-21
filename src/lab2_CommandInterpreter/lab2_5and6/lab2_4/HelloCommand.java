package lab2_CommandInterpreter.lab2_5and6.lab2_4;

public class HelloCommand implements Command {
    private ConsoleManager console;

    public HelloCommand(ConsoleManager console) {
        this.console = console;
    }

    public void execute() {
        console.printHello();
    }

    public void execute(String arg) {

    }
}
