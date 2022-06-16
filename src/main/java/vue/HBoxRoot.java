package vue;

import javafx.scene.control.*;
import javafx.scene.layout.HBox;

public class HBoxRoot extends HBox {
    private MenuBar menuBar;
    private GridPaneAffichage affichage;
    public HBoxRoot() {
        menuBar = new MenuBar();
        Menu senario = new Menu("Senario");
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
