package Cours_1;

public class Exercice9_CastFloatInt {
    public static void main(String[] args) {
        float floatNumber = 150.75f;
        int intNumber = (int) floatNumber; // Casting float vers int

        System.out.println("Float avant cast: " + floatNumber);
        System.out.println("Int après cast: " + intNumber);

        // Dépassement de la capacité du byte
        int largeIntValue = 300;
        byte byteValue = (byte) largeIntValue; // Casting int vers byte

        System.out.println("Int avant cast: " + largeIntValue);
        System.out.println("Byte après cast (avec dépassement de capacité): " + byteValue);
    }
}
