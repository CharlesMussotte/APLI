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
        GridPaneAffichage affichage = HBoxRoot.getAffichage();

        if (event.getSource() instanceof RadioMenuItem) {
            try {
                Scenario senario = Lecture.lectureScenario(new File("Scenario"+File.separator+"scenario_0.txt"));
                affichage.updateScenario(senario);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            String nom =((RadioMenuItem) event.getSource()).getText();
            affichage.getMenu().setText(nom);
        }

    }
}
