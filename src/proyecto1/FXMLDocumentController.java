/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

import java.net.URL;
import java.util.LinkedList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;

/**
 *
 * @author daniela.perea
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label nombre;
    @FXML
    private Label codigo4;
    @FXML
    private TextField nombretxt;
    @FXML
    private TextField codigotxt;
    
    LinkedList<persona> listaE;
    
    
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        
         String nombre1= nombretxt.getText();
         String codigo1= codigotxt.getText();
        
         persona objE = new persona (nombre1,codigo1);
         boolean ss=listaE.add(objE);
         if(ss){
             nombretxt.setText("");
             codigotxt.setText("");
         }
         
    }
    
    @FXML
     private void handleButtonAction1(ActionEvent event) {
         
         String mostrar = "";
         
         for(int i = 0; i< listaE.size(); i++){
             mostrar += listaE.get(i)+"\n";
         }
         
        JOptionPane.showMessageDialog(null, mostrar);
     }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    
}
