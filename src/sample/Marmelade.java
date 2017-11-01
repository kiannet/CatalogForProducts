package sample;

import javafx.scene.image.Image;

import javafx.scene.text.Text;

/**
 * Created by kiannet on 09.09.2017.
 */
public class Marmelade extends Product implements ToBeAProduct{
    private String name;
    private int calories;
    private double price;
    private boolean ifContainsGM;
    private int protein;
    private int fats;
    private Text text;
    private Text bigText;
    private Image image;


    public Marmelade(String n, int c, double p, boolean gm, int protein, int fats, Text t, Text bt, Image image){
        this.name = n;
        this.calories = c;
        this.price = p;
        this.ifContainsGM = gm;
        this.protein = protein;
        this.fats = fats;
        this.text = t;
        this.bigText = bt;
        this.image = image;

    }

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

    public Text getBigText() {return this.bigText; }

    public Image getImage(){
        return this.image;
    }
}
