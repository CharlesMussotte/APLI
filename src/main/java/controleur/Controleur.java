package controleur;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.RadioMenuItem;
import vue.GridPaneAffichage;
import vue.GridPaneDonnees;
import vue.HBoxRoot;

public class Controleur implements EventHandler {
    public void handle(Event event) {
        GridPaneAffichage affichage = HBoxRoot.getAffichage();
        GridPaneDonnees donnes =HBoxRoot.getDonnees();

        if (event.getSource() instanceof RadioMenuItem) {
            int numScene = (int)((RadioMenuItem) event.getSource()).getUserData();
            donnes.majDonnees(numScene);
        }
    }
}
