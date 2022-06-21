package lab2_CommandInterpreter.lab2_5and6;


public class RepeatCommand implements Command {
    private ConsoleManager console;
    private String arg;

    public RepeatCommand(ConsoleManager console, String arg) {
        this.console = console;
        this.arg = arg;
    }
    public void getName() {
        System.out.println("repeat <arg1> <arg2>");
    }
    public void getDescription() {
        System.out.println("выводит <arg1> <arg2> раз");
    }

    public void execute() {

    }

    public void execute(String arg) {
        console.printRepeat(arg);
    }
}
