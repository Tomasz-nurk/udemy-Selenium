import org.testng.annotations.Test;

public class OPeratoryMatematyczne {
    @Test
    public void testOperatory() {
        int pierwszaLiczba = 5;
        int drugaLiczba = 2;
        int suma = pierwszaLiczba + drugaLiczba;
        int roznica = pierwszaLiczba - drugaLiczba;
        int iloczyn = pierwszaLiczba * drugaLiczba;
        int iloraz = pierwszaLiczba / drugaLiczba;
        int modulo = drugaLiczba%pierwszaLiczba;
        System.out.println(suma);
        System.out.println(roznica);
        System.out.println(iloczyn);
        System.out.println(iloraz);
        System.out.println(modulo);
    }
}
