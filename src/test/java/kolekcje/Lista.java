package kolekcje;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class Lista {
    List<String> imiona = new ArrayList<String>();

    public void dodajImiona() {
        imiona.add("Tomek");
        imiona.add("Janoslaw");
        imiona.add("Szymon");
    }
    @Test
    public void testListy() {
        dodajImiona();
        System.out.println(imiona.get(0));
        System.out.println(imiona.size());
        imiona.remove("Tomek");
        System.out.println(imiona.size());
        System.out.println(imiona.indexOf("Janoslaw"));
    }
}
