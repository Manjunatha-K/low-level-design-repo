package com.lld.LowLevelDesign.TicTacToe;

import com.lld.LowLevelDesign.TicTacToe.Model.*;
import org.antlr.v4.runtime.misc.Pair;
import org.springframework.beans.support.PagedListHolder;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TicTacToeGame {
    Deque<Player> players;
    Board gameBoard;

    public void InitilizeGame(){
        players = new LinkedList<>();

        PlayingPieceX crossPiece = new PlayingPieceX();
        Player player1 = new Player("Player1", crossPiece);

        PlayingPieceO noughtsPiece = new PlayingPieceO();
        Player player2 = new Player("Player2", noughtsPiece);

        players.add(player1);
        players.add(player2);

        gameBoard = new Board(3);
    }

    public String startGame(){
        boolean noWinner = true;
        while(noWinner){
            Player playerTurn = players.removeFirst();
            gameBoard.printBoard();
            List<Pair<Integer,Integer>> freeSpaces = gameBoard.getFreeCells();
            if(freeSpaces.isEmpty()){
                noWinner = false;
                continue;
            }

            System.out.println("Player: "+playerTurn.name+" Enter row & column");
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            String[] values = s.split(",");
            int inputRow = Integer.valueOf(values[0]);
            int inputColumn = Integer.valueOf(values[1]);

            boolean pieceAddedSuccessfully = gameBoard.addPiece(inputRow,inputColumn,playerTurn.playingPiece);
            if(!pieceAddedSuccessfully){
                System.out.println("Incorrect position chose , Please try again");
                players.addFirst(playerTurn);
                continue;
            }
            players.addLast(playerTurn);

            boolean winner = isThereWinner(inputRow,inputColumn,playerTurn.playingPiece.pieceType);
gameBoard.printBoard();
            if(winner){
                return playerTurn.name;
            }

        }
        return "tie";
    }

    private boolean isThereWinner(int inputRow, int inputColumn, PieceType playingPiece) {
        boolean rowMatch = true;
        boolean columnMatch = true;
        boolean diagonalMatch = true;
        boolean antiDiagonalMatch = true;

        for(int i =0;i< gameBoard.size;i++){
            if(gameBoard.board[inputRow][i] == null || gameBoard.board[inputRow][i].pieceType != playingPiece){
                rowMatch = false;
            }

        }
        for(int i =0;i< gameBoard.size;i++){
            if(gameBoard.board[i][inputColumn] == null || gameBoard.board[i][inputColumn].pieceType != playingPiece){
                columnMatch = false;
            }
        }
        for(int i =0, j =0;i< gameBoard.size;i++,j++){
            if(gameBoard.board[i][j] == null || gameBoard.board[i][j].pieceType != playingPiece){
                diagonalMatch = false;
            }
        }
        for(int i =0, j = gameBoard.size-1;i< gameBoard.size;i++,j--){
            if(gameBoard.board[i][j] == null || gameBoard.board[i][j].pieceType != playingPiece){
                antiDiagonalMatch = false;
            }
        }
      return rowMatch || columnMatch|| diagonalMatch || antiDiagonalMatch;
    }
}
