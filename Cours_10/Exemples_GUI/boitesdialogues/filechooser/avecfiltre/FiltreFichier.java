package boitesdialogues.filechooser.avecfiltre;

// Fichier : FileChooser2.java
import javax.swing.filechooser.FileFilter; //pour FileFilter
import java.io.File;

public class FiltreFichier extends FileFilter {

    private String ExtensionsAcceptees[];
    private String description;

    public void setExtensionsAcceptees(String[] t) {
        ExtensionsAcceptees = t;
    }

    public void setDescription(String s) {
        description = s;
    }

    @Override
    public boolean accept(File f) {
        if (f.isDirectory()) {
            return true;
        }
        String s = getExtension(f);
        if (s == null) {
            return false;
        }
        for (int i = 0; i < ExtensionsAcceptees.length; i++) {
            if (s.compareToIgnoreCase(ExtensionsAcceptees[i]) == 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String getDescription() {
        return description;
    }

    public static String getExtension(File f) {
        String extension = null;
        String nomFichier = f.getName();
        int i = nomFichier.lastIndexOf('.');

        if (i > 0 && i < nomFichier.length() - 1) {
            extension = nomFichier.substring(i + 1).toLowerCase();
        }
        return extension;
    }
}
