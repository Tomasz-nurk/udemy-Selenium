package indentyfikatory;

public class BaseSeleniumClass {
    public String first = "publiczny";
    String second = "bez identyfikatora";
    protected String third = "protected";
    private String fourth = "prywatny";

    public void checkAccess() {
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        System.out.println(fourth);
    }

}
