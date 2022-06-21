package lab2_CommandInterpreter.lab2_5and6;


import lab2_CommandInterpreter.lab2_5and6.Command;
import lab2_CommandInterpreter.lab2_5and6.ConsoleManager;

public class HelloCommand implements Command {
    private ConsoleManager console;

    public HelloCommand(ConsoleManager console) {
        this.console = console;
    }
    public void getName() {
        System.out.println("hello");
    }
    public void getDescription() {
        System.out.println("выводит сообщение “Hello, World”\n");
    }

    public void execute() {
        console.printHello();
    }

    public void execute(String arg) {

    }
}
