import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Random;

public class GTNGame extends Application {

    @Override
    public void start(Stage stage) {
        Random random = new Random();
        int randomNumber = random.nextInt(101);

        Label titleLabel = new Label("Guess the Number (0-100)");
        TextField textField = new TextField();
        textField.setPromptText("Enter a number");
        textField.setMaxWidth(100);
        textField.setMaxHeight(100);
        Button checkButton = new Button("Check");
        Label resultLabel = new Label();

        checkButton.setOnAction(event -> {
            try {
                int userInput = Integer.parseInt(textField.getText());

                if (userInput == randomNumber) {
                    resultLabel.setText(" Correct! You guessed it.");
                } else if (userInput > randomNumber) {
                    resultLabel.setText("Too High! Try again.");
                } else {
                    resultLabel.setText("Too Low! Try again.");
                }

            } catch (NumberFormatException e) {
                resultLabel.setText("Please enter a valid number.");
            }
        });

        VBox vBox = new VBox(10, titleLabel, textField, checkButton, resultLabel);
        vBox.setAlignment(Pos.CENTER);
        Scene scene = new Scene(vBox, 400, 300);
        vBox.setStyle(
                "-fx-background-image: url('.jpeg');" + // u can add ur customized photo or whatever if u want
                    "-fx-background-repeat:no-repeat;"+
                    "-fx-background-size:cover;"+
                    "-fx-background-color:lightblue;"

        );
        stage.setTitle("Guess the Number Game");

        stage.setScene(scene);
        stage.setFullScreen(true);

        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
