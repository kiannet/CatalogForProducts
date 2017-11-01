package sample;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;

/**
 * Created by kiannet on 20.10.2017.
 */
public class WindowForError {

    public void showError(String error){
        Stage stageForMoreInformation = new Stage();

        stageForMoreInformation.setTitle("ERROR");
        stageForMoreInformation.setMinWidth(370);
        stageForMoreInformation.setMinHeight(200);

        Label label = new Label();
        label.setText(error);

        Button buttonForClosingWindow = new Button();
        buttonForClosingWindow.setText("OK");
        buttonForClosingWindow.setOnAction(e -> stageForMoreInformation.close());

        BorderPane borderPane = new BorderPane();

        borderPane.setCenter(label);
        borderPane.setBottom(buttonForClosingWindow);


        Scene scene = new Scene(borderPane);
        scene.getStylesheets().add(getClass().getResource("styleForError.css").toExternalForm());

        stageForMoreInformation.setScene(scene);
        stageForMoreInformation.showAndWait();

    }
}
