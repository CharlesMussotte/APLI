package controleur;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.RadioMenuItem;
import modele.Lecture;
import modele.Scenario;
import vue.App;
import vue.GridPaneAffichage;
import vue.HBoxRoot;

import java.io.File;
import java.io.IOException;

public class Controleur implements EventHandler {
    public void handle(Event event) {
        HBoxRoot root = (HBoxRoot) App.getRoot();
        GridPaneAffichage affichage = root.getAffichage();

        if (event.getSource() instanceof RadioMenuItem) {

        }

    }
}
