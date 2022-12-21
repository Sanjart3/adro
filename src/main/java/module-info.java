module com.example.adro {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.adro to javafx.fxml;
    exports com.example.adro;
}