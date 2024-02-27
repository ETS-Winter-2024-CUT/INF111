package Cours_1;

public class Exercice_6_VariableByte {
    static final int NOMBRE_ITERATIONS = 3;
    static final byte VALEUR_INITIALE = 126;

    public static void main(String[] args) {
        byte valeur = VALEUR_INITIALE;

        System.out.println("Valeur initiale : " + valeur);

        for (int i = 0; i < NOMBRE_ITERATIONS; i++) {
            valeur++;
            System.out.println(valeur);
        }
    }
}
