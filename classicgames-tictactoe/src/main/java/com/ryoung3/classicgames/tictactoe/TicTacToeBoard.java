package com.ryoung3.classicgames.tictactoe;

import java.util.HashMap;

public class TicTacToeBoard{

    private char[][] charBoard = new char[3][3];
    private HashMap<Integer,Integer> nonEmptySlot = new HashMap<>();
    public TicTacToeBoard(){
        // empty constructor
    }
    public void drawBoard(){
     String drawDashes = "_ _ _ _ _ _ _ _";
     String drawSeperators = "|";

     for(int row = 0; row < charBoard.length; row++){
         for(int column = 0; column < charBoard[row].length; column++){
             System.out.println(charBoard[row][column] + " " + drawSeperators);
         }
         System.out.println(drawDashes);
        }
      
    }

    public void checkSlot(int row, int column, char letter){
        char slot = charBoard[row][column];
        if(Character.isWhitespace(slot) == true){
            System.out.println("This slot is already filled. Please choose another slot. ");
        }
        else{
            fillInSlot(row, column, letter);
        }
    }

    public void fillInSlot(int row, int column, char letter){
        charBoard[row][column] = letter;
        drawBoard();
    }

    public Boolean checkForWinner(){

        // check for vertical win
        return false;
    }
    
}