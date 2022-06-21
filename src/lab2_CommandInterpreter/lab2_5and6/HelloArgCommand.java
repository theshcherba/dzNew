package lab2_CommandInterpreter.lab2_5and6;


public class HelloArgCommand implements Command {
    ConsoleManager console;

    public HelloArgCommand(ConsoleManager console) {
        this.console = console;

    }
    public void getName() {
        System.out.println("hello <arg1>");
    }
    public void getDescription() {
        System.out.println("выводит сообщение “Hello, <arg1>”\n");
    }

    public void execute() {
        console.printHelloArg();
    }

    public void execute(String arg) {

    }
}
