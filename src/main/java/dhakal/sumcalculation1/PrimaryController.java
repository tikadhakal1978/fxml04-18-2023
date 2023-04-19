package dhakal.sumcalculation1;


import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    Button button1;
    @FXML
    TextField input1;
    @FXML
    TextField input2;
    @FXML
    Label label1;
    
    
   
    
    @FXML
    private void handleShowMessageButton() {
        int sum =0;
        String ip1= input1.getText();
        String ip2 = input2.getText();
        sum= Integer.parseInt(ip1)+Integer.parseInt(ip2);
        label1.setText(Integer.toString(sum)); 
       
        
    }
}
