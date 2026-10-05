package com.example.crapsgame.controllers;

import com.example.crapsgame.models.Dice;
import com.example.crapsgame.models.Player;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class GameController {

    private Player currentPlayer;

    @FXML
    private Label nickNameLabel;


    @FXML
    private ImageView diceImageView1;

    @FXML
    private ImageView diceImageView2;

    public Player getCurrentPlayer() {
        return currentPlayer;
    }

    //Obtenemos en nombre de usuario del WelcomeController y le decimos al metodo que lo muestre
    public void setCurrentPlayer(Player player) {
        this.currentPlayer = player;
        nickNameLabel.setText(this.currentPlayer.getNickname());
    }

    @FXML
    void onMouseClickedBtnDrop(MouseEvent event) {
        Dice dice1 = new Dice();
        dice1.roll();
        diceImageView1.setImage(new Image(
                getClass().getResourceAsStream(
                        dice1.getImagePath()))
        );

        Dice dice2 = new Dice();
        dice2.roll();
        diceImageView2.setImage(new Image(
                getClass().getResourceAsStream(
                        dice2.getImagePath()))
            );

    }



}
