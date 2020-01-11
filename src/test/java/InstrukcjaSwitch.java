import org.testng.annotations.Test;

public class InstrukcjaSwitch {
    @Test
    public void testSwitch() {
        wypiszDzienTygodnia(4);
        wypiszDzienTygodnia(6);
    }
    public void wypiszDzienTygodnia(int dzienTygodnia) {
        switch (dzienTygodnia) {
            case 1:
                System.out.println("poniedzialek");
                break;
            case 2:
                System.out.println("wtorek");
                break;
            case 3:
                System.out.println("sroda");
                break;
            case 4:
                System.out.println("czwartek");
                break;
            case 5:
                System.out.println("piatek");
                break;
            case 6:
                System.out.println("sobota");
                break;
            case 7:
                System.out.println("niedziela");
                break;

        }
    }
}
