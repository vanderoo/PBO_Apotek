/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apotek_pbo;

import javax.swing.*;
import javax.swing.text.*;

/**
 *
 * @author vander
 */
public class FormAlert {
    
    private JPasswordField varPasswordInput ;
    private JTextField varTextInput;
    private JLabel varLabel;
    private JLabel alertLabel;
    private int alert;
    
    public FormAlert(JPasswordField varPasswordInput, JLabel alertLabel){
        this.varPasswordInput = varPasswordInput;
        this.alertLabel = alertLabel;
        this.alert = 0;
    }
    public FormAlert(JTextField varTextInput, JLabel varLabel, JLabel alertLabel){
        this.varTextInput = varTextInput;
        this.varLabel = varLabel;
        this.alertLabel = alertLabel;
        this.alert = 1;
    }
    
    public void showAlert(){
        if(this.alert == 0){
            if(this.varPasswordInput.getText().trim().isEmpty()){
                this.varPasswordInput.setText("");
                this.alertLabel.setText("Password tidak boleh kosong");
            } 
        }else{
            if(this.varTextInput.getText().trim().isEmpty()){
                this.varTextInput.setText("");
                this.alertLabel.setText(this.varLabel.getText() +" tidak boleh kosong mas");
            }            
        }
    
    }
    
}
