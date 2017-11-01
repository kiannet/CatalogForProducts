package sample;

import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.*;
import javafx.scene.paint.Color;
import javafx.scene.text.TextFlow;

import java.awt.*;
import java.util.List;


/**
 * Created by kiannet on 06.10.2017.
 */
public class PanelForAComparedProduct extends GridPane {

    public PanelForAComparedProduct(Product product){

        setWidth(80);
        setHeight(100);
        add(createImageView(product.getImage()), 0, 0);
        Label name = new Label(product.getName());
        name.getStyleClass().add("label-name");
        add(name, 0,1);

    }

    public ImageView createImageView(Image image){

        ImageView imageView = new ImageView(image);
        imageView.setFitHeight(100);
        imageView.setFitWidth(100);
        return imageView;

    }
}
