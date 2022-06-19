package vue;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import modele.Itineraire;
import modele.Lecture;
import modele.Scenario;

import java.io.File;
import java.io.IOException;

public class GridPaneAffichage extends GridPane {
    TextArea trajet;
    Menu senario;
    MenuBar menuBar;
    Label labelTrajet;
    Label labelNombreScenario;
    Button boutonDonne;
    int numTrajet;
    int nbTrajet;
    int nbSenar;
    int longeur;
    public GridPaneAffichage() {
        nbSenar = 5;
        nbTrajet = 10;
        longeur =250;
        Label labelTitre = new Label("Association des Pokemonistes Libres");
        labelNombreScenario = new Label("Il y a " + nbTrajet + " trajet possible");
        boutonDonne = new Button("Donnée du Scenario");
        labelTitre.setId("titre");
        trajet = new TextArea();
        trajet.setText("Taille du trajet: "+ longeur +" km");
        menuBar = new MenuBar();
        Button boutonNext = new Button(">");
        Button boutonBefore = new Button("<");
        Button boutonLast = new Button(">>");
        Button boutonnFirst = new Button("<<");
        numTrajet = 1;
        labelTrajet = new Label("Trajet numéro "+ numTrajet);

        senario = new Menu("Senario");
        ToggleGroup senar = new ToggleGroup();
        for (int i =0 ; i < nbSenar; i++) {
            RadioMenuItem presenario = new RadioMenuItem("Scenario " + i);
            senario.getItems().addAll(presenario);
            presenario.setToggleGroup(senar);
            presenario.setUserData(i);
            presenario.setOnAction(HBoxRoot.getControleur());
        }
        boutonDonne.setOnAction(HBoxRoot.getControleur());

        menuBar.getMenus().addAll(senario);
        int ligne = 0;
        int taille = 10;
        this.add(menuBar, 0, ligne, 2, 1);
        this.add(labelTitre, 4, ligne++, 4, 1);
        this.add(trajet, 1, ligne, 10, taille);
        ligne = ligne + taille;
        this.add(boutonnFirst, 2, ligne);
        this.add(boutonBefore, 3, ligne);
        this.add(labelTrajet, 4, ligne, 2, 1);
        this.add(boutonNext, 6, ligne);
        this.add(boutonLast, 7, ligne++);
        this.add(labelNombreScenario, 0, ligne, 4, 1);
        this.add(boutonDonne, 7, ligne, 3, 1);
        boutonNext.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if (numTrajet <nbTrajet){
                numTrajet +=1;
                labelTrajet.setText("Trajet numéro "+ numTrajet);
                }
            }
        });
        boutonBefore.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if (numTrajet >1) {
                    numTrajet -= 1;
                    labelTrajet.setText("Trajet numéro " + numTrajet);
                }
            }
        });
        boutonnFirst.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                    numTrajet = 1;
                    labelTrajet.setText("Trajet numéro " + numTrajet);
            }
        });
        boutonLast.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                    numTrajet = nbTrajet;
                    labelTrajet.setText("Trajet numéro " + numTrajet);
            }
        });

    }
    public void updateScenario(Scenario senario) throws IOException {
        Itineraire itineraire = new Itineraire(senario);
        trajet.setText(itineraire.toString());
    }

    public Menu getMenu() {
        return senario;
    }
}
