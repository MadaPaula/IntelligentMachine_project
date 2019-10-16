package sample.observer;

import javafx.scene.control.TextArea;
import sample.command.ICommand;


public class Utilizator implements IObserver {
    private ICommand command;
    private TextArea textArea;
    private String nume;
    public boolean abonat;

    public Utilizator(TextArea textArea, String nume, boolean abonat) {
        this.textArea = textArea;
        this.nume = nume;
        this.abonat = abonat;
    }

    public void setCommand(ICommand command) {
        this.command = command;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    @Override
    public String getNume() {
        return nume;
    }

    public void setAbonat(boolean abonat) {
        this.abonat = abonat;
    }

    public void run() {
        command.executa();
    }

    @Override
    public void receptionareMesaj(String mesaj) {
        this.textArea.appendText(String.format("%s a receptionat mesajul: %s \n", this.nume, mesaj));
    }

}
