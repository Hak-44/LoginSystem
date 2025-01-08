module org.example.loginfx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens org.example.loginfx to javafx.fxml;
    exports org.example.loginfx;
}