package lab2_CommandInterpreter.lab2_4;

public class ConsoleManager {
    public void printHello() {
        System.out.print("Hello, world");
    }

    public void printHelloArg() {
        System.out.print("Hello, ");
    }
    public void printRepeat(String arg){
        String [] argsForRepeat = arg.split(" ");
        try{
            int count = Integer.parseInt(argsForRepeat[argsForRepeat.length-1]);
            for (int i = 0; i < count; i++) {
                for (int k = 0; k <argsForRepeat.length-1 ; k++) {
                    System.out.print(argsForRepeat[k] + " ");
                }
                System.out.print("\n");
            }
        }catch (NumberFormatException e){
            System.err.println("Введено не целочисленное значние!");
        }
    }
}