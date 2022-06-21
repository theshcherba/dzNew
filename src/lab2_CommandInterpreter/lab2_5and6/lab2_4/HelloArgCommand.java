package lab2_CommandInterpreter.lab2_5and6.lab2_4;

public class HelloArgCommand implements Command{
    ConsoleManager console;

    public HelloArgCommand(ConsoleManager console) {
        this.console = console;
    }

    public void execute() {
        console.printHelloArg();
    }

    public void execute(String arg) {

    }
}
