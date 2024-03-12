package Revision_Exams.Intra_2.Exercice_2;

/**
 * La classe ProgrammePrincipal est la classe principale du programme.
 * Elle instancie quelques objets de la classe Produit avec différents statuts
 * et affiche un message spécifique en fonction du statut de chaque produit.
 */
public class ProgrammePrincipal {
    /**
     * La méthode main est le point d'entrée du programme.
     * Elle crée des instances de Produit avec différents statuts
     * et affiche un message spécifique pour chaque produit.
     *
     * @param args Les arguments de la ligne de commande (non utilisés ici)
     */
    public static void main(String[] args) {
        Produit premierProduit = new Produit("Table", StatutProduit.ENSTOCK);
        Produit secondProduit = new Produit("Télévision", StatutProduit.RUPTURE);
        Produit troisiemeProduit = new Produit("Vêtement", StatutProduit.DISCONTINU);

        premierProduit.afficherMessage();
        secondProduit.afficherMessage();
        troisiemeProduit.afficherMessage();
    }
}
