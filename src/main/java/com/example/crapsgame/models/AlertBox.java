package com.example.crapsgame.models;

import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;

import java.util.Optional;

public class AlertBox implements AlertBoxInterface {
    @Override
    //Al realizar una confirmación se espera que el usuario escoja entre "Ok" y "CANCEL" para realizar una acción por tanto retorna un Boolean y no un Void
    public boolean showConfirmBox(String title, String header, String message) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle(title);
        alert.setHeaderText(header);
        alert.setContentText(message);
        Optional<ButtonType> response = alert.showAndWait();

        //Si realmente tenemos una respuesta y esa respuesta es OK, arroje True; Es lo que significa la siguiente linea
        if (response.isPresent() && response.get() == ButtonType.OK) {
            return true;
        }
        return false;
    }

    @Override
    public void showAlertBox(String title, String header, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(header);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
