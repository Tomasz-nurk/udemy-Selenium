public class Student {
    //tworzenie pol
    public String imie;
    public String nazwisko;
    public String grupa;

    //tworzenie metody dla studenta
    public void przedstawSie() {
        System.out.println("Nazywam sie " + " " + imie +" " + nazwisko);
    }
    public Student() {
        System.out.println("czesc! Witaj w konstruktorze!");
    }
    public Student(String noweImie, String noweNazwisko, String nowaGrupa) {
        imie = noweImie;
        nazwisko = noweNazwisko;
        grupa= nowaGrupa;
    }



}
