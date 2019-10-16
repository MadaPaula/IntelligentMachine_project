package sample.state;

public class StarePornita implements IStare {
    @Override
    public String pornesteMotorul() {
        return "Motorul a pornit.";
    }

    @Override
    public String dezactiveazaFranaDeMana() {
        return "Frana de mana a fost dezactivata.";
    }

    @Override
    public String introduInViteze() {
        return "Masina a fost introdusa in viteze.";
    }

    @Override
    public String porneste() {
        return "Masina a pornit deplasarea.";
    }

    @Override
    public String activareSenzoriParcare() {
        return "Senzorii de parcare nu sunt activi.";
    }

    @Override
    public String detectareLoc() {
        return "Locul de parcare nu este detectat.";
    }

    @Override
    public String centrarePeLoc() {
        return "Masina nu este centrata pe un loc de parcare.";
    }

    @Override
    public String ocupareLoc() {
        return "Masina nu ocupa un loc de parcare.";
    }

    @Override
    public String oprireMotor() {
        return "Masina nu este oprita.";
    }
}
