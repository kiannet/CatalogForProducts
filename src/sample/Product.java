package sample;

import javafx.scene.image.Image;

import javafx.scene.text.Text;

/**
 * Created by kiannet on 22.09.2017.
 */
public class Product {
    private String name;
    private int calories;
    private double price;
    private boolean ifContainsGM;
    private int protein;
    private int fats;
    private Text text;
    private Text bigText;
    private Image image;


    public String getName(){
        return this.name;
    }

    public int getCalories(){
        return this.calories;
    }

    public double getPrice(){
        return this.price;
    }

    public boolean getIfContainsGM(){ return this.ifContainsGM; }

    public int getProtein(){ return  this.protein; }

    public int getFats(){ return  this.fats; }

    public Text getText(){
        return this.text;
    }

    public Text getBigText() { return  this.bigText; }

    public Image getImage(){
        return this.image;
    }
}
