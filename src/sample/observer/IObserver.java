package sample.observer;

import javafx.scene.control.TextArea;

public interface IObserver {
    void receptionareMesaj(String mesaj);

    String getNume();
}
