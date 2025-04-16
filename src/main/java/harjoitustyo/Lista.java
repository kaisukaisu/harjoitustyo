package harjoitustyo;

import javafx.application.Application;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 * Luokka sijoittaa kuvat linkitettyyn listaan
 * listan iteroimisella varmistetaan, että kaikki kuvat on käyty läpi kerran
 */
public class Lista extends Application {

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

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        ListView<Listatiedot> listView = new ListView<>();

        //listätään tietoja
        listView.getItems().addAll(
                new Listatiedot(1, "ace drift mesh", aceDriftMesh),
                new Listatiedot(2, "ace loop flood s leak", aceLoopFloodSLeak),
                new Listatiedot(3, "bunch lt slide mesh", bunchLeftSlideMesh),
                new Listatiedot(4, "bunch rt drift spot", bunchRightDriftSpot),
                new Listatiedot(5, "bunch rt slide flash verts", bunchRightSlideFlashVerts),
                new Listatiedot(6, "bunch rt stretch lt boot right flood", bunchRightStretchLeftBootRightFlood)

        );


    }
}
