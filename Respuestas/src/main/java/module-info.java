module com.galileo.respuestas {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.galileo.respuestas to javafx.fxml;
    exports com.galileo.respuestas;
}