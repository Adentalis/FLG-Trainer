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
    ArrayList<Button> activeButtonList= new ArrayList();
    ArrayList<Button> unit1= new ArrayList();
    ArrayList<Button> unit2= new ArrayList();
    ArrayList<Button> unit3= new ArrayList();
    ArrayList<Button> unit4= new ArrayList();
    ArrayList<Button> unit5= new ArrayList();

    boolean firstTime = true;


    String enableButton = "-fx-background-color: #e6f319";


    public void buttonPressed(ActionEvent actionEvent) {
        if (firstTime) {
            //initData();
            firstTime = false;
        }

        updateArrayList(((Button) actionEvent.getSource()));
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

    private void initData() {
        unit1.add(b911_Intro);
        unit1.add(b912_AGlobalSport);
        unit1.add(b913_AnInternetLifestyle);
        unit1.add(b914_PlayFair);
        unit1.add(b915_WorkingOnAProject);
        unit1.add(b916_FocusOnTechnologyAnsSociety);

    }

    private void updateFrontEnd() {

    }

    private void updateArrayList(Button source) {
        //Wenn der Button zum ersten mal angecklickt wird wird er in die activButtonList eingefügt, ansonsten herausgenommen.

        switch (source.getId()) {
            case "b910_OneWorld":
                if ( true) {
                    activeButtonList.remove(b911_Intro);
                    activeButtonList.remove(b912_AGlobalSport);
                    activeButtonList.remove(b913_AnInternetLifestyle);
                    activeButtonList.remove(b914_PlayFair);
                    activeButtonList.remove(b915_WorkingOnAProject);
                    activeButtonList.remove(b916_FocusOnTechnologyAnsSociety);
                    b911_Intro.getStylesheets().clear();
                    b912_AGlobalSport.getStylesheets().clear();
                    b913_AnInternetLifestyle.getStylesheets().clear();
                    b914_PlayFair.getStylesheets().clear();
                    b915_WorkingOnAProject.getStylesheets().clear();
                    b916_FocusOnTechnologyAnsSociety.getStylesheets().clear();

                }

                break;
            default:
                if (activeButtonList.contains(source)) {
                    System.out.println("Already in");
                    activeButtonList.remove(source);
                    source.getStylesheets().clear();

                } else {
                    System.out.println("not in now added");
                    activeButtonList.add(source);
                    source.getStylesheets().add("/data/css/orange.css");
                }
                break;

        }

    }

    private boolean checkAllClicked() {
        return activeButtonList.contains(b911_Intro) && activeButtonList.contains(b912_AGlobalSport) &&
                activeButtonList.contains(b913_AnInternetLifestyle) && activeButtonList.contains(b914_PlayFair) &&
                activeButtonList.contains(b915_WorkingOnAProject) && activeButtonList.contains(b916_FocusOnTechnologyAnsSociety);
    }
}



