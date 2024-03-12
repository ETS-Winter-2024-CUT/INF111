package Revision_Exams.Intra_2.Exercice_3.Exceptions;

/**
 * Cette exception est lancée lorsqu'un solde est insuffisant pour effectuer une opération.
 */
public class SoldeInsuffisantException extends Exception {
    /**
     * Constructeur de l'exception SoldeInsuffisantException.
     *
     * @param message Le message d'erreur associé à l'exception.
     */
    public SoldeInsuffisantException(String message) {
        super(message);
    }
}
