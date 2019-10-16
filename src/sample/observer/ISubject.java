package sample.observer;

public interface ISubject {
    void adaugaObserver(IObserver o);
    void stergeObserver(IObserver o);
    void notificaMesaj(String mesaj);
}
