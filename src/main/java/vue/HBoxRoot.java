package vue;

import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.HBox;

public class HBoxRoot extends HBox {
    private MenuBar menuBar;
    private GridPaneAffichage affichage;
    public HBoxRoot(){
        menuBar= new MenuBar();
        Menu senario = new Menu("Senario");
        MenuItem presenario= new MenuItem("Senario 1");
        MenuItem secsenario= new MenuItem("Senario 2");
        senario.getItems().addAll(presenario,secsenario);
        menuBar.getMenus().addAll(senario);
        this.getChildren().addAll(menuBar);
    }
}
