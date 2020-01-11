import org.testng.annotations.Test;

public class Zabawki {

    public String rodzaj;
    public String material;
    public int wiek;
    public String producent;

    public void opisZabawki() {
        System.out.println("Zabawka to: " + " " + rodzaj + " Producentem jest " + producent + "Zabawka ta zrobiona jest z " + " " + material + " Przeznaczona jest dla dzieci w wieku" + " " + wiek);
    }

    //public Zabawki(String nowyProducent, String nowyRodzaj, String nowyMaterial) {
    //producent = nowyProducent;
    //rodzaj = nowyRodzaj;
    //material = nowyMaterial;
    //}


    @Test

    public void testZabawki() {

        Zabawki pierwszaZabawka = new Zabawki();
        pierwszaZabawka.rodzaj = "Lalka Barbie";
        pierwszaZabawka.material = "Plastik";
        pierwszaZabawka.producent = "PlastikPlayDoll";
        pierwszaZabawka.opisZabawki();
    }
}


