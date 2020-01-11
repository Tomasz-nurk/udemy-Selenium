import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class PetlaDowhile {
    @Test
    public void testDoWhile() {
        int index = 0;
        /*do {
            System.out.println(index);
            index++;
        }while (index <5);*/

        List<String> rzeczy = Arrays.asList("Lampa", "Krzeslo", "Telewizor", "Szafka");

        do {
            System.out.println(rzeczy.get(index));
            index++;
        }while(index < rzeczy.size());

    }
}
