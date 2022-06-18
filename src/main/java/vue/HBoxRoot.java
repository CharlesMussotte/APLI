package vue;

import controleur.Controleur;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;

public class HBoxRoot extends HBox {
    private GridPaneAffichage affichage;
    private static Controleur controleur;
    public HBoxRoot() {
        affichage =new GridPaneAffichage();
        controleur = new Controleur();
        this.getChildren().addAll(affichage);
    }
    public GridPaneAffichage getAffichage() {
        return affichage;
    }

    public static Controleur getControleur() {
        return controleur;
    }
}
