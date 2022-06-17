package vue;

import javafx.scene.control.*;
import javafx.scene.layout.GridPane;

public class GridPaneAffichage extends GridPane {
    Label labelTitre;
    TextArea trajet;
    MenuBar menuBar;
    Label labelTrajet;
    Label labelNombreScenario;
    Button boutonDonné;
    public GridPaneAffichage(){
        int a= 26;
        labelTitre = new Label("Association des Pokemonistes Libres");
        labelNombreScenario = new Label("Il y a "+a+" trajet possible");
        boutonDonné = new Button("Donnée du Scenario");
        labelTitre.setId("titre");
        trajet = new TextArea();
        trajet.setText("Taille du trajet: _ km");
        menuBar = new MenuBar();
        Button boutonNext=new Button(">");
        Button boutonBefore=new Button("<");
        Button boutonLast=new Button(">>");
        Button boutonnFirst=new Button("<<");
        labelTrajet = new Label("Trajet numéro");

        Menu senario = new Menu("Senario");
        ToggleGroup senar = new ToggleGroup();
        for (int i = 0; i < 5; i++) {
            RadioMenuItem presenario = new RadioMenuItem("Senario " + i);
            senario.getItems().addAll(presenario);
            presenario.setToggleGroup(senar);
        }

        menuBar.getMenus().addAll(senario);
        int ligne = 0;
        int taille = 10;
        this.add(menuBar,0,ligne,2,1);
        this.add(labelTitre,4,ligne++,4,1);
        this.add(trajet,1,ligne,10,taille);
        ligne = ligne+taille;
        this.add(boutonnFirst,2,ligne);
        this.add(boutonBefore,3,ligne);
        this.add(labelTrajet,4,ligne,2,1);
        this.add(boutonNext,6,ligne);
        this.add(boutonLast,7,ligne++);
        this.add(labelNombreScenario,0,ligne,4,1);
        this.add(boutonDonné,8,ligne,3,1);
    }
}
