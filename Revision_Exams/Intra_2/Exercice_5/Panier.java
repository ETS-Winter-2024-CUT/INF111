package Revision_Exams.Intra_2.Exercice_5;

import java.util.ArrayList;

/**
 * Cette classe représente un panier contenant une liste d'articles.
 */
public class Panier {
    private ArrayList<Item> listeItems = new ArrayList<>();

    /**
     * Méthode permettant d'ajouter un article au panier.
     *
     * @param item L'article à ajouter au panier.
     */
    public void ajouterItem(Item item) {
        listeItems.add(item);
    }

    /**
     * Méthode permettant de calculer le total du panier
     * (somme des totaux partiels de tous les articles).
     *
     * @return Le total du panier.
     */
    public double totalPanier() {
        double total = 0;

        for (Item item : listeItems)
            total += item.totalPartielItem();

        return total;
    }
}
