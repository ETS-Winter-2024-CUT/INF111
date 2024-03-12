package Revision_Exams.Intra_2.Exercice_3.Exceptions;

/**
 * Cette exception est lancée lorsqu'un montant de virement dépasse la limite autorisée.
 */
public class LimiteDepasseeException extends Exception {
    /**
     * Constructeur de l'exception LimiteDepasseeException.
     *
     * @param message Le message d'erreur associé à l'exception.
     */
    public LimiteDepasseeException(String message) {
        super(message);
    }
}
