package vue;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.io.File;

public class App extends Application{
    public void start(Stage stage)   {
        HBox root = new HBoxRoot();
        Scene scene = new Scene(root,670,380);
        stage.setScene(scene);
        stage.setTitle("APLI");
        stage.show();
    }
    public static void main(String[] args) {
        Application.launch(args);
    }
}
