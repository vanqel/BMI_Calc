module com.example.java_task01 {
    requires javafx.controls;
    requires javafx.fxml;



    opens com.example.java_task01 to javafx.fxml;
    exports com.example.java_task01;
    exports com.example.java_task05;
    opens com.example.java_task05 to javafx.fxml;
}