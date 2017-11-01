package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.text.Text;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

/**
 * Created by kiannet on 22.09.2017.
 */
public class HereWeCreateEverything {

    public static List<Fabric> fabrics = new ArrayList<>();

    public static void addEverythingForFabrics(){
        List<Sweet> sweetsKrasnyiMozyryanin = new ArrayList<>();
        List<Iris> irisesKrasnyiMozyryanin = new ArrayList<>();
        List<Marmelade> marmeladesKrasnyiMozyryanin = new ArrayList<>();
        List<Marshmellow> marshmellowsKrasnyiMozyryanin = new ArrayList<>();
        List<Paste> pastesKrasnyiMozyryanin = new ArrayList<>();
        ObservableList<Product> productsKrasnyiMozyryanin = FXCollections.observableArrayList();

        Fabric KrasnyiMozyryanin = new Fabric("Красный Мозырянин", sweetsKrasnyiMozyryanin, irisesKrasnyiMozyryanin,
                                                marmeladesKrasnyiMozyryanin, marshmellowsKrasnyiMozyryanin,pastesKrasnyiMozyryanin, productsKrasnyiMozyryanin);

        File file = new File("resources/sweet1.jpg");
        Image image = new Image(file.toURI().toString());


        File file1 = new File("resources/iris1.jpg");
        Image image1 = new Image(file1.toURI().toString());

        File file2 = new File("resources/marmelade1.jpg");
        Image image2 = new Image(file2.toURI().toString());

        File file3 = new File("resources/marshmellow1.jpg");
        Image image3 = new Image(file3.toURI().toString());

        File file4 = new File("resources/paste1.jpg");
        Image image4 = new Image(file4.toURI().toString());

        File file5 = new File("resources/iris2.jpg");
        Image image5 = new Image(file5.toURI().toString());

        File file6 = new File("resources/marshmellow2.jpg");
        Image image6 = new Image(file6.toURI().toString());

        File file7 = new File("resources/marshmellow3.jpg");
        Image image7 = new Image(file7.toURI().toString());

        File file8 = new File("resources/paste2.jpg");
        Image image8 = new Image(file8.toURI().toString());

        Text text1 = new Text();
        text1.setText("Тягучие конфеты из сгущеного молока");

        Text text2 = new Text();
        text2.setText("Сливочный вкус детства");

        Text text3 = new Text();
        text3.setText("Сочные ароматные мармеладные дольки");

        Text text4 = new Text();
        text4.setText("Нежный вкус мягкого зефира");

        Text text5 = new Text();
        text5.setText("Мягкое нежно суфле");

        Text bigText1 = new Text();
        bigText1.setText("Конечно же, такой рецепт приготовления домашних конфет “Коровка” допускает ваши дополнения, можете добавить орешки, изюм, например. Я этого не делала, так как хотела показать вам классический рецепт домашних конфет “Коровка”, а ведь они были без начинок! Кстати, хотела еще указать на время подготовки, я люблю, чтобы конфеты были твердые и рассасывались, но если будете уваривать меньше, получите нежные сливочные \"коровки\" с кремовой начинкой. ");


        Text bigText2 = new Text();
        bigText2.setText("Конечно же, такой рецепт приготовления домашних конфет “Коровка” допускает ваши дополнения, можете добавить орешки, изюм, например. Я этого не делала, так как хотела показать вам классический рецепт домашних конфет “Коровка”, а ведь они были без начинок! Кстати, хотела еще указать на время подготовки, я люблю, чтобы конфеты были твердые и рассасывались, но если будете уваривать меньше, получите нежные сливочные \"коровки\" с кремовой начинкой. ");


        Text bigText3 = new Text();
        bigText3.setText("Конечно же, такой рецепт приготовления домашних конфет “Коровка” допускает ваши дополнения, можете добавить орешки, изюм, например. Я этого не делала, так как хотела показать вам классический рецепт домашних конфет “Коровка”, а ведь они были без начинок! Кстати, хотела еще указать на время подготовки, я люблю, чтобы конфеты были твердые и рассасывались, но если будете уваривать меньше, получите нежные сливочные \"коровки\" с кремовой начинкой. ");


        Text bigText4 = new Text();
        bigText4.setText("Конечно же, такой рецепт приготовления домашних конфет “Коровка” допускает ваши дополнения, можете добавить орешки, изюм, например. Я этого не делала, так как хотела показать вам классический рецепт домашних конфет “Коровка”, а ведь они были без начинок! Кстати, хотела еще указать на время подготовки, я люблю, чтобы конфеты были твердые и рассасывались, но если будете уваривать меньше, получите нежные сливочные \"коровки\" с кремовой начинкой. ");


        Text bigText5 = new Text();
        bigText5.setText("Конечно же, такой рецепт приготовления домашних конфет “Коровка” допускает ваши дополнения, можете добавить орешки, изюм, например. Я этого не делала, так как хотела показать вам классический рецепт домашних конфет “Коровка”, а ведь они были без начинок! Кстати, хотела еще указать на время подготовки, я люблю, чтобы конфеты были твердые и рассасывались, но если будете уваривать меньше, получите нежные сливочные \"коровки\" с кремовой начинкой. ");

        Text bigText6 = new Text();
        bigText6.setText("Конечно же, такой рецепт приготовления домашних конфет “Коровка” допускает ваши дополнения, можете добавить орешки, изюм, например. Я этого не делала, так как хотела показать вам классический рецепт домашних конфет “Коровка”, а ведь они были без начинок! Кстати, хотела еще указать на время подготовки, я люблю, чтобы конфеты были твердые и рассасывались, но если будете уваривать меньше, получите нежные сливочные \"коровки\" с кремовой начинкой. ");

        Text bigText7 = new Text();
        bigText6.setText("Конечно же, такой рецепт приготовления домашних конфет “Коровка” допускает ваши дополнения, можете добавить орешки, изюм, например. Я этого не делала, так как хотела показать вам классический рецепт домашних конфет “Коровка”, а ведь они были без начинок! Кстати, хотела еще указать на время подготовки, я люблю, чтобы конфеты были твердые и рассасывались, но если будете уваривать меньше, получите нежные сливочные \"коровки\" с кремовой начинкой. ");

        Text bigText8 = new Text();
        bigText6.setText("Конечно же, такой рецепт приготовления домашних конфет “Коровка” допускает ваши дополнения, можете добавить орешки, изюм, например. Я этого не делала, так как хотела показать вам классический рецепт домашних конфет “Коровка”, а ведь они были без начинок! Кстати, хотела еще указать на время подготовки, я люблю, чтобы конфеты были твердые и рассасывались, но если будете уваривать меньше, получите нежные сливочные \"коровки\" с кремовой начинкой. ");

        Text bigText9 = new Text();
        bigText6.setText("Конечно же, такой рецепт приготовления домашних конфет “Коровка” допускает ваши дополнения, можете добавить орешки, изюм, например. Я этого не делала, так как хотела показать вам классический рецепт домашних конфет “Коровка”, а ведь они были без начинок! Кстати, хотела еще указать на время подготовки, я люблю, чтобы конфеты были твердые и рассасывались, но если будете уваривать меньше, получите нежные сливочные \"коровки\" с кремовой начинкой. ");

        Text text6 = new Text();
        text6.setText("Со вкусом шоколада");

        Text text7 = new Text();
        text6.setText("Очень вкусно");

        Text text8 = new Text();
        text6.setText("Со вкусом клубники");

        Text text9 = new Text();
        text6.setText("Самый лучший вкус");

        Sweet karovka = new Sweet("Коровка", 100, 10, true, 200, 300, text1, bigText1, image);
        Iris detskyi = new Iris("Детский", 120, 15, false, 150, 250, text2, bigText2, image1);
        Iris prima = new Iris("Прима", 120, 10, false, 130, 150, text6, bigText6, image5);
        Marmelade dolki = new Marmelade("Дольки", 30, 7, false, 300, 70, text3, bigText3,image2);
        Marshmellow vanilnyi = new Marshmellow("Ванильный", 35, 9, true, 100, 100, text4, bigText4,image3);
        Marshmellow roshel = new Marshmellow("Рошель", 35, 9, true, 100, 100, text7, bigText7,image6);
        Marshmellow belorozovi = new Marshmellow("Бело-розовый", 35, 9, true, 100, 100, text8, bigText8,image7);
        Paste classic = new Paste("Классическая", 20, 5, false, 90, 150, text5, bigText5, image4);
        Paste vanilla = new Paste("Бело-розовая", 20, 5, false, 90, 150, text9, bigText9, image8);

        sweetsKrasnyiMozyryanin.add(karovka);
        irisesKrasnyiMozyryanin.add(detskyi);
        irisesKrasnyiMozyryanin.add(prima);
        marmeladesKrasnyiMozyryanin.add(dolki);
        marshmellowsKrasnyiMozyryanin.add(vanilnyi);
        marshmellowsKrasnyiMozyryanin.add(roshel);
        marshmellowsKrasnyiMozyryanin.add(belorozovi);
        pastesKrasnyiMozyryanin.add(classic);
        pastesKrasnyiMozyryanin.add(vanilla);

        productsKrasnyiMozyryanin = KrasnyiMozyryanin.getAllProductsNOFiltered();

        fabrics.add(KrasnyiMozyryanin);

        List<Sweet> sweetsKrasnyiMozyryanin1 = new ArrayList<>();
        List<Iris> irisesKrasnyiMozyryanin1 = new ArrayList<>();
        List<Marmelade> marmeladesKrasnyiMozyryanin1 = new ArrayList<>();
        List<Marshmellow> marshmellowsKrasnyiMozyryanin1 = new ArrayList<>();
        List<Paste> pastesKrasnyiMozyryanin1 = new ArrayList<>();
        ObservableList<Product> productsKrasnyiMozyryanin1 = FXCollections.observableArrayList();

        Fabric KrasnyiMozyryanin1 = new Fabric("Коммунарка", sweetsKrasnyiMozyryanin1, irisesKrasnyiMozyryanin1,
                marmeladesKrasnyiMozyryanin1, marshmellowsKrasnyiMozyryanin1,pastesKrasnyiMozyryanin1, productsKrasnyiMozyryanin1);

        File file111 = new File("recources/sweet1.jpg");
        Image image111 = new Image(file111.toURI().toString());

        File file11 = new File("C:/Users/kiannet/Desktop/pic1.jpg");
        Image image11 = new Image(file11.toURI().toString());

        File file21 = new File("C:/Users/kiannet/Desktop/pic2.jpg");
        Image image21 = new Image(file21.toURI().toString());

        File file31 = new File("C:/Users/kiannet/Desktop/pic3.jpg");
        Image image31 = new Image(file31.toURI().toString());

        File file41 = new File("C:/Users/kiannet/Desktop/pic4.jpg");
        Image image41 = new Image(file41.toURI().toString());

        Text text11 = new Text();
        text11.setText("Тягучие конфеты из сгущеного молока");

        Text text21 = new Text();
        text21.setText("Сливочный вкус детства");

        Text text31 = new Text();
        text31.setText("Сочные ароматные мармеладные дольки");

        Text text41 = new Text();
        text41.setText("Нежный вкус мягкого зефира");

        Text text51 = new Text();
        text51.setText("Мягкое нежно суфле");

        Text bigText11 = new Text();
        bigText11.setText("Конечно же, такой рецепт приготовления домашних конфет “Коровка” допускает ваши дополнения, можете добавить орешки, изюм, например. Я этого не делала, так как хотела показать вам классический рецепт домашних конфет “Коровка”, а ведь они были без начинок! Кстати, хотела еще указать на время подготовки, я люблю, чтобы конфеты были твердые и рассасывались, но если будете уваривать меньше, получите нежные сливочные \"коровки\" с кремовой начинкой. ");


        Text bigText21 = new Text();
        bigText21.setText("Конечно же, такой рецепт приготовления домашних конфет “Коровка” допускает ваши дополнения, можете добавить орешки, изюм, например. Я этого не делала, так как хотела показать вам классический рецепт домашних конфет “Коровка”, а ведь они были без начинок! Кстати, хотела еще указать на время подготовки, я люблю, чтобы конфеты были твердые и рассасывались, но если будете уваривать меньше, получите нежные сливочные \"коровки\" с кремовой начинкой. ");


        Text bigText31 = new Text();
        bigText31.setText("Конечно же, такой рецепт приготовления домашних конфет “Коровка” допускает ваши дополнения, можете добавить орешки, изюм, например. Я этого не делала, так как хотела показать вам классический рецепт домашних конфет “Коровка”, а ведь они были без начинок! Кстати, хотела еще указать на время подготовки, я люблю, чтобы конфеты были твердые и рассасывались, но если будете уваривать меньше, получите нежные сливочные \"коровки\" с кремовой начинкой. ");


        Text bigText41 = new Text();
        bigText41.setText("Конечно же, такой рецепт приготовления домашних конфет “Коровка” допускает ваши дополнения, можете добавить орешки, изюм, например. Я этого не делала, так как хотела показать вам классический рецепт домашних конфет “Коровка”, а ведь они были без начинок! Кстати, хотела еще указать на время подготовки, я люблю, чтобы конфеты были твердые и рассасывались, но если будете уваривать меньше, получите нежные сливочные \"коровки\" с кремовой начинкой. ");


        Text bigText51 = new Text();
        bigText51.setText("Конечно же, такой рецепт приготовления домашних конфет “Коровка” допускает ваши дополнения, можете добавить орешки, изюм, например. Я этого не делала, так как хотела показать вам классический рецепт домашних конфет “Коровка”, а ведь они были без начинок! Кстати, хотела еще указать на время подготовки, я люблю, чтобы конфеты были твердые и рассасывались, но если будете уваривать меньше, получите нежные сливочные \"коровки\" с кремовой начинкой. ");



        Sweet karovka1 = new Sweet("Коровка", 100, 10, true, 200, 300, text11, bigText11, image111);
        Iris detskyi1 = new Iris("Детский", 120, 15, false, 150, 250, text21, bigText21, image11);
        Marmelade dolki1 = new Marmelade("Дольки", 30, 7, false, 300, 70, text31, bigText31,image21);
        Marshmellow vanilnyi1 = new Marshmellow("Ванильный", 35, 9, true, 100, 100, text41, bigText41,image31);
        Paste classic1 = new Paste("Классическая", 20, 5, false, 90, 150, text5, bigText51, image41);

        sweetsKrasnyiMozyryanin1.add(karovka1);
        irisesKrasnyiMozyryanin1.add(detskyi1);
        marmeladesKrasnyiMozyryanin1.add(dolki1);
        marshmellowsKrasnyiMozyryanin1.add(vanilnyi1);
        pastesKrasnyiMozyryanin1.add(classic1);

        fabrics.add(KrasnyiMozyryanin1);

        Fabric spartak = new Fabric("Спартак", null, null, null, null, null, null);
        fabrics.add(spartak);


    }

    public static List<Fabric> getAllFabrics(){
        addEverythingForFabrics();
        return fabrics;
    }


}
