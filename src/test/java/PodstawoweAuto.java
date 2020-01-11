import interfejs.Auto;

public class PodstawoweAuto implements Auto {
    private String model = "Tipo";
    private String marka = "Fiat";
    public void toJestMetodaSpecyficzna() {
        System.out.println("Metoda dla posiadaczy podstawowego auta - "+model);
    }
    @Override
    public void jedz() {
        System.out.println("Jedziesz podstawowym autem");
    }

    @Override
    public void zatrzymaj() {
        System.out.println("Zatrzymujesz auto uzywajac hamulcow bebnowych");

    }

    @Override
    public void otworzSzybe() {
        System.out.println("Otwierasz szybe manualnie - korbka");
    }

    @Override
    public void zmienBieg() {
        System.out.println("Zmieniasz bieg manualnie");
    }
}
