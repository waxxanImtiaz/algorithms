package work;

public class Invoker {
    public static void main(String[] args) {

        Invoker invoker = new Invoker();
        ActionListenerInstaller.processAnnotations(invoker);

        invoker.yellow();
    }
    @ActionListenerFor(source = "yellow")
    public void yellow(){
        System.out.println("GO");
    }

}
