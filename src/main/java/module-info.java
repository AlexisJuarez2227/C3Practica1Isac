module com.example.consola {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.consola to javafx.fxml;
    exports com.example.consola;
}