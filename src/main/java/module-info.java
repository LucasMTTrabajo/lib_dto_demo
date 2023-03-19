module com.example.lib_dto_demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lib_dto_demo to javafx.fxml;
    exports com.example.lib_dto_demo;
}