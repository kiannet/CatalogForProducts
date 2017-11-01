package sample;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.image.*;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
import javafx.stage.Stage;

import java.awt.*;
import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.util.*;
import java.util.List;

/**
 * Created by kiannet on 21.09.2017.
 */
public class WindowForComparison {
    public List <PanelForAComparedProduct> panelsForAComparedProduct = new ArrayList<>();

    public void showWindowForComparison(Fabric currentFabric){
        Stage stageForComparison = new Stage();

        stageForComparison.setTitle("COMPARISON");
        stageForComparison.setMinWidth(500);
        stageForComparison.setMinHeight(700);

        Label label = new Label();
        label.getStyleClass().add("label-main");
        label.setText("THEY WERE COMPARED:");
        Button buttonForClosingWindowForComparison = new Button();
        buttonForClosingWindowForComparison.setText("CLOSE");
        buttonForClosingWindowForComparison.setOnAction(e -> stageForComparison.close());

        GridPane gridPane = new GridPane();
        gridPane.add(label, 0, 0);
        gridPane.add(buttonForClosingWindowForComparison, 1, 2);

        List<Product> listOfSelectedProducts = MainPanel.getMainPanel().getPanelForProducts().getAllProductsWithSelectedBoxes(currentFabric);

        for (int i = 0; i < listOfSelectedProducts.size(); i++){
            PanelForAComparedProduct panelForAComparedProduct = new PanelForAComparedProduct(listOfSelectedProducts.get(i));

            panelsForAComparedProduct.add(panelForAComparedProduct);

            gridPane.add(panelForAComparedProduct, i, 1);
        }

        this.addComparedLabels(listOfSelectedProducts, panelsForAComparedProduct.get(0), panelsForAComparedProduct.get(1));


        Scene scene = new Scene(gridPane);
        scene.getStylesheets().add(getClass().getResource("styleForCompare.css").toExternalForm());
        stageForComparison.setScene(scene);
        stageForComparison.showAndWait();
    }

    public void addComparedLabels(List<Product> listOfSelectedProducts, PanelForAComparedProduct panel1, PanelForAComparedProduct panel2){
        Label price1 = new Label("PRICE");
        price1.getStyleClass().add("label-all");

        Label price2 = new Label("PRICE");
        price2.getStyleClass().add("label-all");

        Label calories1 = new Label("CALORIES");
        calories1.getStyleClass().add("label-all");

        Label calories2 = new Label("CALORIES");
        calories2.getStyleClass().add("label-all");

        Label gm1 = new Label("GM");
        gm1.getStyleClass().add("label-all");

        Label gm2 = new Label("GM");
        gm2.getStyleClass().add("label-all");

        Label protein1 = new Label("PROTEIN");
        protein1.getStyleClass().add("label-all");

        Label protein2 = new Label("PROTEIN");
        protein2.getStyleClass().add("label-all");

        Label fats1 = new Label("FATS");
        fats1.getStyleClass().add("label-all");

        Label fats2 = new Label("FATS");
        fats2.getStyleClass().add("label-all");

        for (int i = 0; i < listOfSelectedProducts.size()-1; i++){

            if (listOfSelectedProducts.get(i).getPrice() >= listOfSelectedProducts.get(i+1).getPrice()){
                String s1 = String.valueOf(listOfSelectedProducts.get(i).getPrice());
                Label l1 = new Label(s1);
                l1.getStyleClass().add("label-bad");
                panel1.add(price1, 0, 2);
                panel1.add(l1, 0, 3);

                String s2 = String.valueOf(listOfSelectedProducts.get(i+1).getPrice());
                Label l2 = new Label(s2);
                l2.getStyleClass().add("label-good");
                panel2.add(price2, 0, 2);
                panel2.add(l2, 0, 3);
            }
            else{
                String s1 = String.valueOf(listOfSelectedProducts.get(i).getPrice());
                Label l1 = new Label(s1);
                l1.getStyleClass().add("label-good");
                panel1.add(price1, 0, 2);
                panel1.add(l1, 0, 3);

                String s2 = String.valueOf(listOfSelectedProducts.get(i+1).getPrice());
                Label l2 = new Label(s2);
                l2.getStyleClass().add("label-bad");
                panel2.add(price2, 0, 2);
                panel2.add(l2, 0, 3);

            }

            if (listOfSelectedProducts.get(i).getCalories() >= listOfSelectedProducts.get(i+1).getCalories()){
                String s1 = String.valueOf(listOfSelectedProducts.get(i).getCalories());
                Label l1 = new Label(s1);
                l1.getStyleClass().add("label-bad");
                panel1.add(calories1, 0, 4);
                panel1.add(l1, 0, 5);

                String s2 = String.valueOf(listOfSelectedProducts.get(i+1).getCalories());
                Label l2 = new Label(s2);
                l2.getStyleClass().add("label-good");
                panel2.add(calories2, 0, 4);
                panel2.add(l2, 0, 5);
            }
            else{
                String s1 = String.valueOf(listOfSelectedProducts.get(i).getCalories());
                Label l1 = new Label(s1);
                l1.getStyleClass().add("label-good");
                panel1.add(calories1, 0, 4);
                panel1.add(l1, 0, 5);

                String s2 = String.valueOf(listOfSelectedProducts.get(i+1).getCalories());
                Label l2 = new Label(s2);
                l2.getStyleClass().add("label-bad");
                panel2.add(calories2, 0, 4);
                panel2.add(l2, 0, 5);

            }

            if (listOfSelectedProducts.get(i).getIfContainsGM() == true){
                String s1 = "Contains";
                Label l1 = new Label(s1);
                l1.getStyleClass().add("label-bad");
                panel1.add(gm1, 0, 6);
                panel1.add(l1, 0, 7);

                String s2 = "Doesn't contain";
                Label l2 = new Label(s2);
                l2.getStyleClass().add("label-good");
                panel2.add(gm2, 0, 6);
                panel2.add(l2, 0, 7);
            }
            else{
                String s1 = "Doesn't contain";
                Label l1 = new Label(s1);
                l1.getStyleClass().add("label-good");
                panel1.add(gm1, 0, 6);
                panel1.add(l1, 0, 7);

                String s2 = "Contains";
                Label l2 = new Label(s2);
                l2.getStyleClass().add("label-bad");
                panel2.add(gm2, 0, 6);
                panel2.add(l2, 0, 7);

            }

            if (listOfSelectedProducts.get(i).getProtein() >= listOfSelectedProducts.get(i+1).getProtein()){
                String s1 = String.valueOf(listOfSelectedProducts.get(i).getProtein());
                Label l1 = new Label(s1);
                l1.getStyleClass().add("label-good");
                panel1.add(protein1, 0, 8);
                panel1.add(l1, 0, 9);

                String s2 = String.valueOf(listOfSelectedProducts.get(i+1).getProtein());
                Label l2 = new Label(s2);
                l2.getStyleClass().add("label-bad");
                panel2.add(protein2, 0, 8);
                panel2.add(l2, 0, 9);
            }
            else{
                String s1 = String.valueOf(listOfSelectedProducts.get(i).getProtein());
                Label l1 = new Label(s1);
                l1.getStyleClass().add("label-bad");
                panel1.add(protein1, 0, 8);
                panel1.add(l1, 0, 9);

                String s2 = String.valueOf(listOfSelectedProducts.get(i+1).getProtein());
                Label l2 = new Label(s2);
                l2.getStyleClass().add("label-good");
                panel2.add(protein2, 0, 8);
                panel2.add(l2, 0, 9);

            }

            if (listOfSelectedProducts.get(i).getFats() >= listOfSelectedProducts.get(i+1).getFats()){
                String s1 = String.valueOf(listOfSelectedProducts.get(i).getFats());
                Label l1 = new Label(s1);
                l1.getStyleClass().add("label-bad");
                panel1.add(fats1, 0, 10);
                panel1.add(l1, 0, 11);

                String s2 = String.valueOf(listOfSelectedProducts.get(i+1).getFats());
                Label l2 = new Label(s2);
                l2.getStyleClass().add("label-good");
                panel2.add(fats2, 0, 10);
                panel2.add(l2, 0, 11);
            }
            else{
                String s1 = String.valueOf(listOfSelectedProducts.get(i).getFats());
                Label l1 = new Label(s1);
                l1.getStyleClass().add("label-good");
                panel1.add(fats1, 0, 10);
                panel1.add(l1, 0, 11);

                String s2 = String.valueOf(listOfSelectedProducts.get(i+1).getFats());
                Label l2 = new Label(s2);
                l2.getStyleClass().add("label-bad");
                panel2.add(fats2, 0, 10);
                panel2.add(l2, 0, 11);

            }

        }
    }

}
