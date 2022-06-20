package vue;

import com.sun.javafx.UnmodifiableArrayList;
import controleur.Controleur;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;

import java.util.List;

public class HBoxRoot extends HBox {
    private static GridPaneAffichage affichage;
    private static GridPaneDonnees donnees;
    private static Controleur controleur;
    private static StackPane stackPane;
    private static List<Node> listScrollPane;
    public HBoxRoot() {
        controleur = new Controleur();
        affichage =new GridPaneAffichage();
        donnees = new GridPaneDonnees();
        stackPane = new StackPane();
        affichage.setId("opaque");
        donnees.setId("opaque");
        stackPane.getChildren().add(donnees);
        stackPane.getChildren().add(affichage);
        listScrollPane = stackPane.getChildren();
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

    public static void  changement(){
        listScrollPane.get(0).toFront();
    }
}
