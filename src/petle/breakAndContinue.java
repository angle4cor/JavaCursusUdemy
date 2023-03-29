package petle;

public class breakAndContinue {
    public static void main(String[] args) {
        int zmienna;
        for (zmienna = 1; zmienna <= 20; zmienna++) {
            System.out.println("Przed continue: " + zmienna);
            if(zmienna < 18) {
                continue; // dla cyfr mniejszych od 18 pętla sie nie wykona
            }
            System.out.println("Zmienna: " + zmienna);
        }
        for (zmienna = 1; zmienna <= 20; zmienna++) {
            if (zmienna == 18) {
                break; // nie wykona się
            }
            System.out.println("Zmienna w drugiej pętli: " + zmienna);
        }
    }
}
