package lab2_CommandInterpreter.lab2_5and6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String[] userInput = text.split(" ", 2);

        ConsoleManager console = new ConsoleManager();
        boolean errorExist = false;
        String arg = null;
            try {
                arg = userInput[1];
            } catch (ArrayIndexOutOfBoundsException e) {
                errorExist = true;
            }
            CommandManager cm = new CommandManager(new HelloCommand(console), new HelloArgCommand(console), new RepeatCommand(console,arg), new HelpCommand(console));
            if (userInput[0].equals("hello") && errorExist ) {
                cm.setHello();
            } else if (userInput[0].equals("hello") && !errorExist ){
                cm.setHelloArg();
                System.out.println(arg);
            }
            if (userInput[0].equals("repeat") && !errorExist) {

                cm.setRepeat(arg);
            }
            if (userInput[0].equals("help") && !errorExist) {

            }
                cm.setHelp();

        }
}
