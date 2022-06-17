package vue;

import javafx.scene.control.*;
import javafx.scene.layout.HBox;

public class HBoxRoot extends HBox {
    private GridPaneAffichage affichage;
    public HBoxRoot() {
        affichage =new GridPaneAffichage();
        this.getChildren().addAll(affichage);
    }
    public GridPaneAffichage getAffichage() {
        return affichage;
    }
}
