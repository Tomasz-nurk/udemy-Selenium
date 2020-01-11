import org.testng.annotations.Test;

public class StudentTest {
    @Test
    public void testStudent() {
        Student pierwszyStudent = new Student(); //typ obiektowy
        pierwszyStudent.nazwisko = "Wasilewski";
        pierwszyStudent.imie = "Pawel";
        pierwszyStudent.grupa = "G";
        pierwszyStudent.przedstawSie();

        Student drugiStudent = new Student();
        drugiStudent.nazwisko = "Patrycja";
        drugiStudent.imie = "Wasilewska";
        drugiStudent.grupa = "j";
        drugiStudent.przedstawSie();
    }
}
