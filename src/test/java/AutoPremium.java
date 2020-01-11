import interfejs.Auto;

public class AutoPremium implements Auto {
    @Override
    public void jedz() {
        System.out.println("Jedziesz autem ze zlotymi felgami");
    }

    @Override
    public void zatrzymaj() {
        System.out.println("Twoja droga haomwania jest krotka dzieki ceramicznej powloce tarcz");
    }

    @Override
    public void otworzSzybe() {
        System.out.println("Automatycznie otwierasz szybe");

    }

    @Override
    public void zmienBieg() {
        System.out.println("Nie zmieniam biegow mam automat");
    }
    public void specyficznaMetodaPremium() {
        System.out.println("Jako posiadacz auta premium masz znizke na paliwo");
    }
}
