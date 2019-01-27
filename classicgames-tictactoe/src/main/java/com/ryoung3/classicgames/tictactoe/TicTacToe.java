package com.ryoung3.classicgames.tictactoe;
import com.ryoung3.classicgames.tictactoe.TicTacToeBoard;
import java.util.Scanner;
public class TicTacToe{
    
        TicTacToeBoard board = new TicTacToeBoard();
   

    public static void main(String[] args){

        TicTacToe tictactoeGame = new TicTacToe();
        tictactoeGame.beginTicTacToe();

    }

    public void beginTicTacToe(){
        // Starting point of the game
        Scanner userInput = new Scanner(System.in);

       

        System.out.println("Welcome ! \n Let's play Tic-Tac-Toe!");
        System.out.println("How many players are playing ?\n ");
        
        int numOfPlayers = userInput.nextInt();

        // Single player play's against the robot
        // would be cool to add some machine learning
        // to make my robot REALLY competitive =) 

        if(numOfPlayers > 1){
            String player1;
            String player2;

            System.out.println("Please enter player 1 name: ");
            player1 = userInput.nextLine();

            System.out.println("Please enter player 2 name: ");
            player2 = userInput.nextLine();

            
        }
        else{
            String player1;

            System.out.println("Please enter player 1 name: ");
            player1 = userInput.nextLine();
        }
        
        userInput.close();
        board.drawBoard();
    }
}