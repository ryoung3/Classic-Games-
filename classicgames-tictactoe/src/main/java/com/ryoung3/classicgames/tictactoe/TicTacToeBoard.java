package com.ryoung3.classicgames.tictactoe;

public class TicTacToeBoard{

   // private char[][] charBoard = new char[3][3];
    public TicTacToeBoard(){
        // empty constructor
    }
    public void drawBoard(){
        /*
             
                 |     |     
             - - - - - - - -
                 |     |     
             - - - - - - - -
                 |     |
             
        */
        System.out.println("    |     |     ");
        System.out.println("- - - - - - - -");
        System.out.println("    |     |     ");
        System.out.println("- - - - - - - -");
        System.out.println("    |     |     ");
      
    }
    
}