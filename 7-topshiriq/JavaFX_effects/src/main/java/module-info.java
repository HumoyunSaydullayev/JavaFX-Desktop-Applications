module com.example.javafx_effects {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafx_effects to javafx.fxml;
    exports com.example.javafx_effects;
}