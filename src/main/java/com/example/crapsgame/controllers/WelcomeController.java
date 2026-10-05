package com.example.crapsgame.controllers;

import com.example.crapsgame.models.AlertBox;
import com.example.crapsgame.models.Player;
import com.example.crapsgame.views.GameView;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class WelcomeController {

    @FXML
    private TextField textFieldNickname;

    //Aquí se implemento el controlador del evento "Click on mouse"
    @FXML
    void onMouseClickedBtnStart(MouseEvent event) {
        //Cuando se presiona el bóton (evento) obtenemos lo que hay en el cuadro de texto
        String nickName = textFieldNickname.getText();

        if (nickName.isEmpty()) {
            AlertBox alertBox = new AlertBox();
            alertBox.showAlertBox(
                    "Craps Game - Nombre de Usuario",
                    "Nombre de Usuario",
                    "Debes diligenciar tu nombre de usuario"
            );
        }

        Player player = new Player();
        player.setNickname(nickName);

        //En la siguiente sección del código aseguramos que se mantenga la ventana emergente abierta y no se creen otras instancias
        GameView gameView = null;
        try {
            gameView = GameView.getInstance();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        gameView.getGameController().setCurrentPlayer(player);
        /*Forma alternativa
        GameController gameController = gameView.getGameController();
        gameController.setCurrentPlayer(player);
        */
        gameView.show();

        //Para minimizar la escena del WelcomeView
        textFieldNickname.getScene().getWindow().hide();

        //Cramos una instancia del alertBox

        /*
        AlertBox alertBox = new AlertBox();

        boolean response = alertBox.showConfirmBox(
                "¿Iniciar Juego?",
                "Hola " + nickName,
                "¿" + nickName + ", deseas iniciar una partida?");

        if (response == true) {
            System.out.println("Nueva partida de " + nickName);
        }
         */

        //System.out.println("Click en el bóton Iniciar");
        //System.out.println("Hello " + nickName);

    }

}
