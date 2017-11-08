package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
//auf richtigen Import achten!!!
import javafx.event.ActionEvent;



/**
 * Created by daniel on 10.08.2017.
 */
public class Controller9 {

//TODO scrollpane geschwindigkeit erhöhen mit alt+6 todo tool öffnen

    @FXML
    public Button b910_OneWorld,b911_Intro,b912_AGlobalSport,b913_AnInternetLifestyle,b914_PlayFair,b915_WorkingOnAProject,b916_FocusOnTechnologyAnsSociety;


    String enableButton = "-fx-background-color: #e6f319";


    public void buttonPressed(ActionEvent actionEvent) {
        System.out.println(actionEvent.getSource().toString());
    }

}
