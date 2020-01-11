package klasaAbstrakcyjna;

import org.testng.annotations.Test;

public class klasaAbstrakcyjnaTest {
    @Test
    public void testKlasyAbstrakcyjnej() {
        Pies reksio = new Pies();
        reksio.poruszajSie();
        reksio.napijSiWody();
        System.out.println(reksio.gatunek);

        Ptak tweety = new Ptak();
        tweety.gatunek = "Ptak";
        tweety.napijSiWody();
        tweety.poruszajSie();
        tweety.wypiszPrzysmak();
        System.out.println(tweety.gatunek);
    }
}
