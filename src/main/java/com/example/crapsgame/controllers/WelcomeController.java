package com.example.crapsgame.controllers;

import com.example.crapsgame.models.AlertBox;
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

        //Cramos una instancia del alertBox
        AlertBox alertBox = new AlertBox();
        boolean response = alertBox.showConfirmBox(
                "¿Iniciar Juego?",
                "Hola " + nickName,
                "¿" + nickName + ", deseas iniciar una partida?");

        if (response == true) {
            System.out.println("Nueva partida de " + nickName);
        }
        //System.out.println("Click en el bóton Iniciar");
        //System.out.println("Hello " + nickName);

    }

}
