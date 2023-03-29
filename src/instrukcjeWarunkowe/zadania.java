package instrukcjeWarunkowe;

public class zadania {
    public static void main(String[] args) {
//        int liczba = 2;
//        if(liczba % 2 == 0 ) {
//            System.out.println(liczba + " jest parzysta.");
//        } else {
//            System.out.println(liczba + " jest nieparzysta.");
//        }
        double kwota = -500;
        if(kwota < 0) {
            System.out.println("Nic nie musisz zapłacić podatku.");
        } else if(kwota <= 85528) {
            double podatek = kwota * 0.17;
            System.out.println("Podatek do zapłaty wynosi: " + podatek);
        } else {
            double podatekPonizejProgu = 85528 * 0.17;
            double podatekPowyzejProgu = (kwota - 85528) * 0.32;
            double podatek = podatekPonizejProgu + podatekPowyzejProgu;
            System.out.println("Podatek już większy do zapłaty wynosi: " + podatek);
        }
    }
}
