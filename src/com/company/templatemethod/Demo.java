package com.company.templatemethod;

abstract class Game {
    protected int currentPlayer;
    protected final int numberOfPlayers;

    protected Game(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }
    
    public void run(){
        start();
        while(!haveWinner()){
            takeTurn();
        }
        System.out.println("Player " + getWinnerPlayer() + " wins");
    }

    protected abstract int getWinnerPlayer();

    protected abstract void takeTurn();

    protected abstract void start();

    protected abstract boolean haveWinner();
}

class Chess extends Game{

    protected int maxTurns=10;
    protected  int currentTurn = 1;

    protected Chess() {
        super(2);
    }

    @Override
    protected int getWinnerPlayer() {
        return 0;
    }

    @Override
    protected void takeTurn() {
        System.out.println("Turn "+ (currentTurn++) + " taken by the player " + currentPlayer );
    }

    @Override
    protected void start() {
        System.out.println("start a game of chess");
    }

    @Override
    protected boolean haveWinner() {
        return maxTurns==currentTurn;
    }
}




public class Demo {
    public static void main(String[] args) {
        Chess chess = new Chess();
        chess.run();
    }

}
