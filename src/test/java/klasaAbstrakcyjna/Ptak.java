package klasaAbstrakcyjna;

public class Ptak extends Zwierzatko {
    @Override
    public void poruszajSie() {
        System.out.println("Latam");
    }

    @Override
    public void wypiszPrzysmak() {
        System.out.println("lubie ziarno");
    }
}
