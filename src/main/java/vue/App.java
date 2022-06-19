package vue;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import modele.Lecture;

import java.io.File;
import java.io.IOException;

public class App extends Application{
    public void start(Stage stage) throws IOException {
        File fileCss = new File("css"+File.separator+"gridpane.css");
        HBox root = new HBoxRoot();
        Scene scene = new Scene(root,500,380);
        scene.getStylesheets().add(fileCss.toURI().toString());
        stage.setScene(scene);
        stage.setTitle("APLI");
        stage.show();
    }
    public static void main(String[] args) {
        Application.launch(args);
    }
}
