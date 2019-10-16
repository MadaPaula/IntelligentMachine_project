package sample;

import javafx.scene.control.TextArea;
import sample.command.IReceiver;
import sample.observer.IObserver;
import sample.observer.ISubject;
import sample.state.*;

import java.util.ArrayList;
import java.util.List;


public class MasinaInteligenta implements IReceiver, ISubject {

    IStare stareCurenta;
    public TextArea textArea;
    public static List<IObserver> utilizatori = new ArrayList<>();

    public MasinaInteligenta(TextArea textArea) {
        this.textArea = textArea;
        this.stareCurenta = new StareOprita();
    }

    public void setStare(Stari stareCurenta) {
        if (stareCurenta == Stari.PORNITA) {
            this.stareCurenta = new StarePornita();
        } else {
            this.stareCurenta = new StareOprita();
        }

        this.notificaMesaj(String.format("Masina inteligenta a trecut in starea: %s", stareCurenta.toString().toLowerCase()));
    }

    @Override
    public void adaugaObserver(IObserver o) {
        this.notificaMesaj(String.format("Utilizatorul \"%s\" s-a abonat.", o.getNume()));
        utilizatori.add(o);
    }

    @Override
    public void stergeObserver(IObserver o) {
        utilizatori.remove(o);
        this.notificaMesaj(String.format("Utilizatorul \"%s\" s-a dezabonat.", o.getNume()));
    }

    @Override
    public void notificaMesaj(String mesaj) {
        for (IObserver o : utilizatori) {
            o.receptionareMesaj(mesaj);
        }
    }


    @Override
    public void pornesteMotorul() {
        notificaMesaj(this.stareCurenta.pornesteMotorul());
    }

    @Override
    public void dezactiveazaFranaDeMana() {
        notificaMesaj(this.stareCurenta.dezactiveazaFranaDeMana());
    }

    @Override
    public void introduInViteze() {
        notificaMesaj(this.stareCurenta.introduInViteze());
    }

    @Override
    public void porneste() {
        notificaMesaj(this.stareCurenta.porneste());
    }

    @Override
    public void activareSenzoriParcare() {
        notificaMesaj(this.stareCurenta.activareSenzoriParcare());
    }

    @Override
    public void detectareLoc() {
        notificaMesaj(this.stareCurenta.detectareLoc());
    }

    @Override
    public void centrarePeLoc() {
        notificaMesaj(this.stareCurenta.centrarePeLoc());
    }

    @Override
    public void ocupareLoc() {
        notificaMesaj(this.stareCurenta.ocupareLoc());
    }

    @Override
    public void oprireMotor() {
        notificaMesaj(this.stareCurenta.oprireMotor());
    }
}
