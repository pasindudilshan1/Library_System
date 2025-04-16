module com.example.library_system {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires java.sql;
    opens com.example.library_system.Controller to javafx.fxml;

    opens com.example.library_system to javafx.fxml;
    exports com.example.library_system;
}