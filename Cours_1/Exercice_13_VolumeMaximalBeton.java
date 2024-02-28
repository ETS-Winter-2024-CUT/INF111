package Cours_1;

import java.util.Scanner;

/**
 * Ce programme calcule le volume maximal de béton pouvant être produit en fonction des quantités 
 * de ciment, de sable et de gravier disponibles.
 */
public class Exercice_13_VolumeMaximalBeton {
    // Quantités minimales de materiaux nécessaire par mètre cube de béton
    static final double MIN_CIMENT = 350.0;
    static final double MIN_SABLE = 680.0;
    static final double MIN_GRAVIER = 1175.0;

    /**
     * Méthode principale du programme.
     * Permet à l'utilisateur d'entrer les quantités de ciment, de sable et de gravier disponibles, 
     * puis calcule le volume maximal de béton pouvant être produit et l'affiche.
     * @param args Les arguments de la ligne de commande (non utilisés dans ce programme)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez la quantité de ciment disponible (en kg) : ");
        double ciment = scanner.nextDouble();

        System.out.print("Entrez la quantité de sable disponible (en kg) : ");
        double sable = scanner.nextDouble();

        System.out.print("Entrez la quantité de gravier disponible (en kg) : ");
        double gravier = scanner.nextDouble();

        // Calcul du volume maximal de béton pouvant être produit en prenant le minimum des rapports 
        // des quantités disponibles aux quantités minimales requises pour chaque composant
        double volumeMaximal = Math.min(ciment / MIN_CIMENT, Math.min(sable / MIN_SABLE, gravier / MIN_GRAVIER));

        // Affichage du volume maximal de béton
        System.out.printf("Le volume maximale de béton qui peut être produit est : %.2f m^3.\n", volumeMaximal);

        scanner.close();
    }
}
