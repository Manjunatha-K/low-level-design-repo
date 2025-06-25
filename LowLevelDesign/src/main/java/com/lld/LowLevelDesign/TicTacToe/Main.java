package com.lld.LowLevelDesign.TicTacToe;

public class Main {
    public static void main(String[] args) {
        TicTacToeGame game = new TicTacToeGame();
        game.InitilizeGame();
        System.out.println("Game Winner is : "+ game.startGame());
    }
}
