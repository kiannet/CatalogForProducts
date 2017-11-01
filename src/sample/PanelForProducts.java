package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.CheckBox;
import javafx.scene.image.Image;
import javafx.scene.layout.*;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

/**
 * Created by kiannet on 14.09.2017.
 */
public class PanelForProducts extends GridPane{

    private static PanelForProducts panelForProducts = new PanelForProducts();

    public ObservableList<PanelForAProduct> panelsForAProduct;

    private PanelForProducts(){

    }

    public static PanelForProducts getPanelForProducts() {
        return panelForProducts;
    }

    public PanelForProducts addAllProducts(ObservableList<PanelForAProduct> panelsForAProduct, PanelForProducts panelForProducts){

        for (int i = 0; i < panelsForAProduct.size(); i++){
        panelForProducts.add(panelsForAProduct.get(i), 0, i);
        }

        return panelForProducts;
    }

    public ObservableList<PanelForAProduct> createPanelsForAProduct(Fabric currentFabric){

        panelsForAProduct = FXCollections.observableArrayList();
        for (int i = 0; i < currentFabric.getAllProductsNOFiltered().size(); i++) {
            PanelForAProduct panelForAProduct = new PanelForAProduct(currentFabric.getAllProductsNOFiltered().get(i));

            panelsForAProduct.add(panelForAProduct);
        }

        return panelsForAProduct;
    }


    public ObservableList<PanelForAProduct> getPanelsForAProduct(Fabric currentFabric){

        if (panelsForAProduct == null) {
            createPanelsForAProduct(currentFabric);
        }

        return panelsForAProduct;
    }

    public ObservableList<PanelForAProduct> getPanelsForAProductFILTERED(Fabric currentFabric){

        panelsForAProduct = FXCollections.observableArrayList();

        for (int i = 0; i < currentFabric.getAllProductsFILTERED().size(); i++){
            panelsForAProduct.add(new PanelForAProduct(currentFabric.getAllProductsFILTERED().get(i)));
        }
        return panelsForAProduct;
    }

    public List<Product> getAllProductsWithSelectedBoxes(Fabric currentFabric){
        List<Product> productsWithSelectedBoxes = new ArrayList<>();
        panelsForAProduct = getPanelsForAProduct(currentFabric);

        for (int i = 0; i < panelsForAProduct.size(); i++){
            if (panelsForAProduct.get(i).getCheckbox().isSelected()){

                productsWithSelectedBoxes.add(currentFabric.allProducts.get(i));
            }

        }

        return productsWithSelectedBoxes;
    }

}
