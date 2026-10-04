package com.example.crapsgame;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
//Import a library to manage the buttons (Importar una libreria para gestionar los botones)
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;


public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        stage.setTitle("Game");

        //FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Game-view.fxml"));
        //Scene scene = new Scene(fxmlLoader.load(), 320, 240);

        //Stage representa una ventana emergente donde se pondrá el contenido

        /*
        //Tittle (Titulo)
        stage.setTitle("Hello!");

        //Layauts (Contenedores)
        VBox root = new VBox(); //Contenedor raíz

        //(Etiqueta)
        Label lblWelcome = new Label("Welcome to Craps!");

        //También lo podemos realizar con una etiqueta

        lblWelcome.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                System.out.println("Hello from Label");
                System.out.println(event.getSource());
                System.out.println(event.getTarget());
                System.out.println(event.getEventType());
            }
        });

        root.getChildren().add(lblWelcome);

        //Instantiate a new button (Instanciar un nuevo botón)
        Button btnHello = new Button("Click Here");
        //El siguiente metodo crea una instancia del evento y se la pasa al handle para que él haga la lógica que se quiere
        btnHello.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                System.out.println("Hello World!");
                System.out.println(event.getSource());
                System.out.println(event.getTarget());
                System.out.println(event.getEventType());
            }
        });

        //Add to layaut (Lo agregamos al contenedor)
        root.getChildren().add(btnHello);

        //Scene (Escena) Debe tener un nodo principal, que es un contenedor. Manejo de nodos
        Scene scene =new Scene(root, 200,200);
        stage.setScene(scene);
        stage.show();

         */


        //Ahora haremos lo mismo con JavaFX

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Welcome-view.fxml"));
        //No podemos hacer directamente VBox root = fmlLoader.load();

        //Parent es la clase papá del contenedor
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();


    }
}
