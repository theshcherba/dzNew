package lab2_CommandInterpreter.lab2_5and6;

public class HelpCommand implements Command {
    private ConsoleManager console;

    public HelpCommand(ConsoleManager console) {
        this.console = console;
    }
    public void getName() {
        System.out.println("help");
    }
    public void getDescription() {
        System.out.println("выводит справку по доступным командам");
    }


    public void execute() {

    }

    public void execute(String arg) {
        console.printHelp();

    }
}
