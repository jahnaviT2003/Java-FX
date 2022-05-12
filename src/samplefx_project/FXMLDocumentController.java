/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samplefx_project;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;

/**
 *
 * @author 91630
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Button button;
    
    @FXML
    private Button sub;
    
    @FXML
    private Button mul;
    
    @FXML
    private Button div;

    @FXML
    private Label label;

    @FXML
    private TextField num1;

    @FXML
    private TextField num2;

    @FXML
    void addition(ActionEvent event) {
        int n1 = Integer.parseInt(num1.getText());
        int n2 = Integer.parseInt(num2.getText());
        int sum = n1 + n2;
        JOptionPane.showMessageDialog(null, "Sum of the Numbers :   "+sum);

    }
    
    @FXML
    void subtraction(ActionEvent event) {
        int n1 = Integer.parseInt(num1.getText());
        int n2 = Integer.parseInt(num2.getText());
        int sub = n1 - n2;
        JOptionPane.showMessageDialog(null, "Subtraction of the Numbers :   "+sub);

    }
    
    @FXML
    void multiplication(ActionEvent event) {
        int n1 = Integer.parseInt(num1.getText());
        int n2 = Integer.parseInt(num2.getText());
        int mul = n1 * n2;
        JOptionPane.showMessageDialog(null, "Multiplication of the Numbers :   "+mul);

    }
    
    @FXML
    void division(ActionEvent event) {
        int n1 = Integer.parseInt(num1.getText());
        int n2 = Integer.parseInt(num2.getText());
        float div = n1 / n2;
        JOptionPane.showMessageDialog(null, "Division of the Numbers :   "+div);

    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
