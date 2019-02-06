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
        char letter;
       

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
            System.out.println("Please choose a letter: X,O or whatever you want " + player1);
            letter = userInput.nextLine().charAt(0);
            Player _1stPlayer = new Player(player1,letter);

            System.out.println("Please enter player 2 name: ");
            player2 = userInput.nextLine();
            System.out.println("Please choose a letter: X,O or whatever you want " + player2);
            letter = userInput.nextLine().charAt(0);
            Player _2ndPlayer = new Player(player2,letter);
            
            
        }
        else{
            String player1;

            System.out.println("Please enter player 1 name: ");
            player1 = userInput.nextLine();
            System.out.println("Please choose a letter: X,O or whatever you want " + player1);
            letter = userInput.nextLine().charAt(0);
            Player _1stPlayer = new Player(player1,letter);
        }
        
        userInput.close();
        board.drawBoard();
    }
}