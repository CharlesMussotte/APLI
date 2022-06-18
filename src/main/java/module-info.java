module com.example.apli {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires java.desktop;

    opens com.example.apli to javafx.fxml;
    exports com.example.apli;
    exports vue;
}