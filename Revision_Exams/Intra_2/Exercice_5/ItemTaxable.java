package Revision_Exams.Intra_2.Exercice_5;

/**
 * Cette classe représente un article taxable, dérivé de la classe Item,
 * avec une taxe supplémentaire.
 */
public class ItemTaxable extends Item {
    private double taxe;

    /**
     * Constructeur de la classe ItemTaxable avec les paramètres spécifiés.
     *
     * @param label        Le libellé de l'article taxable.
     * @param prixUnitaire Le prix unitaire de l'article taxable.
     * @param qttCommandee La quantité commandée de l'article taxable.
     * @param taxe         Le taux de taxe applicable à l'article taxable.
     */
    public ItemTaxable(String label, double prixUnitaire, int qttCommandee, double taxe) {
        super(label, prixUnitaire, qttCommandee);
        this.taxe = taxe;
    }

    /**
     * Constructeur de la classe ItemTaxable avec les paramètres spécifiés
     * (quantité commandée par défaut à 1).
     *
     * @param label        Le libellé de l'article taxable.
     * @param prixUnitaire Le prix unitaire de l'article taxable.
     * @param taxe         Le taux de taxe applicable à l'article taxable.
     */
    public ItemTaxable(String label, double prixUnitaire, double taxe) {
        super(label, prixUnitaire);
        this.taxe = taxe;
    }

    /**
     * Méthode permettant d'obtenir le taux de taxe de l'article taxable.
     *
     * @return Le taux de taxe de l'article taxable.
     */
    public double getTaxe() {
        return taxe;
    }

    /**
     * Méthode permettant de définir le taux de taxe de l'article taxable.
     *
     * @param taxe Le taux de taxe à définir.
     */
    public void setTaxe(double taxe) {
        this.taxe = taxe;
    }

    /**
     * Méthode permettant de calculer le total partiel pour cet article taxable (incluant la taxe).
     *
     * @return Le total partiel pour cet article taxable
     * (prix unitaire * quantité commandée * (1 + taxe)).
     */
    @Override
    public double totalPartielItem() {
        return super.totalPartielItem() * (1 + taxe);
    }
}
