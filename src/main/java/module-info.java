module com.braian.latti {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.braian.latti to javafx.fxml;
    exports com.braian.latti;
}