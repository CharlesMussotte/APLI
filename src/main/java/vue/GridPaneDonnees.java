package vue;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import modele.Lecture;
import modele.Scenario;

import java.io.File;
import java.io.IOException;

public class GridPaneDonnees extends GridPane {
    TextArea acheteur;
    TextArea vendeur;
    Menu senario;
    MenuBar menuBar;
    static Button  boutonTrajet;
    int nbSenar;

    public GridPaneDonnees() {
        nbSenar = 5;
        Label labelTitre = new Label("Association des Pokemonistes Libres");
        Label labelVendeur = new Label("Vendeur");
        Label labelAcheteur = new Label("Acheteur");
        boutonTrajet = new Button("Trajets du Scenario");
        labelTitre.setId("titre");
        acheteur = new TextArea();
        vendeur = new TextArea();
        menuBar = new MenuBar();
        senario = new Menu("Senario");
        ToggleGroup senar = new ToggleGroup();
        for (int i = 0; i < nbSenar; i++) {
            RadioMenuItem presenario = new RadioMenuItem("Scenario " + i);
            senario.getItems().addAll(presenario);
            presenario.setToggleGroup(senar);
            presenario.setUserData(i);
            presenario.setOnAction(HBoxRoot.getControleur());
        }
        boutonTrajet.setOnAction(HBoxRoot.getControleur());

        menuBar.getMenus().addAll(senario);
        int ligne = 0;
        int taille = 10;
        this.add(menuBar, 0, ligne, 2, 1);
        this.add(labelTitre, 4, ligne++, 4, 1);
        this.add(labelAcheteur,1,ligne,5,1);
        this.add(labelVendeur,6,ligne++,5,1);
        this.add(acheteur, 1, ligne, 5, taille);
        this.add(vendeur, 6, ligne, 5, taille);
        ligne = ligne + taille;
        this.add(boutonTrajet, 7, ligne, 3, 1);
    }

//--------------- Methode suplémentaire pour mettre à jour les données----------------------

    public void majDonnees(Scenario senario){
        acheteur.setText(senario.toStringAcheteur());
        vendeur.setText(senario.toStringVendeur());
    }

}