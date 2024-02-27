package Cours_1;

/**
 * Ce programme illustre l'utilisation des castings entre les types float et int,
 * ainsi qu'entre les types int et byte.
 */
public class Exercice9_CastFloatInt {
    /**
     * Méthode principale du programme.
     * Démontre l'utilisation des castings entre float et int, et entre int et byte.
     *
     * @param args Les arguments de la ligne de commande (non utilisés dans ce programme)
     */
    public static void main(String[] args) {
        // Casting float vers int
        float floatNumber = 150.75f;
        int intNumber = (int) floatNumber;

        // Affichage du résultat du casting float vers int
        System.out.println("Float avant cast: " + floatNumber);
        System.out.println("Int après cast: " + intNumber);

        // Dépassement de la capacité du byte
        int largeIntValue = 300;
        byte byteValue = (byte) largeIntValue; // Casting int vers byte

        // Affichage du résultat du casting int vers byte
        System.out.println("Int avant cast: " + largeIntValue);
        System.out.println("Byte après cast (avec dépassement de capacité): " + byteValue);
    }
}
