package Cours_1;

/**
 * Ce programme effectue des opérations sur une variable de type byte.
 */
public class Exercice_6_VariableByte {
    // Nombre d'itérations à effectuer
    static final int NOMBRE_ITERATIONS = 3;
    // Valeur initiale de la variable
    static final byte VALEUR_INITIALE = 126;

    /**
     * Méthode principale du programme.
     * Initialise une variable de type byte avec une valeur initiale, puis incrémente cette valeur 
     * plusieurs fois.
     * Affiche les valeurs à chaque étape.
     *
     * @param args Les arguments de la ligne de commande (non utilisés dans ce programme)
     */
    public static void main(String[] args) {
        // Initialisation de la variable avec la valeur initiale
        byte valeur = VALEUR_INITIALE;

        // Affichage de la valeur initiale
        System.out.println("Valeur initiale : " + valeur);

        // Boucle pour incrémenter la valeur et l'afficher
        for (int i = 0; i < NOMBRE_ITERATIONS; i++) {
            valeur++;
            System.out.println(valeur);
        }
    }
}
