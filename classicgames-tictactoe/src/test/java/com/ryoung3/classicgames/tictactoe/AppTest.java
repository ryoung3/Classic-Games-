package com.ryoung3.classicgames.tictactoe;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Before
static void setup() {
    TicTacToe TTTgame = new TicTacToe();
    TicTacToeBoard gameBoard = new TicTacToeBoard();
    Player player1 = new Player("Bobby", 'X');
    Player player2 = new Player("Blair", 'O');
}

    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

     @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
}
