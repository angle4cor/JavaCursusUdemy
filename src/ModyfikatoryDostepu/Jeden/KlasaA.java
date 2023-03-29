package ModyfikatoryDostepu.Jeden;

public class KlasaA {
    public int polePubliczne; // dostępny wszędzie
    protected int poleDziedziczenie; // dostępny w dziedziceniu oraz w tym samym package
    private int polePrywatne; // dostepny w obrębie tej klasy
    int poleBezNiczego;

    public void metodaPubliczna() {

    }

    protected void metodaProtected() {

    }

    private void metodaPrywatna() {

    }

    void metodaBezNiczego() {

    }
}
