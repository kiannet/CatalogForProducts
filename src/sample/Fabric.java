package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kiannet on 09.09.2017.
 */
public class Fabric {
    public String name;
    public List<Sweet> sweets;
    public List<Iris> irises;
    public List<Marmelade> marmelades;
    public List<Marshmellow> marshmellows;
    public List<Paste> pastes;
    public ObservableList<Product> allProducts;

    public Fabric(String name, List<Sweet> sweets, List<Iris> irises, List<Marmelade> marmelades,
                  List<Marshmellow> marshmellows, List<Paste> pastes, List<Product> allProducts){
        this.name = name;
        this.sweets = sweets;
        this.irises = irises;
        this.marmelades = marmelades;
        this.marshmellows = marshmellows;
        this.pastes = pastes;

    }

    public ObservableList<Product> getAllProductsNOFiltered(){
        allProducts = FXCollections.observableArrayList();
        allProducts.addAll(sweets);
        allProducts.addAll(irises);
        allProducts.addAll(marmelades);
        allProducts.addAll(marshmellows);
        allProducts.addAll(pastes);
        return allProducts;
    }

    public ObservableList<Product> getAllProductsFILTERED(){
        allProducts = FXCollections.observableArrayList();

        for (int i = 0; i < allProducts.size(); i++) {
            allProducts.remove(i);
        }

        if (PanelForFilters.getPanelForFilters().ifCheckBoxForSweetsIsSelected()){
            allProducts.addAll(sweets);
        }
        if (PanelForFilters.getPanelForFilters().ifCheckBoxForIrisesIsSelected()){
            allProducts.addAll(irises);
        }
        if (PanelForFilters.getPanelForFilters().ifCheckBoxForMarmeladeIsSelected()){
            allProducts.addAll(marmelades);
        }
        if (PanelForFilters.getPanelForFilters().ifCheckBoxForMarshmellowsIsSelected()){
            allProducts.addAll(marshmellows);
        }
        if (PanelForFilters.getPanelForFilters().ifCheckBoxForPasteIsSelected()){
            allProducts.addAll(pastes);
        }

        return allProducts;
    }


}
