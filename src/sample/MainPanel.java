package sample;

import javafx.collections.ObservableList;
import javafx.event.EventType;
import javafx.geometry.Insets;
import javafx.scene.Cursor;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

import java.io.File;
import java.util.List;


/**
 * Created by kiannet on 13.09.2017.
 */
public class MainPanel extends GridPane {
    private static MainPanel mainPanel = new MainPanel();

    private Label labelForFabric = new Label();
    private ComboBox comboBox;
    public Button button = new Button("Choose");
    public File file = new File("resources/allsweets.png");
    public Image image = new Image(file.toURI().toString());
    public ImageView imageView = new ImageView(image);
    public PanelForProducts panelForProducts = PanelForProducts.getPanelForProducts();
    public ScrollPane scrollPane = new ScrollPane();

    public Fabric currentFabric = null;


    public MainPanel() {

        add(imageView, 1, 0);
        labelForFabric.setText("Choose the fabric");
        add(labelForFabric, 0, 1);
        add(createComboBox(), 1, 1);
        add(button, 2, 1);
        setMinWidth(800);
        setMinHeight(600);
        scrollPane.setContent(panelForProducts);
        add(scrollPane, 1, 2);

        button.setOnAction(e -> {
            Fabric fabric = getValueFromComboBox();
            if (fabric != null) {
                panelForProducts.addAllProducts((panelForProducts.createPanelsForAProduct(fabric)), panelForProducts);
            } else {
                WindowForError windowForError = new WindowForError();
                windowForError.showError("CHOOSE SOMETHING PLS");
            }
            });

        PanelForFilters.getPanelForFilters().getButton1().setOnAction(e -> {
            Fabric valueFromComboBox = getValueFromComboBox();
            ObservableList<PanelForAProduct> panelsForAProductFILTERED = panelForProducts.getPanelsForAProductFILTERED(valueFromComboBox);
            panelForProducts.getChildren().clear();
            panelForProducts.addAllProducts(panelsForAProductFILTERED, panelForProducts);
        });



        PanelForFilters.getPanelForFilters().getButton().setOnAction(e ->{
            List<Product> listOfSelectedProducts = panelForProducts.getAllProductsWithSelectedBoxes(currentFabric);
            if (listOfSelectedProducts.size() > 2){
                WindowForError windowForError = new WindowForError();
                windowForError.showError("CHOOSE ONLY 2 PRODUCTS");
            }else if (listOfSelectedProducts.size() < 2) {
                WindowForError windowForError = new WindowForError();
                windowForError.showError("CHOOSE 2 PRODUCTS");
            }else
                {
                    new WindowForComparison().showWindowForComparison(getValueFromComboBox());
                }

        });
    }

    public ComboBox createComboBox() {
        comboBox = new ComboBox();

        for (int i = 0; i < HereWeCreateEverything.fabrics.size(); i++) {

            comboBox.getItems().add(HereWeCreateEverything.fabrics.get(i).name);
        }

        return comboBox;
    }

    public Fabric getValueFromComboBox() {
        Object value = comboBox.getValue();
        String name;
        if (value != null) {
            name = value.toString();

            for (int i = 0; i < HereWeCreateEverything.fabrics.size(); i++) {
                if (name.equals(HereWeCreateEverything.fabrics.get(i).name)) {
                    currentFabric = HereWeCreateEverything.fabrics.get(i);
                }

            }
        }

        return currentFabric;
    }

    public static MainPanel getMainPanel() {
        return mainPanel;
    }

    public PanelForProducts getPanelForProducts(){
        return panelForProducts;
    }


}
