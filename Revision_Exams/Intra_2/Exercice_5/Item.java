package Revision_Exams.Intra_2.Exercice_5;

/**
 * Cette classe représente un article avec un libellé, un prix unitaire et une quantité commandée.
 */
public class Item {
    private String label;
    private double prixUnitaire;
    private int qttCommandee;

    /**
     * Constructeur de la classe Item avec les paramètres spécifiés.
     *
     * @param label        Le libellé de l'article.
     * @param prixUnitaire Le prix unitaire de l'article.
     * @param qttCommandee La quantité commandée de l'article.
     */
    public Item(String label, double prixUnitaire, int qttCommandee) {
        this.label = label;
        this.prixUnitaire = prixUnitaire;
        this.qttCommandee = qttCommandee;
    }

    /**
     * Constructeur de la classe Item avec les paramètres spécifiés
     * (quantité commandée par défaut à 1).
     *
     * @param label        Le libellé de l'article.
     * @param prixUnitaire Le prix unitaire de l'article.
     */
    public Item(String label, double prixUnitaire) {
        this(label, prixUnitaire, 1);
    }

    /**
     * Méthode permettant d'obtenir le libellé de l'article.
     *
     * @return Le libellé de l'article.
     */
    public String getLabel() {
        return label;
    }

    /**
     * Méthode permettant d'obtenir le prix unitaire de l'article.
     *
     * @return Le prix unitaire de l'article.
     */
    public double getPrixUnitaire() {
        return prixUnitaire;
    }

    /**
     * Méthode permettant d'obtenir la quantité commandée de l'article.
     *
     * @return La quantité commandée de l'article.
     */
    public int getQttCommandee() {
        return qttCommandee;
    }

    /**
     * Méthode permettant de calculer le total partiel pour cet article.
     *
     * @return Le total partiel pour cet article (prix unitaire * quantité commandée).
     */
    public double totalPartielItem() {
        return prixUnitaire * qttCommandee;
    }
}
