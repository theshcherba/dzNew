package lab2_4;

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
