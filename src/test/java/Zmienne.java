public class Zmienne {

    //zmienne - kontenerki w pamieci ktore przechowuja jakas wartosc
    //deklaracja zmiennej - bez przypisania wartosci
    int pierwszaLiczba;
    int drugaLiczba;
    int suma;
    int trzeciaLiczba = 3;
    String naszeImie = "Pawel";
    //tworzenie metody publicznej ktora dodaje dwie liczby
    public void sum() {
        //deklarujemy co ma sie dziac w metodzie
        //przypisywanie wartosci do zmiennych -->inicjalizacja
        pierwszaLiczba = 2;
        drugaLiczba = 3;

        suma = pierwszaLiczba + drugaLiczba;

        System.out.println(suma);
    }
}
