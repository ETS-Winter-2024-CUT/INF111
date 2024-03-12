package Revision_Exams.Intra_2.Exercice_2;

/**
 * La classe Produit représente un produit avec un nom et un statut.
 */
public class Produit {
    private final String nom; // Le nom du produit
    private StatutProduit statut; // Le statut du produit

    /**
     * Constructeur pour initialiser un produit avec un nom et un statut spécifiés.
     *
     * @param nom    Le nom du produit
     * @param statut Le statut du produit
     */
    public Produit(String nom, StatutProduit statut) {
        this.nom = nom;
        this.statut = statut;
    }

    /**
     * Constructeur pour initialiser un produit avec un nom et un statut par défaut (RUPTURE).
     *
     * @param nom Le nom du produit
     */
    public Produit(String nom) {
        this(nom, StatutProduit.RUPTURE);
    }

    /**
     * Affiche un message décrivant le produit en fonction de son statut.
     */
    public void afficherMessage() {
        System.out.printf("Produit %s : ", nom);

        switch (statut) {
            case ENSTOCK:
                System.out.println("En stock.");
                break;
            case RUPTURE:
                System.out.println("En rupture de stock.");
                break;
            case DISCONTINU:
                System.out.println("Discontinu.");
                break;
            default:
                throw new Error("Statut invalide!");
        }
    }
}
