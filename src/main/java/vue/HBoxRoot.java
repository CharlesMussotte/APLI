package vue;

import controleur.Controleur;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;

public class HBoxRoot extends HBox {
    private static GridPaneAffichage affichage;
    private static GridPaneDonnees donnees;
    private static Controleur controleur;
    private StackPane stackPane;
    public HBoxRoot() {
        affichage =new GridPaneAffichage();
        donnees = new GridPaneDonnees();
        controleur = new Controleur();
        stackPane = new StackPane();
        affichage.setId("opaque");
        donnees.setId("opaque");
        stackPane.getChildren().add(donnees);
        stackPane.getChildren().add(affichage);
        this.getChildren().add(stackPane);
    }
    public static GridPaneAffichage getAffichage() {
        return affichage;
    }

    public static GridPaneDonnees getDonnees() {
        return donnees;
    }

    public static Controleur getControleur() {
        return controleur;
    }
}
