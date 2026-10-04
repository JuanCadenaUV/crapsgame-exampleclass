package com.example.crapsgame.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class WelcomeController {

    @FXML
    private TextField textFieldNickname;

    //Aquí se implemento el controlador del evento "Click on mouse"
    @FXML
    void onMouseClickedBtnStart(MouseEvent event) {
        //Cuando se presiona el bóton (evento) obtenemos lo que hay en el cuadro de texto
        String nickName = textFieldNickname.getText();
        System.out.println("Click en el bóton Iniciar");
        System.out.println("Hello " + nickName);
    }

}
