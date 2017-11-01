package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.awt.*;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        HereWeCreateEverything.addEverythingForFabrics();
        MainPanel mainPanel = new MainPanel();
        primaryStage.setTitle("allSWEETShere");
        mainPanel.add(PanelForFilters.getPanelForFilters(), 0,2);
        Scene scene = new Scene(mainPanel);
        scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
