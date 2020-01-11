import org.testng.annotations.Test;

public class ParametryMetod {

    public int suma(int pierwszaLiczba, int drugaLiczba) {
        //suma = pierwszaLiczba + drugaLiczba
        return pierwszaLiczba + drugaLiczba;
    }
public void przywitajSie(String imie) {
    System.out.println("Czesc " + imie);
}
    @Test
    public void testParametrow() {
        int sumaLiczb = suma(1,2);
        System.out.println(sumaLiczb);
        System.out.println(suma(1,6));
        przywitajSie("Jan");
        przywitajSie("Pawel");
    }
}
