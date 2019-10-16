package sample.command;


public class ComandaParcare implements ICommand {

    IReceiver receiver;

    public ComandaParcare(IReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void executa() {
        receiver.activareSenzoriParcare();
        receiver.detectareLoc();
        receiver.centrarePeLoc();
        receiver.ocupareLoc();
        receiver.oprireMotor();
    }
}
