package Revision_Exams.Intra_2.Exercice_5;

/**
 * Cette classe représente un point d'entrée pour exécuter le programme.
 */
public class Main {
    /**
     * Méthode principale pour tester la classe Panier et ses fonctionnalités.
     *
     * @param args Les arguments de la ligne de commande (non utilisés dans cette application)
     */
    public static void main(String[] args) {
        Panier unPanier = new Panier();

        Item itemA = new Item("Item 1", 1.23, 18);
        Item itemB = new ItemTaxable("Item 2", 0.78, 42, 0.15);
        Item itemC = new ItemTaxable("Item 3", 45.6, 1, 0.115);

        unPanier.ajouterItem(itemA);
        unPanier.ajouterItem(itemB);
        unPanier.ajouterItem(itemC);

        System.out.println(unPanier.totalPanier());
    }
}
