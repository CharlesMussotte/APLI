module com.example.apli {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.apli to javafx.fxml;
    exports com.example.apli;
}