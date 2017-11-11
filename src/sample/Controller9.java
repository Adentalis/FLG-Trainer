package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
//auf richtigen Import achten!!!
import javafx.event.ActionEvent;

import java.util.ArrayList;


/**
 * Created by daniel on 10.08.2017.
 */
public class Controller9 {

//TODO scrollpane geschwindigkeit erhöhen mit alt+6 todo tool öffnen

    @FXML
    public Button b910_OneWorld, b911_Intro, b912_AGlobalSport, b913_AnInternetLifestyle, b914_PlayFair, b915_WorkingOnAProject, b916_FocusOnTechnologyAnsSociety;
    public Button b920_FromSchoolToWork, b921_Intro, b922_LookingForward, b923_APersonalStatement, b924_ApplyingForAJob, b925_JonMakesADescision;
    public Button bstart;

    ArrayList<Button> activeButtonList = new ArrayList();
    ArrayList<Button> unit1 = new ArrayList();
    ArrayList<Button> unit2 = new ArrayList();
    ArrayList<Button> unit3 = new ArrayList();
    ArrayList<Button> unit4 = new ArrayList();
    ArrayList<Button> unit5 = new ArrayList();

    boolean firstTime = true;
    //wird gebraucht in derupdatearraylist method um zu sagen zu welchem unit der oberbutton gehört
    int unit;


    String enableButton = "-fx-background-color: #e6f319";


    public void buttonPressed(ActionEvent actionEvent) {
        if (firstTime) {
            initData();
            firstTime = false;
        }

        updateArrayList(((Button) actionEvent.getSource()));
        //  updateWordCounter();

    }

    private void updateArrayList(Button source) {
        //Wenn der Button zum ersten mal angecklickt wird wird er in die activButtonList eingefügt, ansonsten herausgenommen.
        switch (source.getId()) {
            case "b910_OneWorld":
                System.out.println("fd");
                //wenn alles bereits aktiv ist, sollen alle buttons deaktiviert werden,
                //else - wenn eins fehlt dann alle aktivieren + den oberbutton selbst
                unit = 1;
                if (checkAllClicked(unit))
                    removeFromList(unit);
                else
                    addToList(unit);
                break;
            case "b920_FromSchoolToWork":

                System.out.println("jefsdof");
                unit =2;
                if (checkAllClicked(unit))
                    removeFromList(unit);
                else
                    addToList(unit);
                break;
            default:
                //TODO wenn ein normaler button geclickt wird überprüfe ob nun alle ausgewählt sind und de/aktiviere Oberbutton
                if (activeButtonList.contains(source)) {
                    activeButtonList.remove(source);
                    source.getStylesheets().clear();

                } else {
                    activeButtonList.add(source);
                    source.getStylesheets().add("/data/css/orange.css");
                }
                break;

        }

    }

    private void addToList(int unit) {
        //TODO rest noch
        switch(unit){
            case 1 :
                for(Button b : unit1){
                    if(!activeButtonList.contains(b))
                        activeButtonList.add(b);
                    b.getStylesheets().add("/data/css/orange.css");
                }
                break;
            case 2:
                for(Button b : unit2){
                    if(!activeButtonList.contains(b))
                        activeButtonList.add(b);
                    b.getStylesheets().add("/data/css/orange.css");
                }
                break;
        }

    }

    private void removeFromList(int unit) {
        //TODO noch für die anderen units erstellen
        switch (unit) {
            case 1:
                for (Button b : unit1) {
                    activeButtonList.remove(b);
                    b.getStylesheets().clear();
                }
                break;
            case 2:
                for (Button b : unit2) {
                    activeButtonList.remove(b);
                    b.getStylesheets().clear();
                }

                break;
            case 3:

                break;
            case 4:

                break;
            case 5:

        }

    }

    private boolean checkAllClicked(int unit) {
        //TODO noch für die anderen units
        switch (unit) {
            case 1:
                for (Button b : unit1) {
                    if (!activeButtonList.contains(b))
                        return false;
                }
                return true;
            case 2:
                for (Button b : unit2) {
                    if (!activeButtonList.contains(b))
                        return false;
                }
                return true;
            default:
                System.out.println("Das sollte nie kommen");
        }
        return false;
    }

    private void initData() {
        unit1.add(b911_Intro);
        unit1.add(b912_AGlobalSport);
        unit1.add(b913_AnInternetLifestyle);
        unit1.add(b914_PlayFair);
        unit1.add(b915_WorkingOnAProject);
        unit1.add(b916_FocusOnTechnologyAnsSociety);
        unit2.add(b921_Intro);
        unit2.add(b922_LookingForward);
        unit2.add(b923_APersonalStatement);
        unit2.add(b924_ApplyingForAJob);
        unit2.add(b925_JonMakesADescision);
    }

    public void startGame(ActionEvent actionEvent) {
        for(Button b : activeButtonList){
            System.out.println(b.getId());
        }
    }
}




