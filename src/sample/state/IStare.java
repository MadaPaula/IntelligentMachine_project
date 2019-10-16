package sample.state;

import sample.MasinaInteligenta;

public interface IStare {
    // Pentru executa plecarea
    String pornesteMotorul();
    String dezactiveazaFranaDeMana();
    String introduInViteze();
    String porneste();

    // Pentru parcare
    String activareSenzoriParcare();
    String detectareLoc();
    String centrarePeLoc();
    String ocupareLoc();
    String oprireMotor();

}
