package sample.command;

public interface IReceiver {
    // Pentru executa plecarea
    void pornesteMotorul();

    void dezactiveazaFranaDeMana();

    void introduInViteze();

    void porneste();

    // Pentru parcare
    void activareSenzoriParcare();

    void detectareLoc();

    void centrarePeLoc();

    void ocupareLoc();

    void oprireMotor();
}
