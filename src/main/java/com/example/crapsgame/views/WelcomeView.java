package com.example.crapsgame.views;

import com.example.crapsgame.HelloApplication;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

//Ventana de bienvenida del juego
//La clase con el comando "extends Stage" hereda los comportamientos y atributos de la ventana
public class WelcomeView extends Stage {

    //Constructor
    public WelcomeView() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(
                getClass().getResource("/com/example/crapsgame/Welcome-view.fxml")
        );
        //No podemos hacer directamente VBox root = fmlLoader.load();

        //Parent es la clase papá del contenedor
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root);

        //This se refiere a la misma clase ya que "setScene()" es un metodo propio de Stage
        //También puede solo llamar al metodo sin el "this" ya que es una herencia
        setTitle("Craps Game - Bienvenido");
        this.setScene(scene);
        //No permite cambiar de tamaño
        setResizable(false);
    }

    //Con el siguiente metodo se fija en que solo se va a crear una sola instancia WelcomeView y no varias
    public static WelcomeView getInstance() throws IOException {
        if (WelcomeViewHolder.INSTANCE == null) {
            WelcomeViewHolder.INSTANCE = new WelcomeView();
        }
        return WelcomeViewHolder.INSTANCE;
    }

    //El "static" vuelve a un atributo o metodo solo de la clase
    //"Holder" es normal de las clases con singleton
    private static class WelcomeViewHolder {
        private static WelcomeView INSTANCE = null;
    }
}
