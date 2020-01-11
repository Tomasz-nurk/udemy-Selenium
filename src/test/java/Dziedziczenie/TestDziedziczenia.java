package Dziedziczenie;

import org.testng.annotations.Test;

public class TestDziedziczenia {
    @Test
    public void testDziedziczenia() {
        Dziecko dziecko = new Dziecko();
       /* dziecko.wypiszMojKolorOczu();
        dziecko.wypiszMojKolorWlosow();
        dziecko.wypiszTypCery();
        dziecko.probujePlywac();*/
        dziecko.probujePlywac();
        //dziecko.wypiszSklonnosciDoTycia();
       /* if (dziecko.sklonnoscDoTycia) {
            System.out.println("Mam sklonnosci do tycia po rodzicu");
        }*/
    }
}
