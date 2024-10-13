package com.Vivek;

import java.util.*;

public class PlaySnakeAndLadder {
    public static void main(String[] args) {
        Dice dice = new Dice(1);
        Player player1 = new Player(1, "Vivek");
        Player player2 = new Player(2, "Kumar");

        Queue<Player> allPlayers = new LinkedList<>();
        allPlayers.offer(player1);
        allPlayers.offer(player2);

        Jumper snake1 = new Jumper(10, 2);
        Jumper snake2 = new Jumper(99, 12);

        List<Jumper> snakes = new ArrayList<>();
        snakes.add(snake1);
        snakes.add(snake2);

        Jumper ladder1 = new Jumper(5, 25);
        Jumper ladder2 = new Jumper(40, 89);

        List<Jumper> ladders = new ArrayList<>();
        ladders.add(ladder1);
        ladders.add(ladder2);

        Map<String, Integer> playerCurrentPosition = new HashMap<>();
        playerCurrentPosition.put(player1.getPlayerName(), 0);
        playerCurrentPosition.put(player2.getPlayerName(), 0);

        GameBoard gameBoard = new GameBoard(
                dice, allPlayers, snakes, ladders, playerCurrentPosition, 100
        );
        gameBoard.startGame();
    }
}