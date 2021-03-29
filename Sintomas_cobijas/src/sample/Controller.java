package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;

public class Controller {
    @FXML CheckBox chbox1, chbox2, chbox3, chbox4, chbox5, chbox6, chbox7, chbox8;
    @FXML Label llblxd;
    @FXML protected void initialize (){

    }
    public void suma(ActionEvent event){
        int xd=0;
        if (chbox1.isSelected()){
            xd++;
        }
        if (chbox2.isSelected()){
            xd++;
        }
        if (chbox3.isSelected()){
            xd++;
        }
        if (chbox4.isSelected()){
            xd++;
        }
        if (chbox5.isSelected()){
            xd++;
        }
        if (chbox6.isSelected()){
            xd++;
        }
        if (chbox7.isSelected()){
            xd++;
        }
        if (chbox8.isSelected()){
            xd++;
        }
        if (xd<=4){
        llblxd.setText("Usted no tiene covid pero no olvide tomar las medidas de precaución");
        } else if (xd<=6){
            llblxd.setText("Usted probablemente tiene Covid vaya a checarse al médico para prevenir");
        }else {
            llblxd.setText("Posiblemente tenga Covid vaya con mucho cuidado a su médico más cercano");

        }

    }
}
