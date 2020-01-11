import interfejs.Auto;
import org.testng.annotations.Test;

public class INterfejsTest {
    @Test
    public void interfejsTest() {

        Auto autoPremium = new AutoPremium();
        zaprezentujAuto(autoPremium);

        Auto auto = new PodstawoweAuto();
        zaprezentujAuto(auto);
        /*PodstawoweAuto auto = new PodstawoweAuto();
        auto.jedz();
        auto.zmienBieg();
        auto.otworzSzybe();
        auto.zatrzymaj();
        auto.toJestMetodaSpecyficzna();

        AutoPremium autoPremium = new AutoPremium();
        autoPremium.jedz();
        autoPremium.otworzSzybe();
        autoPremium.zmienBieg();
        autoPremium.zatrzymaj();
        autoPremium.specyficznaMetodaPremium();*/
    }
        public void zaprezentujAuto(Auto autoPremium) {
            System.out.println("Prezentujemy auto premium");
            autoPremium.jedz();
            autoPremium.zmienBieg();
            autoPremium.otworzSzybe();
            autoPremium.zatrzymaj();
        }


}
