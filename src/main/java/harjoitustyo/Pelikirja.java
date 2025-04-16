package harjoitustyo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.util.Random;

public class Pelikirja extends Application {

    Image houseRollComeback = new Image("C:\\Users\\kaisu\\harjoitustyo\\target\\house roll comeback.png");
    Image houseStretchLeftReverseRight = new Image("C:\\Users\\kaisu\\harjoitustyo\\target\\house stretch lt reverse right.png");
    Image houseStretchLeftReverseRightPass = new Image("C:\\Users\\kaisu\\harjoitustyo\\target\\house stretch lt reverse right pass.png");
    Image aceLoopFloodSLeak = new Image("C:\\Users\\kaisu\\harjoitustyo\\target\\ace loop flood s leak.png");
    Image aceDriftMesh = new Image("C:\\Users\\kaisu\\harjoitustyo\\target\\ace drift mesh.png");
    Image bunchRightDriftSpot = new Image("C:\\Users\\kaisu\\harjoitustyo\\target\\bunch rt drift spot.png");
    Image bunchRightSlideFlashVerts = new Image("C:\\Users\\kaisu\\harjoitustyo\\target\\bunch rt slide flash verts.png");
    Image bunchRightStretchLeftBootRightFlood = new Image("C:\\Users\\kaisu\\harjoitustyo\\target\\bunch rt stretch lt boot right flood.png");
    Image bunchLeftSlideMesh = new Image("C:\\Users\\kaisu\\harjoitustyo\\target\\bunch lt slide mesh.png");
    Image stackLeftFlashSlideSwitchVerts = new Image("C:\\Users\\kaisu\\harjoitustyo\\target\\stack lt flash slide switch verts.png");
    Image stackLeftTightSlideSpot = new Image("C:\\Users\\kaisu\\harjoitustyo\\target\\stack lt tight slide spot.png");
    Image stackRightStretchLeftBootSmash = new Image("C:\\Users\\kaisu\\harjoitustyo\\target\\stack rt stretch lt boot rt smash.png");
    Image trioLeftLinSlideVerts = new Image("C:\\Users\\kaisu\\harjoitustyo\\target\\trio lt L-in slide verts.png");
    Image trioLeftSlideStick = new Image("C:\\Users\\kaisu\\harjoitustyo\\target\\trio lt slide stick.png");
    Image trioRightRinDriftMesh = new Image("C:\\Users\\kaisu\\harjoitustyo\\target\\trio rt r-in drift mesh.png");
    Image wingLeftDuoLeftBootRightRwhip = new Image("C:\\Users\\kaisu\\harjoitustyo\\target\\wing lt duo lt boot right r-whip.png");
    Image wingRightSlideFlashVerts = new Image("C:\\Users\\kaisu\\harjoitustyo\\target\\wing rt slide flash verts.png");

    //tekstikenttä johon arvataan
    TextField textField = new TextField();
    //käyttäjän arvaus eli tekstikenttään syötetty teksti
    String arvaus = textField.getText();

    //tekstikentän otsikko
    Label arvaaTahan = new Label("Mikä peli on kyseessä?");
    //vboxilla asetellaan otsikko ja tekstikenttä päällekkäin
    VBox vBox = new VBox(arvaaTahan, textField);

    //boolean-muuttuja vertailuun
    boolean oikeinArvattu = arvaus.equals(getNimi());
    //täällä meillä on taas periytymisongelma,
    // pitäiskö nää kaikki laittaa samaan luokkaan ettei tätä olis?

    /**
     * tää pitää yrittää yhdistää listatietojen kanssa: jos textField menee oikein,
     * halutaan, että näkyy PELIN NIMI vihreällä, jos väärin
     * halutaan se punaisella
     * joka tapauksessa "oikein/väärin" palaute on oppimisen kannalta turha
     */
    //palaute siitä, oliko textField oikein
    Label palaute = new Label("");



    //eli tähän if (textField != null && textField.equals(listatiedot.getNimi())
    //{ palaute.setText(getNimi())
    //palaute.setTextFill(Color.GREEN)
    //} else {
    //palaute.setText(getNimi())
    //palaute.setTextFill(Color.GREEN)
    //}

    //kuvanpaikka
    ImageView kuvanpaikka = new ImageView(houseRollComeback);

    public void ArvotaanKuva() {

        //lasketaan random int 0-17
        Random random = new Random();
        int randomNumber = random.nextInt(18);

        if (randomNumber == 0) {
            kuvanpaikka.setImage(houseStretchLeftReverseRight);
        }

        else if (randomNumber == 1) {
            kuvanpaikka.setImage(houseStretchLeftReverseRightPass);
        }

        else if (randomNumber == 2) {
            kuvanpaikka.setImage(aceLoopFloodSLeak);
        }

        else if (randomNumber == 3) {
            kuvanpaikka.setImage(aceDriftMesh);
        }

        else if (randomNumber == 4) {
            kuvanpaikka.setImage(bunchLeftSlideMesh);
        }

        else if (randomNumber == 5) {
            kuvanpaikka.setImage(bunchRightDriftSpot);
        }

        else if (randomNumber == 6) {
            kuvanpaikka.setImage(bunchRightSlideFlashVerts);
        }

        else if (randomNumber == 7) {
            kuvanpaikka.setImage(bunchRightStretchLeftBootRightFlood);
        }
    }

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        //pohja
        BorderPane pohja = new BorderPane();

        //kutsutaan metodia
        ArvotaanKuva();

        //lisätään kuva pohjaan
        pohja.setCenter(kuvanpaikka);
        pohja.setBottom(vBox);
        pohja.setTop(palaute);

        //kehys
        Scene kehys = new Scene(pohja,800,500);
        primaryStage.setTitle("Arvaa peli");
        primaryStage.setScene(kehys);
        primaryStage.show();
        
    }

    public boolean isOikeinArvattu() {
        return oikeinArvattu;
        palaute.setText(getNimi);
        palaute.setTextFill(Color.GREEN);
        palaute.setStyle("-fx-font-size: 15px;"); // suurenna
        //tallenna tulos tiedostoon myös tähän
        //joku rakenne millä katsotaan, onko lista käyty kokonaan läpi
        //jos on niin System.out.println(tiedosto);
    }


}
