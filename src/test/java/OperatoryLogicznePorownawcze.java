import org.testng.annotations.Test;

public class OperatoryLogicznePorownawcze {
    @Test
    public void testOperatorow(){
        int liczbaA = 2;
        int liczbaB = 5;

        System.out.println(liczbaA>liczbaB);
        System.out.println(liczbaA<liczbaB);
        System.out.println(liczbaA==liczbaB);
        System.out.println(liczbaA!=liczbaB);
        System.out.println(liczbaA>=liczbaB);
        System.out.println(liczbaA<=liczbaB);

        System.out.println(1>0 && 1>3);
        System.out.println(1>2 || 5>2);
    }

}
