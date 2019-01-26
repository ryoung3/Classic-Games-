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

    public Boolean checkForWinner(char letter){
       // check for horizontal win
        for(int row = 0; row < 3; row++){
            if(charBoard[row][0] == letter && charBoard[row][1] == letter && charBoard[row][2] == letter) return true;
        }
        
        // check for vertical win
        for(int column = 0; column < 3; column++){
            if(charBoard[0][column] == letter && charBoard[1][column] == letter && charBoard[2][column] == letter) return true;
        }
       

        // check for diagonal win
        if(charBoard[0][0] == letter && charBoard[1][1] == letter && charBoard[2][2] == letter) return true;
        if(charBoard[0][2] == letter && charBoard[1][1] == letter && charBoard[2][0] == letter) return true;
         
        
         return false;
    }

    public Boolean checkForTie(){
        
        for(int row = 0; row < charBoard.length; row++){
            for(int column = 0; column < charBoard[row].length; column++){
                if(Character.isWhitespace(charBoard[row][column])) return false;
            }
        }
        
        return true;
    }
    
    
}