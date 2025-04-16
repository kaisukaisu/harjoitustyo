package harjoitustyo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Pelikirja extends Application {

    Image houseRollComeback = new Image("file:/C:/path_to_image/house-roll-comeback.png");


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        //pohja
        BorderPane pohja = new BorderPane();

        //kuvanpaikka
        ImageView kuvanpaikka = new ImageView(houseRollComeback);

        //lisätään kuva pohjaan
        pohja.setCenter(kuvanpaikka);

        //kehys
        Scene kehys = new Scene(pohja,650,300);
        primaryStage.setTitle("Liput esillä");
        primaryStage.setScene(kehys);
        primaryStage.show();
        
    }
}
