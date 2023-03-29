package zadaniaZmienneIOperatory;

public class zadania {
    public static void main(String[] args) {
        int wiek = 32;
        float wzrost = 1.85f;
        float waga = 120f;

        System.out.println("Wiek: " + wiek);
        System.out.println("Wzrost: " + wzrost);
        System.out.println("Waga: " + waga);

        float bmi = waga / (float) Math.pow(wzrost, 2);
        System.out.println("BMI: " + bmi);

        // konwersja float na int
        int bmiInt = (int) bmi;
        System.out.println("BMI jako int: " + bmiInt);

        int liczba = 8;
        System.out.println("liczba / 2: " + liczba / 2);
        System.out.println("liczba / 3: " + liczba / 3);

        int [][] nowaTablica = { {1,2,3}, {4,5,6}};
        System.out.println("[0][0]: " + nowaTablica[0][0]);
        System.out.println("[0][1]: " + nowaTablica[0][1]);

    }
}