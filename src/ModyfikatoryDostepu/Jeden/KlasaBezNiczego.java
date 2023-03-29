package ModyfikatoryDostepu.Jeden;

import Klasy.Klasa;

public class KlasaBezNiczego {
    public void metoda() {
        KlasaA obiekt = new KlasaA();
        obiekt.poleDziedziczenie = 202;
        obiekt.poleBezNiczego = 203;
        obiekt.polePubliczne = 204;
        obiekt.metodaPubliczna();
        obiekt.metodaBezNiczego();
        obiekt.metodaProtected();
    }
}
