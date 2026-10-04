package com.example.crapsgame;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;


public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        stage.setTitle("Game");

        /*
        //FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Game-view.fxml"));
        //Scene scene = new Scene(fxmlLoader.load(), 320, 240);

        //Stage representa una ventana emergente donde se pondrá el contenido

        //Tittle (Titulo)
        stage.setTitle("Hello!");

        //Layauts (Contenedores)
        VBox root = new VBox(); //Contenedor raíz

        //(Etiqueta)
        Label lblWelcome = new Label("Welcome to Craps!");
        root.getChildren().add(lblWelcome);

        //Scene (Escena) Debe tener un nodo principal, que es un contenedor. Manejo de nodos
        Scene scene =new Scene(root, 200,200);
        stage.setScene(scene);
        stage.show();

         */
        //Ahora haremos lo mismo con JavaFX

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Game-view.fxml"));
        //No podemos hacer directamente VBox root = fmlLoader.load();
        //Parent es la clase papá del contenedor
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();
    }
}
