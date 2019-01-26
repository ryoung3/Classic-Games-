package com.ryoung3.classicgames.tictactoe;
import com.ryoung3.classicgames.tictactoe.TicTacToeBoard;
public class TicTacToe{

   

    public static void main(String[] args){


        // Starting point of the game
        System.out.println("Welcome ! \n Let's play Tic-Tac-Toe!");
        System.out.println("How many players are playing ?\n ");
        TicTacToeBoard board = new TicTacToeBoard();
        board.drawBoard();

    }
}