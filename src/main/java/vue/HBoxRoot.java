package vue;

import javafx.scene.control.*;
import javafx.scene.layout.HBox;

public class HBoxRoot extends HBox {
    private MenuBar menuBar;
    private GridPaneAffichage affichage;
    public HBoxRoot() {
        menuBar = new MenuBar();
        Menu senario = new Menu("Senario");
        ToggleGroup senar = new ToggleGroup();
        for (int i = 0; i < 4; i++) {
            RadioMenuItem presenario = new RadioMenuItem("Senario " + i);
            senario.getItems().addAll(presenario);
            presenario.setToggleGroup(senar);
        }
        menuBar.getMenus().addAll(senario);
        this.getChildren().addAll(menuBar);
    }
    public MenuBar getMenuBar() {
        return menuBar;
    }
    public GridPaneAffichage getAffichage() {
        return affichage;
    }
}
