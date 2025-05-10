package View;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class QuizApp extends Application {
    @Override
    public void start(Stage stage) {
        Label question = new Label("What is 2 + 2?");
        RadioButton a = new RadioButton("3");
        RadioButton b = new RadioButton("4");
        RadioButton c = new RadioButton("5");

        ToggleGroup group = new ToggleGroup();
        a.setToggleGroup(group);
        b.setToggleGroup(group);
        c.setToggleGroup(group);

        Button submit = new Button("Submit");
        Label result = new Label();

        submit.setOnAction(e -> {
            RadioButton selected = (RadioButton) group.getSelectedToggle();
            if (selected != null) {
                if (selected == b) {
                    result.setText("Correct!");
                } else {
                    result.setText("Wrong!");
                }
            } else {
                result.setText("Please choose an answer.");
            }
        });

        VBox layout = new VBox(10, question, a, b, c, submit, result);
        layout.setStyle("-fx-padding: 20;");
        stage.setScene(new Scene(layout, 300, 200));
        stage.setTitle("Simple Quiz");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}