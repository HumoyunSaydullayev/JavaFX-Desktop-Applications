module com.example.javafx_translation {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafx_translation to javafx.fxml;
    exports com.example.javafx_translation;
}