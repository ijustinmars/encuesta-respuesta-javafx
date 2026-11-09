module com.galileo.encuesta {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.galileo.encuesta to javafx.fxml;
    exports com.galileo.encuesta;
}