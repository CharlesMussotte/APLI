//----- IMPORTS -----

package controleur;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.RadioMenuItem;
import modele.Lecture;
import modele.Scenario;
import vue.GridPaneAffichage;
import vue.GridPaneDonnees;
import vue.HBoxRoot;
import java.io.File;
import java.io.IOException;


//----- CONTROLEUR -----

public class Controleur implements EventHandler {

    public void handle(Event event) {

        GridPaneAffichage affichage = HBoxRoot.getAffichage();
        GridPaneDonnees donnes = HBoxRoot.getDonnees();

        if (event.getSource() instanceof Button) { // Passage de l'affichage aux données
            HBoxRoot.changement();
        }

        if (event.getSource() instanceof RadioMenuItem) {
            int numScene = (int)((RadioMenuItem) event.getSource()).getUserData(); // Recupére les valeurs du scénario choisi
            
            // CHOIX DU SCENARIO

            if (numScene == 0){ // Scénario 0
                try {
                    Scenario senario = Lecture.lectureScenario(new File("TourAPLI\\Scenar\\scenario_0.txt"));
                    donnes.majDonnees(senario);
                    affichage.updateScenario(senario); // MAJ des acheteurs/vendeurs
                } catch (IOException e) {
                    throw new RuntimeException(e); // Si le fichier est inexistant
                }

            }
            if (numScene == 1){ // Scénario 1
                try {
                    Scenario senario = Lecture.lectureScenario(new File("TourAPLI\\Scenar\\scenario_1_1.txt"));
                    donnes.majDonnees(senario);
                    affichage.updateScenario(senario);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }

            }
            if (numScene == 2){ // Scénario 2
                try {
                    Scenario senario = Lecture.lectureScenario(new File("TourAPLI\\Scenar\\scenario_1_2.txt"));
                    donnes.majDonnees(senario);
                    affichage.updateScenario(senario);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }

            }
            if (numScene == 3){ // Scénario 3
                try {
                    Scenario senario = Lecture.lectureScenario(new File("TourAPLI\\Scenar\\scenario_2_1.txt"));
                    donnes.majDonnees(senario);
                    affichage.updateScenario(senario);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }

            }
            if (numScene == 04){ // Scénario 4
                try {
                    Scenario senario = Lecture.lectureScenario(new File("TourAPLI\\Scenar\\scenario_2_2.txt"));
                    donnes.majDonnees(senario);
                    affichage.updateScenario(senario);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        }
    }
