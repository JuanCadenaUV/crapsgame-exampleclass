package com.example.crapsgame.models;

public class Dice {

    private int value;

    //Metodo para obtener valor
    public int roll() {
        //"random" solo maneja valores de 0.0 a 1 cerrado, entonces ajustamos la operación para que nos de el valo deseado
        value = (int) (Math.random() * 6) + 1;
        return value;
    }

    public String getImagePath() {
        return "/com/example/crapsgame/images/dices/dice" + value + ".png";
    }

}
