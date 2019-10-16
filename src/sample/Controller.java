package sample;

import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import sample.command.ComandaPlecare;
import sample.command.ComandaParcare;
import sample.observer.Utilizator;
import sample.state.Stari;

public class Controller {

    private final TextArea logBox;
    private final MasinaInteligenta masinaInteligenta;
    private Utilizator utilizatorCurent;
    private final Utilizator util1;
    private final Utilizator util2;

    public Controller(TextArea logBox) {
        this.logBox = logBox;
        this.masinaInteligenta = new MasinaInteligenta(this.logBox);
        this.util1 = new Utilizator(this.logBox, "Utilizator1", false);
        this.util2 = new Utilizator(this.logBox, "Utilizator2", false);
        this.utilizatorCurent = this.util1;
    }

    public void handleComandaPlecare() {
        utilizatorCurent.setCommand(new ComandaPlecare(masinaInteligenta));
        utilizatorCurent.run();
    }

    public void handleComandaParcare() {
        utilizatorCurent.setCommand(new ComandaParcare(masinaInteligenta));
        utilizatorCurent.run();
    }

    public void handleAbonat(boolean esteAbonat) {
        if (esteAbonat) {
            masinaInteligenta.adaugaObserver(utilizatorCurent);
            this.utilizatorCurent.abonat = true;
        } else {
            masinaInteligenta.stergeObserver(utilizatorCurent);
            this.utilizatorCurent.abonat = false;
        }
    }


    public void handleUtilizatorCurent(RadioButton utilizator1, RadioButton utilizator2, CheckBox abonat) {

        this.utilizatorCurent = null;
        if (utilizator1.isSelected()) {
            this.utilizatorCurent = this.util1;
            abonat.setSelected(this.util1.abonat);

        } else if (utilizator2.isSelected()) {
            this.utilizatorCurent = this.util2;
            abonat.setSelected(this.util2.abonat);
        }
    }

    public void handleSchimbareStare(Stari stare) {
        masinaInteligenta.setStare(stare);
    }
}
