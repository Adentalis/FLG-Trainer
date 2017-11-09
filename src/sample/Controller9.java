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
    public Button b910_OneWorld,b911_Intro,b912_AGlobalSport,b913_AnInternetLifestyle,b914_PlayFair,b915_WorkingOnAProject,b916_FocusOnTechnologyAnsSociety;
    public boolean b911 = false;
    ArrayList<Button> activeButtonList = new ArrayList();
    boolean firstTime = false;


    String enableButton = "-fx-background-color: #e6f319";


    public void buttonPressed(ActionEvent actionEvent) {

        updateArrayList(((Button)actionEvent.getSource()));
      //  updateWordCounter();
        updateFrontEnd();

    /**    for(Button b : buttonList){
            if(b==((Button) actionEvent.getSource())){
                System.out.println(b.getId());
            }
        }


    /**    if(b911_Intro ==((Button) actionEvent.getSource())){
            if(b911==false){
                b911=true;
                System.out.println("in");
                b911_Intro.getStylesheets().add("/data/css/orange.css");
            }else{
                b911 = false;
                b911_Intro.getStylesheets().clear();
            }
        }
*/
    }

    private void updateFrontEnd() {


    }

    private void updateArrayList(Button source) {
        if (activeButtonList.contains(source)){
            System.out.println("Already in");
            activeButtonList.remove(source);
            source.getStylesheets().clear();

        }else{
            System.out.println("not in now added");
            activeButtonList.add(source);
            source.getStylesheets().add("/data/css/orange.css");
        }
    }



}
