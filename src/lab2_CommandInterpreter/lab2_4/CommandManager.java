package lab2_CommandInterpreter.lab2_4;

public class CommandManager {
    Command hello;
    Command helloArg;
    Command repeat;

    public CommandManager(Command hello, Command helloArg, Command repeat){
        this.hello = hello;
        this.helloArg = helloArg;
        this.repeat = repeat;
    }
    public  void setHello(){
        hello.execute();
    }
    public void setHelloArg(){
        helloArg.execute();
    }
    public void setRepeat(String arg){
        repeat.execute(arg);
    }
}
