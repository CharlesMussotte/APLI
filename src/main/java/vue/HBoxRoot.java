package vue;

import controleur.Controleur;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;

public class HBoxRoot extends HBox {
    private static GridPaneAffichage affichage;
    private static Controleur controleur;
    public HBoxRoot() {
        affichage =new GridPaneAffichage();
        controleur = new Controleur();
        this.getChildren().addAll(affichage);
    }
    public static GridPaneAffichage getAffichage() {
        return affichage;
    }

    public static Controleur getControleur() {
        return controleur;
    }
}
