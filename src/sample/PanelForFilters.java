package sample;

import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

/**
 * Created by kiannet on 13.09.2017.
 */
public class PanelForFilters extends GridPane{
    private static PanelForFilters panelForFilters = new PanelForFilters();
    private Label label = new Label("Filters:");
    private CheckBox checkBox1 = new CheckBox("Sweets");
    private CheckBox checkBox2 = new CheckBox("Marshmellow");
    private CheckBox checkBox3 = new CheckBox("Marmelade");
    private CheckBox checkBox4 = new CheckBox("Iris");
    private CheckBox checkBox5 = new CheckBox("Paste");
    private Button button = new Button("Compare");
    private Button button1 = new Button("Filter");

    private PanelForFilters(){

        add(label, 0 ,0);
        add(checkBox1, 0, 1);
        add(checkBox2, 0, 2);
        add(checkBox3, 0, 3);
        add(checkBox4, 0, 4);
        add(checkBox5, 0, 5);
        add(button, 0, 7);
        add(button1, 0, 6);

    }

    public Button getButton(){
        return button;
    }

    public Button getButton1(){
        return button1;
    }

    public boolean ifCheckBoxForSweetsIsSelected(){
        return checkBox1.isSelected();

    }

    public boolean ifCheckBoxForIrisesIsSelected(){
        return checkBox4.isSelected();
    }

    public boolean ifCheckBoxForMarshmellowsIsSelected(){
        return checkBox2.isSelected();
    }

    public boolean ifCheckBoxForMarmeladeIsSelected(){
        return checkBox3.isSelected();
    }

    public boolean ifCheckBoxForPasteIsSelected(){
        return checkBox5.isSelected();
    }

    public static PanelForFilters getPanelForFilters(){
        return panelForFilters;
    }

}
