package lab2_5and6;


public class CommandManager {
    Command hello;
    Command helloArg;
    Command repeat;
    Command help;

    public CommandManager(Command hello, Command helloArg, Command repeat, Command help){
        this.hello = hello;
        this.helloArg = helloArg;
        this.repeat = repeat;
        this.help = help;
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
    public void setHelp(){
        help.execute();
    }
}
