package sample.state;

public class StareOprita implements IStare {

    @Override
    public String pornesteMotorul() {
        return "Motorul nu este pornit.";
    }

    @Override
    public String dezactiveazaFranaDeMana() {
        return "Frana de mana este activa.";
    }

    @Override
    public String introduInViteze() {
        return "Masina nu este introdusa in viteze.";
    }

    @Override
    public String porneste() {
        return "Masina nu poate porni.";
    }

    @Override
    public String activareSenzoriParcare() {
        return "Senzorii de parcare nu sunt activi.";
    }

    @Override
    public String detectareLoc() {
        return "Locul de parcare nu poate fi detectat.";
    }

    @Override
    public String centrarePeLoc() {
        return "Masina nu poate fi centrata pe loc.";
    }

    @Override
    public String ocupareLoc() {
        return "Masina ocupa un loc de parcare.";
    }

    @Override
    public String oprireMotor() {
        return "Motorul este oprit.";
    }
}
