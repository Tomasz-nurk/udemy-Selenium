import org.openqa.selenium.json.JsonOutput;
import org.testng.annotations.Test;

public class Metody {

    public void nazwaMetody() {
        int a = 2;
        int b = 3;
        System.out.println(a+b);
    }



    public int suma() {
        int a = 2;
        int b = 3;
        return a+b;
    }
    int wynikDazialania = suma();




    public Zabawki pobierzDaneZabawki() {
        Zabawki zabawka = new Zabawki();
        zabawka.producent = "Matchbox";
        zabawka.rodzaj = "resorak";
        zabawka.material= "Platsik";
        return zabawka;

    }
    @Test

    public void testMetod(){
        nazwaMetody();
        System.out.println(suma());
        System.out.println(wynikDazialania);
        Zabawki zabawka = pobierzDaneZabawki();
        System.out.println(zabawka.producent);
        System.out.println(zabawka.material);
        System.out.println(zabawka.rodzaj);
    }
}
