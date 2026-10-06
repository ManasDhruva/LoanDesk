package loandesk;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

// Temporary window to confirm the JavaFX setup works. Replaced in the next step.
public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        Label label = new Label("LoanDesk setup test");
        Button button = new Button("Click me");
        button.setOnAction(event -> label.setText("JavaFX is working"));

        VBox root = new VBox(10, label, button);
        root.setPadding(new Insets(20));

        primaryStage.setTitle("LoanDesk");
        primaryStage.setScene(new Scene(root, 300, 150));
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}