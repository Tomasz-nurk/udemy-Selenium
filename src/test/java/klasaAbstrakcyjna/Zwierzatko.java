package klasaAbstrakcyjna;

public abstract class Zwierzatko {
    public String gatunek = "Ssak";
    public abstract void poruszajSie();
    public abstract void wypiszPrzysmak();

    public void napijSiWody() {
        System.out.println("Pije wode");
    }
}
