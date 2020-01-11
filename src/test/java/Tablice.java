public class Tablice {
    int liczby[] = new int[5];

    public void ustawWartosc() {
        liczby[0] = 1;
        liczby[1] = 10;
        liczby[2] = 25;
        liczby[3] = 100;
        liczby[4] = 150;
    }

    public void wypiszElementyTablicy() {
        for (int i = 0; i < liczby.length; i++) {
            System.out.println(liczby[i]);
        }
    }

    Student studenci[] = new Student[2];

    public void dodajStudentow() {
        Student pierwszy = new Student("Jan", "Kosakowski", "grupaA");
        Student drugi = new Student("Janek", "Wu", "grupaA");
        studenci[0] = pierwszy;
        studenci[1] = drugi;
    }

    public void przedstawStudentow() {
        try {
            studenci[0].przedstawSie();
            studenci[1].przedstawSie();
            studenci[2].przedstawSie();
            System.out.println("Tutaj znajduje sie cos innego.");
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Wystapil wyjatek");
        } finally {
            System.out.println("Zamykam polaczenie do bazy danych");
        }
    }
}
