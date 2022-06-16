package vue;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.io.File;

public class App extends Application{
    public void start(Stage stage)   {
        File fileCss = new File("css"+File.separator+"fond.css");
        HBox root = new HBoxRoot();
        Scene scene = new Scene(root,600,380);
        scene.getStylesheets().add(fileCss.toURI().toString());
        stage.setScene(scene);
        stage.setTitle("Calendrier du mois");
        stage.show();
    }
    public static void main(String[] args) {
        Application.launch(args);
    }
}
