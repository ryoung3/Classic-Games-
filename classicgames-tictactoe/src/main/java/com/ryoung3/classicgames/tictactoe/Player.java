package com.ryoung3.classicgames.tictactoe;

public class Player{

    public String firstName;
    private char letter;

    public Player(String firstName, char letter){
        this.firstName = firstName;
        this.letter = letter;
    }

    public String getName(){
        return this.firstName;
    }

    public char getLetter(){
        return this.letter;
    }
}