module com.example.ap011 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.scripting;
    requires commons.math3;


    opens com.example.ap011 to javafx.fxml;
    exports com.example.ap011;
}