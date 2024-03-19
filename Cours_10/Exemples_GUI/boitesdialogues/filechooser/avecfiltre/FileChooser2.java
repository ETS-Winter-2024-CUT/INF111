package boitesdialogues.filechooser.avecfiltre;

// Fichier : FileChooser2.java
import java.awt.event.*; //pour les événements.
import javax.swing.*; //pour les composants swing

public class FileChooser2 {
	public static void main(String args[]) {
		JMenuBar mb = new JMenuBar();
		JMenu mFichier = new JMenu("Fichier");
		JMenuItem mOuvrir = new JMenuItem("Ouvrir");
		mFichier.add(mOuvrir);
		final JFrame f = new JFrame("Exemple de JFileChooser");
		mOuvrir.addActionListener(
				new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						JFileChooser chooser = new JFileChooser();

						// FiltreOffice filtreOffice = new FiltreOffice();
						// FiltreImages filtreImages = new FiltreImages();
						// Filtre Office :
						FiltreFichier filtreOffice = new FiltreFichier();
						filtreOffice.setExtensionsAcceptees(
								new String[] { "doc", "dot", "ppt", "PPS", "mDb", "xls", "docx", "xlsx" });
						filtreOffice.setDescription("Documents Microsoft Office");

						// Filtre images :
						FiltreFichier filtreImages = new FiltreFichier();
						filtreImages.setExtensionsAcceptees(
								new String[] { "gif", "jpg", "jpeg", "tiff", "tif", "bmp", "png" });
						filtreImages.setDescription("Documents Images");
						// Filtre applications :
						FiltreFichier filtreApplications = new FiltreFichier();
						filtreApplications.setExtensionsAcceptees(new String[] { "exe", "jar", "bat", "deb", "sh" });
						filtreApplications.setDescription("Applications");

						// chooser.removeChoosableFileFilter(chooser.getFileFilter());

						chooser.setFileFilter(filtreOffice);
						chooser.addChoosableFileFilter(filtreImages);
						chooser.addChoosableFileFilter(filtreApplications);

						// chooser.removeChoosableFileFilter(filtreImages);

						int returnVal = chooser.showOpenDialog(f); // l'argument f transmis est le composant parent.

						if (returnVal == JFileChooser.APPROVE_OPTION) {
							System.out.println("Vous avez sélectionné le fichier : " +
									chooser.getSelectedFile().getName() + " situe dans le repertoire "
									+ chooser.getSelectedFile().getParent());
						}
					}
				});

		JMenu mOutils = new JMenu("Outils");

		mOutils.add(new JMenuItem("Orthographe..."));
		mOutils.add(new JMenuItem("Preferences..."));
		mb.add(mFichier);
		mb.add(mOutils);
		f.setJMenuBar(mb);
		f.setSize(500, 500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
}
