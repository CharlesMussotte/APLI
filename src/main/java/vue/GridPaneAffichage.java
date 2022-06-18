package vue;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import modele.Scenario;

public class GridPaneAffichage extends GridPane {
    TextArea trajet;
    Menu senario;
    MenuBar menuBar;
    Label labelTrajet;
    Label labelNombreScenario;
    Button boutonDonné;
    int x;
    int a;
    public GridPaneAffichage() {
        a = 26;
        Label labelTitre = new Label("Association des Pokemonistes Libres");
        labelNombreScenario = new Label("Il y a " + a + " trajet possible");
        boutonDonné = new Button("Donnée du Scenario");
        labelTitre.setId("titre");
        trajet = new TextArea();
        trajet.setText("Taille du trajet: _ km");
        menuBar = new MenuBar();
        Button boutonNext = new Button(">");
        Button boutonBefore = new Button("<");
        Button boutonLast = new Button(">>");
        Button boutonnFirst = new Button("<<");
        x = 1;
        labelTrajet = new Label("Trajet numéro "+x);

        senario = new Menu("Senario");
        ToggleGroup senar = new ToggleGroup();
        for (int i = 0; i < 5; i++) {
            RadioMenuItem presenario = new RadioMenuItem("Senario " + i);
            senario.getItems().addAll(presenario);
            presenario.setToggleGroup(senar);
            presenario.setOnAction(HBoxRoot.getControleur());
        }

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
        this.add(boutonDonné, 8, ligne, 3, 1);
        boutonNext.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if (x<a){
                x+=1;
                labelTrajet.setText("Trajet numéro "+x);
                }
            }
        });
        boutonBefore.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if (x>1) {
                    x -= 1;
                    labelTrajet.setText("Trajet numéro " + x);
                }
            }
        });
        boutonnFirst.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                    x = 1;
                    labelTrajet.setText("Trajet numéro " + x);
            }
        });
        boutonLast.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                    x = a;
                    labelTrajet.setText("Trajet numéro " + x);
            }
        });
    }
    public void updateScenario(Scenario parScenar){
        trajet.setText(parScenar.toString());
    }

    public Menu getMenu() {
        return senario;
    }
}
