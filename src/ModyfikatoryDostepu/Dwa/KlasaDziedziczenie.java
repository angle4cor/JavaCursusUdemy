package ModyfikatoryDostepu.Dwa;

import ModyfikatoryDostepu.Jeden.KlasaA;

public class KlasaDziedziczenie extends KlasaA {
    public void metoda() {
        polePubliczne = 101; // dostęp, ponieważ publiczne
        poleDziedziczenie = 102; // dostęp, ponieważ zrobiliśmy dziedziczenie - extends
        metodaPubliczna();
        metodaProtected();
    }

}
