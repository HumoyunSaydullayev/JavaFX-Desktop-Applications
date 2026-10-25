module com.example.javafx_transformation {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafx_transformation to javafx.fxml;
    exports com.example.javafx_transformation;
}