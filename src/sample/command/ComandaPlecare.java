package sample.command;

public class ComandaPlecare implements ICommand {
    IReceiver receiver;


    public ComandaPlecare(IReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void executa() {
        receiver.pornesteMotorul();
        receiver.dezactiveazaFranaDeMana();
        receiver.introduInViteze();
        receiver.porneste();
    }
}
