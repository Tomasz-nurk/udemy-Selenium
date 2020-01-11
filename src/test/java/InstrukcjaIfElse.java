import org.testng.annotations.Test;

public class InstrukcjaIfElse {
    @Test
    public void testInstrukcji() {
        sprawdzWiek(17);
        sprawdzWiek(20);
    }
    public void sprawdzWiek(int wiek) {
        if(wiek < 18) {
            System.out.println("Mlodziezy alkoholu nie sprzedajemy");
        }
        else {
            System.out.println("Mozesz kupic alkohol");
        }

    }
}
