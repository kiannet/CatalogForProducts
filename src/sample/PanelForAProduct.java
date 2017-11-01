package sample;

import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.*;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;

import java.io.File;


/**
 * Created by kiannet on 09.09.2017.
 */
public class PanelForAProduct extends GridPane {
    private CheckBox checkbox;
    public Button button;

    public PanelForAProduct(Product product){
        add(createImageView(product.getImage()), 0, 1);
        add(new Label(product.getName()), 1,0);
        add(new TextFlow(product.getText()), 1, 1);
        add(createCheckBox(), 2, 2);
        add(createButton(), 1, 2);
        setWidth(100);
        setHeight(80);

        File file = new File("C:/Users/kiannet/Desktop/N.png");
        Image image = new Image(file.toURI().toString());
        BackgroundSize backgroundSize = new BackgroundSize(100, 80, true, true, true, false);
        BackgroundImage backgroundImage = new BackgroundImage(image, BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, backgroundSize);
        Background background = new Background(backgroundImage);
        setBackground(background);

        Product currentProduct = product;
        setBackground(new Background(new BackgroundFill(Color.WHITESMOKE, CornerRadii.EMPTY, Insets.EMPTY)));
        button.setOnAction(e -> new WindowForShowingMoreInformation().showMoreInformation(currentProduct));

    }

    public ImageView createImageView(Image image){
        ImageView imageView = new ImageView();
        imageView.setImage(image);
        imageView.setFitHeight(80);
        imageView.setFitWidth(80);
        return  imageView;
    }

    public CheckBox createCheckBox(){
        checkbox = new CheckBox();
        return checkbox;
    }

    public Button createButton(){
        button = new Button("MORE");
        return  button;
    }

    public CheckBox getCheckbox(){
        return checkbox;
    }


}
