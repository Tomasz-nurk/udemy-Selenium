import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class PetlaWhile {
    @Test
    public void testWhile() {
        int index = 0;
       /* while (index <= 100) {
            System.out.println(index);
            index = index + 1;
        }*/
        List<String> owoce = Arrays.asList("Jablko", "Brzoskwinia", "Pomarancza", "Banan");

        while (index < owoce.size()) {
            System.out.println(owoce.get(index));
            index++;
        }
        /*while (true) {
            System.out.println(index);
            index = index + 1;
        }*/
    }
}
