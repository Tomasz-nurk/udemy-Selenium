package Dziedziczenie;

public class Dziecko extends Rodzic {
    protected String kolorOczu = "Niebieskie";
    public void wypiszMojKolorOczu() {
        System.out.println("Moj kolor oczu to: "+ kolorOczu);
    }
    public void wypiszMojKolorWlosow() {
        System.out.println("Moj kolor wlosow to: "+ kolorWlosow);
    }

    public void wypiszTypCery() {
        System.out.println("Moja cera ma typ: "+ typCery);
    }
    public void wypiszSklonnosciDoTycia() {
        System.out.println("czy mam sklonnosci do tycia: "+ sklonnoscDoTycia);
    }
    public void probujePlywac() {
        System.out.println("byc moze mam talent po rodzicu ale jeszcze nie umiem plywac");
    }
}
