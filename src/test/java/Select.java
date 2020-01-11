/*<select>
<option value="volvo">Volvo</option>
<option value="saab">Saab</option>
<option value="mercedes">Mercedes</option>
<option selected="selected" value="audi">Audi</option>
</select>*/

public class Select {
    public void selectBy(String vivibleText) {
        System.out.println("Wybieram wartosc zawierajaca tekst "+ vivibleText);
    }

    public void selectBy(int index) {
        System.out.println("Wybieram wartosc z indexu "+ index);
    }

}
