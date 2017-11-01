package sample;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;


/**
 * Created by kiannet on 21.09.2017.
 */
public class WindowForShowingMoreInformation {

     public void showMoreInformation(Product product){
         Stage stageForMoreInformation = new Stage();

         stageForMoreInformation.setTitle(product.getName());
         stageForMoreInformation.setWidth(550);
         stageForMoreInformation.setMinHeight(400);

         Label label = new Label();
         label.setText(product.getName());
         label.getStyleClass().add("label-name");
         ImageView imageView = new ImageView(product.getImage());
         imageView.setFitWidth(150);
         imageView.setFitHeight(150);
         imageView.getStyleClass().add("custom-node");
         imageView.setEffect(new DropShadow(20, Color.BLACK));


         Button buttonForClosingWindowForMoreInformation = new Button();
         buttonForClosingWindowForMoreInformation.setText("CLOSE");
         buttonForClosingWindowForMoreInformation.setOnAction(e -> stageForMoreInformation.close());

         GridPane gridPane = new GridPane();
         gridPane.add(label, 1, 0);
         gridPane.add(buttonForClosingWindowForMoreInformation, 1, 7);
         gridPane.add(imageView, 0, 1);
         gridPane.add(new TextFlow(product.getBigText()), 1,1);
         String forCalories = "Calories: " + String.valueOf(product.getCalories());
         gridPane.add(new Label(forCalories), 1, 2);
         String forPrice = "Price: " + String.valueOf(product.getPrice());
         gridPane.add(new Label(forPrice), 1, 3);

         String forGM;
         if(product.getIfContainsGM()){
             forGM = "GM progucts: " + "+";
         }
         else {
             forGM = "GM products: " + "-";
         }
         gridPane.add(new Label(forGM), 1, 4);
         String forProtein = "Protein: " + String.valueOf(product.getProtein());
         gridPane.add(new Label(forProtein), 1, 5);
         String forFats = "Fats: " + String.valueOf(product.getFats());
         gridPane.add(new Label(forFats), 1, 6);

         Scene scene = new Scene(gridPane);
         scene.getStylesheets().add(getClass().getResource("styleForMoreInformation.css").toExternalForm());

         stageForMoreInformation.setScene(scene);
         stageForMoreInformation.showAndWait();

     }
}
