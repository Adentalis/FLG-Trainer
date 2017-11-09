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
    public boolean b911 = false;

    String enableButton = "-fx-background-color: #e6f319";


    public void buttonPressed(ActionEvent actionEvent) {
        Button btn = (Button)actionEvent.getSource();
        String buttonId = btn.getId();

        if(b911_Intro ==((Button) actionEvent.getSource())){
            if(b911==false){
                b911=true;
                System.out.println("in");
                //b911_Intro.setStyle(enableButton);

                b911_Intro.getStylesheets().add("/data/css/test.css");

                // b911_Intro.setStyle(t);
            }else{
                b911 = false;
                b911_Intro.getStylesheets().remove(0);
                b911_Intro.getStylesheets().add("/data/css/class.css");
            }
        }


        //Get the pressed Button and change it color
        //((Button) actionEvent.getSource()).setStyle(enableButton);



        System.out.println(buttonId);
    }



}
