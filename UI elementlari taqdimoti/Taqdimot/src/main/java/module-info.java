module com.example.taqdimot {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;
    requires javafx.web;


    opens com.example.taqdimot to javafx.fxml;
    exports com.example.taqdimot;
}