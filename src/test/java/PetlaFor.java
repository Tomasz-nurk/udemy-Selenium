import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class PetlaFor {

    @Test
    public void wypiszLiczby() {
        /*for (int i=0; i<=10; i++){
            System.out.println(i);
        }*/
        List<String> studenci = Arrays.asList("Nick", "Mike", "Paul", "Brian", "Kris");
        /*for (String student: studenci) {
            System.out.println(student);
        }*/
        for (int index = 0; index < studenci.size(); index = index + 1) {
            System.out.println("Student nr "+ index + " to " + studenci.get(index));
        }
    }
}
