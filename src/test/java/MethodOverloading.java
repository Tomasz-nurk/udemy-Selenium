import org.testng.annotations.Test;

public class MethodOverloading {
    @Test
    public void methodOverloadingTest() {
        Select select = new Select();
        select.selectBy(1);
        select.selectBy("Volvo");
    }
}
