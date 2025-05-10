module Activity {
    requires javafx.controls;
    requires javafx.fxml;

    opens View to javafx.fxml; // Open the View package for reflection by JavaFX

    exports View; // Export the View package to make it accessible from other modules
}

